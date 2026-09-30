package com.jkshian.arms;

import com.jkshian.arms.entity.AirPlane;
import com.jkshian.arms.repo.PlaneRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArmsApplication.class, args);
    }

    @Bean
    CommandLineRunner seedSampleFlights(PlaneRepo planeRepo) {
        return args -> {
            addSampleFlight(planeRepo, "Mumbai", "Delhi", 120, 1_150);
            addSampleFlight(planeRepo, "Delhi", "Mumbai", 120, 1_150);
            addSampleFlight(planeRepo, "New York", "London", 180, 5_570);
        };
    }

    private void addSampleFlight(PlaneRepo planeRepo, String start, String end, int seats, double distance) {
        if (planeRepo.findByStartAndEnd(start, end) == null) {
            planeRepo.save(new AirPlane(0, start, end, seats, distance));
        }
    }


}
