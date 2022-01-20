/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.com.portal.controllers;

import gt.com.portal.models.Product;
import gt.com.portal.services.ProductService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author malopez
 */
@RestController
@CrossOrigin("http://localhost:8080")
@RequestMapping(value = "api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("")
    List<Product> getProductList() {
        return productService.getAll();
    }

    @GetMapping("/{id}")
    Product getProduct(@PathVariable Integer id) {
        return productService.getProductById(id);
    }

    @GetMapping("/distributor/{id}")
    ArrayList<Product> getProductByDistributor(@PathVariable Integer id) {
        return productService.getProductByDistributor(id);
    }

    @PostMapping("")
    Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("/{id}")
    Product updateProduct(@PathVariable Integer id, @RequestBody Product product) {
        return productService.updateProduct(product, id);
    }

    @DeleteMapping("/{id}")
    void deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
    }

}
