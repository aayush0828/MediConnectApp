package com.edutech.progressive.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutech.progressive.entity.Patient;
import com.edutech.progressive.repository.PatientRepository;



@Service
public class PatientServiceImplJpa {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Patient getPatientById(int patientId) {
        return patientRepository.findByPatientId(patientId);
    }

    public Integer addPatient(Patient patient) {
        patientRepository.save(patient);
        return 1;
    }

    public void updatePatient(Patient patient) {
        patientRepository.save(patient);
    }

    public void deletePatient(int patientId) {
        patientRepository.deleteById(patientId);
    }
}