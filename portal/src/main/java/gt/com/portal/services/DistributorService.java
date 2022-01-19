/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gt.com.portal.services;

import gt.com.portal.models.Distributor;
import java.util.ArrayList;

/**
 *
 * @author malopez
 */
public interface DistributorService {

    public ArrayList<Distributor> getAll();

    public Distributor getDistributorById(Integer id);

    public Distributor createDistributor(Distributor distributor);

    public Distributor updateDistributor(Distributor distributor, Integer id);

    public void deleteDistributor(Integer id);

}
