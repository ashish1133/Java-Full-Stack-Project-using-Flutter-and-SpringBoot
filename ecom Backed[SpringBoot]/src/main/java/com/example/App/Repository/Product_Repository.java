package com.example.App.Repository;

import com.example.App.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Product_Repository extends JpaRepository<Product,Integer> {
}
