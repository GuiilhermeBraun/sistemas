/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.g12.duque.guilherme.test;

import br.g12.duque.guilherme.dao.CategoryDao;
import br.g12.duque.guilherme.models.Category;
import javax.swing.JOptionPane;

/**
 *
 * @author 08139
 */
public class InsertCategoryUseCase {
    public static void main(String[] args) {
        Category cat = new Category();
        String name = JOptionPane.showInputDialog("Nome:");
        String description = JOptionPane.showInputDialog("Descrição:");
        cat.setName(name);
        cat.setDescription(description);
        
        CategoryDao cd = new CategoryDao(cat);
        boolean success = cd.insert();
        
        if(success){
            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao alvar o registro!");
        }
    }
}
