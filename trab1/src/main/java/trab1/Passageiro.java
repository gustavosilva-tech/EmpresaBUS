/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trab1;
/**
 * A classe Passageiro representa um passageiro, estendendo a classe Pessoa
 * Também inclui informações sobre o numero de telefone do passageiro
 */

public class Passageiro extends Pessoa {
    /** O número de telefone do passageiro. */
    private String telefone;    
     /**
     * Constrói um novo Passageiro com o NIF, nome e telefone especificados.
     *
     * @param nf       O NIF (Número de Identificação Fiscal) do passageiro.
     * @param nome     O nome do passageiro.
     * @param t O número de telefone do passageiro.
     */
    public Passageiro(String nf, String nome, String t) {
        super(nf, nome);
        this.telefone = t; 
    }
/**
     * Obtém o número de telefone do passageiro.
     *
     * @return O número de telefone do passageiro.
     */
    public String getTelefone() {
        return telefone;
    }
}
