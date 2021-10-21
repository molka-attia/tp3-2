package com.example.dao;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long>{

	//Compte save(int i, int j, Date date);
	
}
