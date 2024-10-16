/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallersolid;

/**
 *
 * @author richardo
 */
public class DatabaseManager {
    private Database db;

    public DatabaseManager(Database db) {
        this.db = db;
    }

    public void insertUser(User user) {
        String query = "INSERT INTO users VALUES (" + user.getNickname() + ", " + user.getPassword() + ")";
        db.insert(query);
    }
}