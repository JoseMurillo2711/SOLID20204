/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tallersolid;

/**
 *
 * @author richardo
 */
public interface Database {
    public void select(String statement);
    public void insert(String statement);
    public void delete(String statement);
    public void update(String statement);
    
}
