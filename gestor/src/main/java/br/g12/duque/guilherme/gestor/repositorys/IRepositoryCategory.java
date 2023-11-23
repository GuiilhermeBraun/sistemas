/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.g12.duque.guilherme.gestor.repositorys;

import br.g12.duque.guilherme.models.Category;
import java.util.ArrayList;

/**
 *
 * @author 08139
 */
public interface IRepositoryCategory {
    public boolean insert();
    public boolean update();
    public boolean delete();
    public ArrayList findAll();
    public Category findById();
    
}
