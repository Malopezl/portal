/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gt.com.portal.repositories;

import gt.com.portal.models.AuthorizedChannel;
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
public interface AuthorizedChannelRepository extends JpaRepository<AuthorizedChannel, Integer>{

    @Query(value = "SELECT * FROM Canal_Autorizado WHERE Canal_Autorizado.Distribuidor_id = :id", nativeQuery = true)
    ArrayList<AuthorizedChannel> getAuthorizedChannelsByDistribuitor(@Param("id") Integer id);

}
