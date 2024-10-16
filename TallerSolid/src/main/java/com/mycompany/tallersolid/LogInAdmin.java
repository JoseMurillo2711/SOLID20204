/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallersolid;

/**
 *
 * @author richardo
 */
public class LogInAdmin implements ILogin {
    private ILogin ilogin;

    public LogInAdmin(ILogin authSystem) {
        this.ilogin = authSystem;
    }

    @Override
    public void log(User user) {
        if (verifyIfTheUserIsAdmin(user)) {
            ilogin.log(user);
            System.out.println("Modo admin activado");
        } else {
            System.out.println("Acceso denegado: no eres administrador.");
        }
    }

    private boolean verifyIfTheUserIsAdmin(User user) {
        // Verificación de administrador.
        return true;
    }
}
