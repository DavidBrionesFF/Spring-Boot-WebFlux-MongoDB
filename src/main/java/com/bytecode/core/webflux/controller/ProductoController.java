package com.bytecode.core.webflux.controller;

import com.bytecode.core.webflux.model.Producto;
import com.bytecode.core.webflux.repository.ProductoRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.stream.Stream;
import java.util.Random;

@RestController
@RequestMapping("/api/v1")
public class ProductoController {
    @Autowired
    private ProductoRep _productoRep;

    @PostMapping("/producto")
    public Mono<Producto> addProduct(@RequestBody Producto producto){
        return _productoRep.save(producto);
    }

    @GetMapping("/producto")
    public Mono<Producto> getProductoById(@RequestParam("id") String id){
        return _productoRep.findById(id).delayElement(Duration.ofSeconds(4));
    }

    @GetMapping("/productos")
    public Flux<Producto> getProductos(){
        return _productoRep.findAll()
                .delaySequence(Duration.ofSeconds(4));
    }
}
