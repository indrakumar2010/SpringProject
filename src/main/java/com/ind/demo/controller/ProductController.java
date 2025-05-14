package com.ind.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    Logger logger = LoggerFactory.getLogger(ProductController.class);

    @GetMapping("/{id}")
    public String findById(@PathVariable int id) {
        logger.info(id + "jsdjashdjadhka");
        logger.info(id + "djasljdasklkl");
        return "Product with id " + id + " found";
    }
}
