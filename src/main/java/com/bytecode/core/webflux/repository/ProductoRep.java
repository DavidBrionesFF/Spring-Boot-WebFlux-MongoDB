package com.bytecode.core.webflux.repository;

import com.bytecode.core.webflux.model.Producto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductoRep extends ReactiveMongoRepository<Producto, String> {
}
