package com.mtec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtec.model.Persona;
import com.mtec.repository.IPersonaRepository;

@Service
public class PersonasService implements IPersonaService{
@Autowired
private IPersonaRepository persoRepository;

@Override
public List<Persona> getPersonas() {
	List<Persona> listaPersonas = persoRepository.findAll();
	return listaPersonas;
}

@Override
public void savePersona(Persona perso) {
	persoRepository.save(perso);
	
}

@Override
public void deletePersona(Long id) {
	persoRepository.deleteById(id);
	
}

@Override
public Persona findPersona(Long id) {
	Persona perso = persoRepository.findById(id).orElse(null);
	return perso;
}

@Override
public void editPersona(Long idOriginal, Long idNueva,
		String nuevoNombre, String nuevoApellido,
		int nuevaedad) {
	Persona perso = this.findPersona(idOriginal);
	perso.setId(idNueva);
	perso.setApellido(nuevoApellido);
	perso.setNombre(nuevoNombre);
	perso.setEdad(nuevaedad);
	this.savePersona(perso);
}

@Override
public void editPersona(Persona per) {
	this.savePersona(per);
	
}

}
