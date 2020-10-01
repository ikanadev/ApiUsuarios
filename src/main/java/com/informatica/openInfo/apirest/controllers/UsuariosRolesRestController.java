package com.informatica.openInfo.apirest.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.informatica.openInfo.apirest.models.Rol;
import com.informatica.openInfo.apirest.models.Usuario;
import com.informatica.openInfo.apirest.models.UsuarioRol;
import com.informatica.openInfo.apirest.models.embedKeys.UsuarioRolKey;
import com.informatica.openInfo.apirest.services.IRolService;
import com.informatica.openInfo.apirest.services.IUsuarioRolService;
import com.informatica.openInfo.apirest.services.IUsuarioService;

@RestController
@RequestMapping("/admin")
public class UsuariosRolesRestController {

	@Autowired
	private IUsuarioService usuarioService;

	@Autowired
	private IRolService rolService;

	@Autowired
	private IUsuarioRolService usuarioRolService;

	/*
	 * SERVICIOS CRUD USUARIOS
	 * 
	 */
	@GetMapping("/usuarios")
	public ResponseEntity<?> findAll() {
		Map<String, Object> response = new HashMap<>();
		List<Usuario> usuarios = null;
		try {
			usuarios = usuarioService.findAll();
		} catch (DataAccessException e) {
			response.put("mensaje", "Error al realizar la consulta en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if (usuarios.isEmpty()) {
			response.put("mensaje", "No existen contactos registrados");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}
		response.put("data", usuarios);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}

	@Secured({ "ROLE_ADMIN", "ROLE_COMISION" })
	@GetMapping("/usuarios/{codRegistro}")
	public ResponseEntity<?> findById(@PathVariable String codRegistro) {

		Usuario usuario = null;
		Map<String, Object> response = new HashMap<>();
		try {
			usuario = usuarioService.findById(codRegistro);

		} catch (DataAccessException e) {
			response.put("mensaje", "Error al realizar la consulta en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if (usuario == null) {
			response.put("mensaje", "El usuario ID: ".concat(codRegistro).concat(" no existe en la base de datos"));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}
		response.put("data", usuario);
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}

	@PostMapping("/usuarios")
	@Secured({ "ROLE_ADMIN", "ROLE_COMISION" })
	public ResponseEntity<?> save(@RequestBody Usuario usuario) {

		Usuario nuevoUsuario = null;
		Map<String, Object> response = new HashMap<>();
		try {

			nuevoUsuario = usuarioService.findById(usuario.getCodRegistro());

		} catch (DataAccessException e) {
			response.put("mensaje", "Error al insertar en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if (nuevoUsuario != null) {
			response.put("error", "el usuario ya se encuentra registrado");
		} else {
			nuevoUsuario = usuarioService.save(usuario);
			response.put("mensaje", "El usuario fue creado con exito");
			response.put("data", nuevoUsuario);
		}

		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}

	@DeleteMapping("/usuarios/{id}")
	public ResponseEntity<?> delete(@PathVariable String id) {
		Map<String, Object> response = new HashMap<>();

		try {
			usuarioService.delete(id);
		} catch (DataAccessException e) {
			response.put("mensaje", "Error al eliminar el usuario de la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		response.put("mensaje", "el cliente fue eliminado con exito");
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}

	/*
	 * SERVICIOS CRUD ROLES
	 * 
	 */

	@GetMapping("/roles")
	public List<Rol> findAllRol() {
		// TODO Auto-generated method stub
		return (List<Rol>) rolService.findAll();
	}

	@GetMapping("/roles/{id}")
	public Rol findById(@PathVariable Long id) {
		// TODO Auto-generated method stub
		return rolService.findById(id);
	}

	@PostMapping("/roles")
	public Rol save(@RequestBody Rol rol) {
		// TODO Auto-generated method stub
		return rolService.save(rol);
	}

	@DeleteMapping("/roles/{id}")
	public void delete(@PathVariable Long id) {
		// TODO Auto-generated method stub
		rolService.delete(id);
	}

	/*
	 * SERVICIOS USUARIOS-ROLES
	 * 
	 */

	@GetMapping("/usuariosRoles")
	public List<UsuarioRol> findAllUsuariosRoles() {
		// TODO Auto-generated method stub
		return usuarioRolService.findAll();
	}

	@GetMapping("/usuariosPorUsuario/{codUsuario}")
	public UsuarioRol buscarPorUsuario(@PathVariable String codUsuario) {
		// TODO Auto-generated method stub
		return usuarioRolService.buscarPorUsuario(codUsuario);
	}

	@GetMapping("/usuariosporRol/{idRol}")
	public UsuarioRol buscarPorRol(@PathVariable Long idRol) {
		// TODO Auto-generated method stub
		return usuarioRolService.buscarPorRol(idRol);
	}

	@PostMapping("/usuariosRoles/{codRegistro}/{rol}")
	public UsuarioRol save(@PathVariable String codRegistro, @PathVariable Long rol) {
		// TODO Auto-generated method stub
		Usuario user = usuarioService.findById(codRegistro);
		Rol role = rolService.findById(rol);
		UsuarioRolKey clave = new UsuarioRolKey();
		clave.setCodRegistro(codRegistro);
		clave.setIdRol(rol);
		UsuarioRol asigna = new UsuarioRol();
		asigna.setId(clave);
		asigna.setRol(role);
		asigna.setUsuario(user);
		return usuarioRolService.save(asigna);
	}

	@DeleteMapping("/usuariosRoles/{id}")
	public void delete(UsuarioRolKey id) {
		// TODO Auto-generated method stub
		usuarioRolService.delete(id);
	}

	/*
	 * MANEJO TOKENS
	 * 
	 */


	
}
