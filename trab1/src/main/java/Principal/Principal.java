/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import trab1.Empresa;
import trab1.Passageiro;
/**
 * A classe Principal contém o método main que demonstra o funcionamento
 * das funcionalidades da classe Empresa.
 * 
 * Este exemplo simula a adição e remoção de motoristas, a realização de viagens,
 * a venda de bilhetes, o cálculo da receita total e a remoção de uma viagem.
 */

public class Principal {
    /**
     * O método main é o ponto de entrada do programa.
     * @param args 
     **/
    public static void main(String[] args) {
        /**
         * Criamos uma instancia da classe empresa
         * 
         */
       Empresa empresa = new Empresa();
       
       
        /**  Adicionar motoristas   */
        System.out.println("------------------ Motorista ------------------");
        empresa.addMotorista("258561722", "Rui", 900.00);
        empresa.addMotorista("258282398", "Filipa", 840.60);
        System.out.println("------------- Motorista Removido --------------");
        /** Remover Motorista */
        empresa.removeMotorista("258561722");
        System.out.println("Motorista Rui removido.");
        System.out.println("-------------------- Viagem --------------------");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = null;
        try {
            date = formatter.parse("2023-12-05 14:00:00");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        /** Adicionar viagens  */
        empresa.addViagem(1,"Braganca", "Porto", date, 15.5, 5);
        System.out.println("Viagem adicionada com sucesso.");
        /** Vende bilhetes para passageiros */
        System.out.println("------------ Bilhetes vendidos -------------");
        Passageiro passenger = new Passageiro("258561728", "Alice", "929149982");
        Passageiro passenger2 = new Passageiro("258561798", "Joao", "9123456667");
        Passageiro passenger3 = new Passageiro("258293774", "Ricardo", "9273615278");
        empresa.vendeBilhete(passenger, 1);
        empresa.vendeBilhete(passenger2, 1);
        empresa.vendeBilhete(passenger3, 1);
        /** Calcula e exibe a receita total */
        System.out.println("------------ Receita da viagem -------------");
        double totalReceita = empresa.getReceitasTotais();
        System.out.println("Receita Total: " + totalReceita + " euros");
        /** Remove uma viagem da empresa */
        System.out.println("------------ Viagem removida ---------------");
        empresa.removeViagem(2);
        System.out.println("Viagem de Braganca ao Porto removida.");
    }
}