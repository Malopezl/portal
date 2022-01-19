/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gt.com.portal.services;

import gt.com.portal.models.Product;
import java.util.ArrayList;

/**
 *
 * @author malopez
 */
public interface ProductService {

    public ArrayList<Product> getAll();

    public Product getProductById(Integer id);

    public ArrayList<Product> getProductByDistributor(Integer id);

    public Product createProduct(Product product);

    public Product updateProduct(Product product, Integer id);

    public void deleteProduct(Integer id);

}
