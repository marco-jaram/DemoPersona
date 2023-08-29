package com.mtec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mtec.model.Mascota;
@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long> {

}
