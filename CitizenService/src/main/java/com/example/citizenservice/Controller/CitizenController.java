package com.example.citizenservice.Controller;

import com.example.citizenservice.Entity.Citizen;
import com.example.citizenservice.Service.CitizenService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CoWIN")
@Slf4j
public class CitizenController {

    @Autowired
    private CitizenService service;

    @PostMapping("/citizen/register")
    public ResponseEntity<Citizen> registerCitizen(@RequestBody Citizen citizen){
    	log.info("Controller->Register Citizen");
        return new ResponseEntity<>(service.register(citizen), HttpStatus.OK);
    }

    @GetMapping("/get/{Id}")
    public ResponseEntity<List<Citizen>> getByVaccination(@PathVariable("Id") int vaccinationId){
    	log.info("Controller->Get Citizen");
        return new ResponseEntity<>(service.getByVaccinecenter(vaccinationId),HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Citizen>> getAll(){
        return new ResponseEntity<>(service.getAll(),HttpStatus.OK);
    }
}
