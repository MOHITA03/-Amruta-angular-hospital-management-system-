package com.example.Hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Hospital.entity.patient;
@Repository
public interface PatientRepository extends JpaRepository<patient, Long> {
	public void deleteById(Long id);
}
