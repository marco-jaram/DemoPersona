package com.mtec.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mtec.model.Persona;
import com.mtec.service.IPersonaService;

@RestController
public class PersonaController {
	@Autowired
	private IPersonaService interPersona;

	@GetMapping("/personas/traer")
	public List<Persona> getPersonas() {
		return interPersona.getPersonas();
	}

	@PostMapping("/personas/crear")
	public String createPersona(@RequestBody Persona perso) {
		interPersona.savePersona(perso);
		return "La persona fue creada correctaemnte";
	}

	@GetMapping("/personas/borrar/{id}")
	public String deletePersona(@PathVariable Long id) {
		interPersona.deletePersona(id);
		return "La persona fue eliminada correctamente";
	}
	
	@PutMapping("personas/editar/{id_modificar}")
	public Persona editPersona(@PathVariable Long id_original,
			@RequestParam(required = false, name = "id")Long nuevaId,
			@RequestParam(required = false, name = "nombre")String nuevoNombre,
			@RequestParam(required = false, name = "apellido") String nuevoApellido,
			@RequestParam(required = false, name = "edad")int nuevaEdad) {
		interPersona.editPersona(id_original, nuevaId, nuevoNombre, nuevoApellido, nuevaEdad);
		Persona perso = interPersona.findPersona(id_original);
		return perso;
	}
	@PutMapping("personas/editar")
	public Persona editPersona(@RequestBody Persona per) {
		interPersona.editPersona(per);
		
		return interPersona.findPersona(per.getId());
	}
}
