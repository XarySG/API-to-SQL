/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xsg.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.xsg.API.model.Product;

/**
 *
 * @author xaviersusgra
 */
public interface ProductRepository extends JpaRepository<Product, Integer>{
    
}