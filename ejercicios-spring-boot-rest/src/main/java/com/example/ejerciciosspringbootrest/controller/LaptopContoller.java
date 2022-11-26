package com.example.ejerciciosspringbootrest.controller;

import com.example.ejerciciosspringbootrest.entity.Laptop;
import com.example.ejerciciosspringbootrest.repository.LaptopRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopContoller {

    private LaptopRepository laptopRepository;

    public LaptopContoller(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/api/laptops")
    public List<Laptop> findAll() {
        return laptopRepository.findAll();
    }

    @PostMapping("/api/laptops")
    public Laptop create(@RequestBody Laptop laptop) {
        return laptopRepository.save(laptop);
    }
}
