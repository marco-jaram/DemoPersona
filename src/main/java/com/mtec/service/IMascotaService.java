package com.mtec.service;

import java.util.List;

import com.mtec.model.Mascota;


public interface IMascotaService {
	public List<Mascota> getMascota();

	public void saveMascota(Mascota mascota);

	public void deleteMascota(Long id_mascota);

	public Mascota findMascota(Long id_mascota);

	public void editMascota(Long idOriginal, Long id_mascotaNueva, String nuevoNombre, String nuevaEspecie,
			String nuevaRaza, String nuevoColor);
}
