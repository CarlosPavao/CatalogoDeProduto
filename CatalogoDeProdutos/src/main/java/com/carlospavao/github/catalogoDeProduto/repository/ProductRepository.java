package com.carlospavao.github.catalogoDeProduto.repository;

import com.carlospavao.github.catalogoDeProduto.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findByName(String name);

}
