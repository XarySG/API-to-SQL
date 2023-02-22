/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xsg.API.Service;

import com.xsg.API.model.Product;
import com.xsg.API.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author xaviersusgra
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository PRepository;
    
    public List <Product> listProducts(){
        return PRepository.findAll();
    }
    public void saveProduct (Product product){
        PRepository.save(product);
    }
    public Product getProductById(Integer id){
        return PRepository.findById(id).get();
    }
    public void deleteProduct (Integer id){
        PRepository.deleteById(id);
    }
}
