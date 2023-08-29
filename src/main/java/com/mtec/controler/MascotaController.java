package com.mtec.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.mtec.model.Mascota;

import com.mtec.service.IMascotaService;

@RestController
public class MascotaController {
	@Autowired
	private IMascotaService mascoService;

	@PostMapping("/mascotas/crear")
	public String createMascota(@RequestBody Mascota mascota) {
		mascoService.saveMascota(mascota);
		return "La mascotita fue creada ";

	}

}
