/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trab1;

import java.util.Objects;

/**
 * A classe Pessoa representa uma entidade com um número de identificação fiscal (NIF) e um nome.
 */

public class Pessoa {
    /**
     * Número de Identificação Fiscal (NIF) da pessoa.
     * Nome da pessoa
     */
    private String nif;      
    private String nome;
    /**
     * Construtor da classe Pessoa.
     *
     * @param nf   O número de identificação fiscal (NIF) da pessoa.
     * @param nome O nome da pessoa.
     */

    public Pessoa(String nf, String nome) {
        this.nif = nf;
        this.nome = nome;
    }
    /**
     * Obtém o NIF da pessoa.
     *
     * @return O NIF da pessoa.
     */

    public String getNIF() {
        return nif;
    }
    /**
     * Obtém o nome da pessoa.
     *
     * @return O nome da pessoa.
     */

    public String getNome() {
        return nome;
    }
    
    

    }

