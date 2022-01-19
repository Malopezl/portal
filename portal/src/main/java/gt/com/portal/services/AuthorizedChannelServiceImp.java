/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.com.portal.services;

import gt.com.portal.models.AuthorizedChannel;
import gt.com.portal.repositories.AuthorizedChannelRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author malopez
 */
@Service
public class AuthorizedChannelServiceImp implements AuthorizedChannelService {

    @Autowired
    public AuthorizedChannelRepository authorizedChannelRepository;

    @Override
    @Transactional(readOnly = true)
    public ArrayList<AuthorizedChannel> getAll() {
        return (ArrayList<AuthorizedChannel>) authorizedChannelRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public AuthorizedChannel getAuthorizedChannelById(Integer id) {
        return authorizedChannelRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public ArrayList<AuthorizedChannel> getAuthorizedChannelByDistributor(Integer id) {
        return authorizedChannelRepository.getAuthorizedChannelsByDistribuitor(id);
    }

    @Override
    public AuthorizedChannel createAuthorizedChannel(AuthorizedChannel product) {
        return authorizedChannelRepository.save(product);
    }

    @Override
    public AuthorizedChannel updateAuthorizedChannel(AuthorizedChannel authorizedChannel, Integer id) {
        return authorizedChannelRepository.findById(id)
                .map((newAuthorizedChannel) -> {
                    newAuthorizedChannel.setName(authorizedChannel.getName());
                    return authorizedChannelRepository.save(newAuthorizedChannel);
                }).orElseGet(() -> { return authorizedChannel; });
    }

    @Override
    @Transactional
    public void deleteAuthorizedChannel(Integer id) {
        authorizedChannelRepository.deleteById(id);
    }

}
