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
public class UpdateCategoryUseCase {
    public static void main(String[] args) {
        String strCodigo = JOptionPane.showInputDialog(null, "Digite o código");
        String name = JOptionPane.showInputDialog(null, "Novo nome:");
        String description = JOptionPane.showInputDialog(null, "Nova descrição:");
        int codigo = Integer.valueOf(strCodigo);
        
        Category category = new Category(codigo, name, description);
        CategoryDao dao = new CategoryDao(category);
        
        boolean success = dao.update();
        
        if(success){
            JOptionPane.showMessageDialog(null, "Registro atualizado!");
        }else{
            JOptionPane.showMessageDialog(null, "Erro na atualização");
        }
    }
}
