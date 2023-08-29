package com.mtec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mtec.model.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{

}
