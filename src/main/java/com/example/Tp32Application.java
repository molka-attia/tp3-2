package com.example;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.CompteRepository;
import com.example.entities.Compte;
@SpringBootApplication
public class Tp32Application implements CommandLineRunner {
	@Autowired 
	private  CompteRepository iCompteRepository;
	public static void main(String[] args) {
		SpringApplication.run(Tp32Application.class, args);
	}
	public void run(String... args) throws Exception {
		Compte compte1 = iCompteRepository.save(new Compte(1, 100000, new Date()));
		//Compte compte1=iCompteRepository.save(new Compte(1, 1000, new Date()));
		/*Compte compte2=iCompteRepository.save(new Compte(2,2000,new Date()));
		Compte compte3=iCompteRepository.save(new Compte(3,3000,new Date()));*/
		
	}
}
