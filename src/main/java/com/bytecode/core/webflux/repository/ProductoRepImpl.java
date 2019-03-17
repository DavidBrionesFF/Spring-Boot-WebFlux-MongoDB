package com.bytecode.core.webflux.repository;

import com.bytecode.core.webflux.model.Producto;
import org.reactivestreams.Publisher;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class ProductoRepImpl implements ReactiveMongoRepository<Producto, String> {
    @Override
    public <S extends Producto> Mono<S> insert(S s) {
        return null;
    }

    @Override
    public <S extends Producto> Flux<S> insert(Iterable<S> iterable) {
        return null;
    }

    @Override
    public <S extends Producto> Flux<S> insert(Publisher<S> publisher) {
        return null;
    }

    @Override
    public <S extends Producto> Mono<S> findOne(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Producto> Flux<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Producto> Flux<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Producto> Mono<Long> count(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Producto> Mono<Boolean> exists(Example<S> example) {
        return null;
    }

    @Override
    public Flux<Producto> findAll(Sort sort) {
        return null;
    }

    @Override
    public <S extends Producto> Mono<S> save(S s) {
        return null;
    }

    @Override
    public <S extends Producto> Flux<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public <S extends Producto> Flux<S> saveAll(Publisher<S> publisher) {
        return null;
    }

    @Override
    public Mono<Producto> findById(String s) {
        return null;
    }

    @Override
    public Mono<Producto> findById(Publisher<String> publisher) {
        return null;
    }

    @Override
    public Mono<Boolean> existsById(String s) {
        return null;
    }

    @Override
    public Mono<Boolean> existsById(Publisher<String> publisher) {
        return null;
    }

    @Override
    public Flux<Producto> findAll() {
        return null;
    }

    @Override
    public Flux<Producto> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public Flux<Producto> findAllById(Publisher<String> publisher) {
        return null;
    }

    @Override
    public Mono<Long> count() {
        return null;
    }

    @Override
    public Mono<Void> deleteById(String s) {
        return null;
    }

    @Override
    public Mono<Void> deleteById(Publisher<String> publisher) {
        return null;
    }

    @Override
    public Mono<Void> delete(Producto producto) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll(Iterable<? extends Producto> iterable) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll(Publisher<? extends Producto> publisher) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll() {
        return null;
    }
}
