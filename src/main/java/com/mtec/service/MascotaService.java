package com.mtec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtec.model.Mascota;

import com.mtec.repository.IMascotaRepository;

@Service
public class MascotaService implements IMascotaService {

	@Autowired
	private IMascotaRepository repoMascota;

	@Override
	public List<Mascota> getMascota() {
		List<Mascota> listaMascota = repoMascota.findAll();
		return listaMascota;
	}

	@Override
	public void saveMascota(Mascota mascota) {
		repoMascota.save(mascota);
	}

	@Override
	public void deleteMascota(Long id_mascota) {
		repoMascota.deleteById(id_mascota);

	}

	@Override
	public Mascota findMascota(Long id_mascota) {
		Mascota mascota = repoMascota.findById(id_mascota).orElse(null);
		return mascota;
	}

	@Override
	public void editMascota(Long idOriginal, Long id_mascotaNueva, String nuevoNombre, String nuevaEspecie,
			String nuevaRaza, String nuevoColor) {
		Mascota mascota = this.findMascota(idOriginal);
		mascota.setId_mascota(id_mascotaNueva);
		mascota.setRaza(nuevaRaza);
		mascota.setColor(nuevoColor);

		this.saveMascota(mascota);

	}

}
