/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallersolid;

/**
 *
 * @author richardo
 */
public class CloudServicePlatform {
    
    private CloudService cloudService;

    public CloudServicePlatform(CloudService cloudService) {
        this.cloudService = cloudService;
    }

    public void hostingTo(AppWeb app) {
        cloudService.connect(app);
    }
}
