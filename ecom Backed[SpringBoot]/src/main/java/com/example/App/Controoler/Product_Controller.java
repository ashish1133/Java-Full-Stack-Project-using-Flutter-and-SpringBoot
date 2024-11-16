package com.example.App.Controoler;

import com.example.App.Model.Product;
import com.example.App.Repository.Product_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:55529/")
public class Product_Controller {

    @Autowired
    Product_Repository repo;

    @GetMapping
    public List<Product> getPro(){
        return repo.findAll();
    }

    @PostMapping
    public void AddPro(@RequestBody Product pro){
        repo.save(pro);
    }

}
