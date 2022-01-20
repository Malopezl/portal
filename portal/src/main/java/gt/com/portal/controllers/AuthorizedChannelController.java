/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.com.portal.controllers;

import gt.com.portal.models.AuthorizedChannel;
import gt.com.portal.services.AuthorizedChannelService;
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
@RequestMapping(value = "api/channel")
public class AuthorizedChannelController {

    @Autowired
    private AuthorizedChannelService authorizedChannelService;

    @GetMapping("")
    List<AuthorizedChannel> getAuthorizedChannelList() {
        return authorizedChannelService.getAll();
    }

    @GetMapping("/{id}")
    AuthorizedChannel getAuthorizedChannel(@PathVariable Integer id) {
        return authorizedChannelService.getAuthorizedChannelById(id);
    }

    @GetMapping("/distributor/{id}")
    ArrayList<AuthorizedChannel> getAuthorizedChannelByDistributor(@PathVariable Integer id) {
        return authorizedChannelService.getAuthorizedChannelByDistributor(id);
    }

    @PostMapping("")
    AuthorizedChannel createAuthorizedChannel(@RequestBody AuthorizedChannel authorizedChannel) {
        return authorizedChannelService.createAuthorizedChannel(authorizedChannel);
    }

    @PutMapping("/{id}")
    AuthorizedChannel updateAuthorizedChannel(@PathVariable Integer id, @RequestBody AuthorizedChannel authorizedChannel) {
        return authorizedChannelService.updateAuthorizedChannel(authorizedChannel, id);
    }

    @DeleteMapping("/{id}")
    void deleteAuthorizedChannel(@PathVariable Integer id) {
        authorizedChannelService.deleteAuthorizedChannel(id);
    }

}
