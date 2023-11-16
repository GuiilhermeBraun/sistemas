/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.g12.duque.guilherme.gestor;

/**
 *
 * @author 08139
 */
public interface InterBanco {
    public boolean insert();
    public boolean update();
    public boolean delete();
    public boolean findAll();
    public boolean findById(int id);
    
}
