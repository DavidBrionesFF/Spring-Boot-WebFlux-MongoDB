package com.bytecode.core.webflux.controller;

import com.bytecode.core.webflux.repository.ProductoRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Random;
import java.util.stream.Stream;

@Controller
@RequestMapping("/home")
public class BasisController {
    @Autowired
    private ProductoRep productoRep;

    @GetMapping
    public String get(Model model){
        model.addAttribute("list", productoRep.findAll());
        return "index";
    }

    public Flux<Integer> getTemperature() {
        Random r = new Random();
        int low = 0;
        int high = 50;
        return Flux.fromStream(Stream.generate(() -> r.nextInt(high - low) + low)
                .map(s -> String.valueOf(s))
                .peek((msg) -> {
                }))
                .map(s -> Integer.valueOf(s))
                .delayElements(Duration.ofSeconds(1));
    }
}
