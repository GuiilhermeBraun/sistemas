/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.g12.duque.guilherme.models;

/**
 *
 * @author 08139
 */
public class Category {
    // Atributos da classe //
    private int id;
    private String name;
    private String description;
    
    // Construtor  Category(tipo do objeto) cat(nome) = new Category()(construtor)//
    
    //Construtor padrao
    public Category(){
        System.out.println("Categoria Criada!");
    }
    
    //Construtor com parametros
    public Category(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        
    }
    
    //Construtor para carregamento do Combobox
    public Category(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    //Construtor que será usado no Form de cadastro
    public Category(String name, String description){
        this.name = name;
        this.description = description;
    }
    
    // GETTER E SETTER    
    public int getId() {
        return id;
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static void main(String[] args) {
    }
}
