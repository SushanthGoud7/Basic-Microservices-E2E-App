package com.example.citizenservice.Service;

import com.example.citizenservice.Entity.Citizen;
import com.example.citizenservice.Repository.CitizenRepository;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CitizenService {

    @Autowired
    private CitizenRepository repo;


    public Citizen register(Citizen citizen) {
    	log.info("Citizen Service");
        return repo.save(citizen);
    }

    public List<Citizen> getByVaccinecenter(int vaccineId) {
    	log.info("Get Citizen Service");
        return repo.findByVaccinationId(vaccineId);
    }

    public List<Citizen> getAll() {
        return repo.findAll();
    }
}
