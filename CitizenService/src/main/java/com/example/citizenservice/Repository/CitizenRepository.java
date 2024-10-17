package com.example.citizenservice.Repository;

import com.example.citizenservice.Entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CitizenRepository extends JpaRepository<Citizen,Integer> {

    List<Citizen> findByVaccinationId(int vaccineId);

}
