package com.example.ejerciciosspringbootrest.repository;

import com.example.ejerciciosspringbootrest.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
