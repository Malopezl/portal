/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gt.com.portal.services;

import gt.com.portal.models.AuthorizedChannel;
import java.util.ArrayList;

/**
 *
 * @author malopez
 */
public interface AuthorizedChannelService {

    public ArrayList<AuthorizedChannel> getAll();

    public AuthorizedChannel getAuthorizedChannelById(Integer id);

    public ArrayList<AuthorizedChannel> getAuthorizedChannelByDistributor(Integer id);

    public AuthorizedChannel createAuthorizedChannel(AuthorizedChannel authorizedChannel);

    public AuthorizedChannel updateAuthorizedChannel(AuthorizedChannel authorizedChannel, Integer id);

    public void deleteAuthorizedChannel(Integer id);

}
