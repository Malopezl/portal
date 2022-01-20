/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.com.portal.controllers;

import gt.com.portal.models.Distributor;
import gt.com.portal.services.DistributorService;
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
@RequestMapping(value = "api/distributor")
public class DistributorController {

    @Autowired
    private DistributorService distributorService;

    @GetMapping("")
    List<Distributor> getDistributorList() {
        return distributorService.getAll();
    }

    @GetMapping("/{id}")
    Distributor getDistributor(@PathVariable Integer id) {
        return distributorService.getDistributorById(id);
    }

    @PostMapping("")
    Distributor createDistributor(@RequestBody Distributor distributor) {
        return distributorService.createDistributor(distributor);
    }

    @PutMapping("/{id}")
    Distributor updateDistributor(@PathVariable Integer id, @RequestBody Distributor distributor) {
        return distributorService.updateDistributor(distributor, id);
    }

    @DeleteMapping("/{id}")
    void deleteDistributor(@PathVariable Integer id) {
        distributorService.deleteDistributor(id);
    }

}
