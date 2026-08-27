package primul_exercitiu.ExercituiLaptop.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LaptopController {


    @Value("${laptop.brand}")
    private String brand;

    @Value("${laptop.model}")
    private String model;

    @Value("${laptop.ram}")
    private String ram;

    @Value("${laptop.processor}")
    private String processor;


    @GetMapping("/laptop")
    public String getLaptop() {
        return "Brand: " + brand +
                "Model: " + model +
                "RAM: " + ram +
                "Processor: " + processor;


    }
}
