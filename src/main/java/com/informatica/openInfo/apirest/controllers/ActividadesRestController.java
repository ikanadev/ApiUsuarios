package com.informatica.openInfo.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.informatica.openInfo.apirest.models.Actividad;
import com.informatica.openInfo.apirest.services.IActividadService;
import com.informatica.openInfo.apirest.services.IEquipoActividadService;
import com.informatica.openInfo.apirest.services.IEquipoService;
import com.informatica.openInfo.apirest.services.IParticipanteEquipoService;
import com.informatica.openInfo.apirest.services.IParticipanteService;
import com.informatica.openInfo.apirest.services.IUsuarioService;

@RestController
@RequestMapping("/admin")
public class ActividadesRestController {
	
	@Autowired
	private IParticipanteService participanteService; 
	
	@Autowired
	private IEquipoService equipoService; 
	
	@Autowired IActividadService actividadService;
	
	@Autowired
	private IParticipanteEquipoService participanteEquipoService;
	
	@Autowired
	private IEquipoActividadService equipoActividadService;
	
	//Registrar Actividades
	//Desplegar todas las actividades
	
	@GetMapping("/actividades")
	public List<Actividad> findAll() {
		return actividadService.findAll();
	}
	

}
