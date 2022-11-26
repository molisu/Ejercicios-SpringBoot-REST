package com.example.ejerciciosspringbootrest;

import com.example.ejerciciosspringbootrest.entity.Laptop;
import com.example.ejerciciosspringbootrest.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EjerciciosSpringBootRestApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(EjerciciosSpringBootRestApplication.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop hp840 = new Laptop(null, "840 G4", "Hewlett-Packard", "16 gb");
		Laptop asusTufGaming = new Laptop(null, "A15 FA506IC", "Asus", "8 gb");
		Laptop macBookPro = new Laptop(null, "Pro 15.4", "Apple", "16 gb");

		repository.save(hp840);
		repository.save(asusTufGaming);
		repository.save(macBookPro);
	}
}
