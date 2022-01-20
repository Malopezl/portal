/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gt.com.portal.repositories;

import gt.com.portal.models.Product;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author malopez
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

    @Query(value = "SELECT * FROM Producto WHERE Producto.Distribuidor_id = :id", nativeQuery = true)
    ArrayList<Product> getProductsByDistribuitor(@Param("id") Integer id);

}
