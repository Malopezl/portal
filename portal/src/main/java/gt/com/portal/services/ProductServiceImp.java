/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.com.portal.services;

import gt.com.portal.models.Product;
import gt.com.portal.repositories.ProductRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author malopez
 */
@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    public ProductRepository productRepository;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<Product> getAll() {
        return (ArrayList<Product>) productRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Product getProductById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public ArrayList<Product> getProductByDistributor(Integer id) {
        return productRepository.getProductsByDistribuitor(id);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product, Integer id) {
        return productRepository.findById(id)
                .map((newProduct) -> {
                    newProduct.setDescription(product.getDescription());
                    newProduct.setAmount(product.getAmount());
                    return productRepository.save(newProduct);
                }).orElseGet(() -> { return product; });
    }

    @Override
    @Transactional
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }

}
