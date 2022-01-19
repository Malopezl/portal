/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.com.portal.services;

import gt.com.portal.models.Distributor;
import gt.com.portal.repositories.DistributorRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author malopez
 */
@Service
public class DistributorServiceImp implements DistributorService {

    @Autowired
    public DistributorRepository distributorRepository;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<Distributor> getAll() {
        return (ArrayList<Distributor>) distributorRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Distributor getDistributorById(Integer id) {
        return distributorRepository.findById(id).orElse(null);
    }

    @Override
    public Distributor createDistributor(Distributor distributor) {
        return distributorRepository.save(distributor);
    }

    @Override
    public Distributor updateDistributor(Distributor distributor, Integer id) {
        return distributorRepository.findById(id)
                .map((newDistributor) -> {
                    newDistributor.setName(distributor.getName());
                    newDistributor.setAlertEmail(distributor.getAlertEmail());
                    newDistributor.setNotificationEmail(distributor.getNotificationEmail());
                    return distributorRepository.save(newDistributor);
                }).orElseGet(() -> { return distributor; });
    }

    @Override
    @Transactional
    public void deleteDistributor(Integer id) {
        distributorRepository.deleteById(id);
    }

}
