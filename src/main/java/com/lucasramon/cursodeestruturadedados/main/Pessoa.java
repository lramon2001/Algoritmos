/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucasramon.cursodeestruturadedados.main;

/**
 *
 * @author Lucas
 */
public class Pessoa {
    private int id;
    private String nome;
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + '}';
    }
    
    
}
