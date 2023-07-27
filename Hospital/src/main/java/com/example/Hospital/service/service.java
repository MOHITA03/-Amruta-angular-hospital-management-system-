package com.example.Hospital.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Hospital.entity.patient;
import com.example.Hospital.repository.PatientRepository;

public class service {
	@Autowired
	private PatientRepository patientRepository;
	
	public patient updatePatient(patient patient) {
       
		Long id = patient.getId();
		patient std = patientRepository.findById(id).get();
		std.setAge(patient.getAge());
		std.setName(patient.getName());
		std.setBlood(patient.getBlood());
		std.setDose(patient.getDose());
		std.setFees(patient.getFees());
		std.setPrescription(patient.getPrescription());
		std.setUrgency(patient.getUrgency());
		std.setId(patient.getId());
		return patientRepository.save(std);
		
	}
}
