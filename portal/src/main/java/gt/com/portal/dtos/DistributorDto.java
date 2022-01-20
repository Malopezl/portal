/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.com.portal.dtos;

import java.util.ArrayList;
import lombok.Data;

/**
 *
 * @author malopez
 */
@Data
public class DistributorDto {

    private Integer code;
    private String name;
    private String notificationEmail;
    private String alertEmail;
    ArrayList<ProductDto> products = new ArrayList();
    ArrayList<AuthorizedChannelDto> authorizedChannels = new ArrayList();

}
