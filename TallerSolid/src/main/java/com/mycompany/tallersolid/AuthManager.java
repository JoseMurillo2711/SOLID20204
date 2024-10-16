/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallersolid;

/**
 *
 * @author richardo
 */
public class AuthManager {
    
    ILogin login;
    
    public void authenticate(ILogin login) {
        System.out.println("Autenticando al usuario...");
    }
}