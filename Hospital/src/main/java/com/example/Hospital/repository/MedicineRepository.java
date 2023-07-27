package com.example.Hospital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Hospital.entity.Medicine;
@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {

	

}
