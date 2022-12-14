package com.idat.TuristaMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.TuristaMS.model.Turista;

@Repository
public interface TuristaRepository extends JpaRepository<Turista, Integer>{

}
