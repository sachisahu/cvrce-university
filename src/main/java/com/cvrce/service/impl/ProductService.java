package com.cvrce.service.impl;


import com.cvrce.domain.ProductEntity;
import com.cvrce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<ProductEntity> listAll() {
        return repo.findAll();
    }

    public void save(ProductEntity productEntity){
        repo.save(productEntity);
    }

    public ProductEntity get(long id){
        return repo.findById(id).get();
    }

    public void delete(long id){
        repo.deleteById(id);
    }
    
}
