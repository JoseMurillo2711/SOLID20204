/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallersolid;

/**
 *
 * @author richardo
 */
public class LogIn implements ILogin {
    @Override
    public void log(User user) {
        System.out.println("El usuario tiene acceso al sitio web");
    }
}