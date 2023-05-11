package com.salesianostriana.dam.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.base.AlumnoServicio;

public class AlumnoControl  {
	@Autowired
	private AlumnoServicio alumnoServicio;
	
	@GetMapping("/list")
	public String lista(Model model)
}
