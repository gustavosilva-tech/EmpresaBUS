/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trab1;

import java.util.*;


/**
 * A classe Empresa representa uma empresa de transporte que gerencia motoristas,
 * viagens e operações relacionadas.
 *
 * @author Gustavo Silva a51848
 * @author Rafael Saraiva a54946
 */



public class Empresa {
    /** A lista de motoristas contratados pela empresa. */
    private List<Motorista> motoristas; 
    
    /** A lista de viagens realizadas pela empresa. */
    private List<Viagem> viagens;
     /**
     * Construtor para a classe Empresa.
     */
    public Empresa() {
        motoristas = new ArrayList<>();
        viagens = new ArrayList<>();
    }
    /**
     * Adiciona um motorista à lista de motoristas da empresa.
     * 
     * @param nif     O NIF (Número de Identificação Fiscal) do motorista.
     * @param nome    O nome do motorista.
     * @param salario O salário do motorista.
     * @return true se o motorista foi adicionado com sucesso, false caso contrário.
     */
    public boolean addMotorista(String nif, String nome, double salario) {
        Motorista motorista = new Motorista(nif, nome, salario);
        motoristas.add(motorista);
        System.out.println("Motorista: " + motorista.getNome());
        motorista.setSalario(1000.00);
        System.out.println("Salario: " + motorista.getSalario());
        
        return true;
    }
    /**
     * Adiciona uma viagem à lista de viagens da empresa.
     * 
     * @param c   O código identificador único da viagem.
     * @param lp  O local de partida da viagem.
     * @param ld  O local de destino da viagem.
     * @param dp  A data de partida da viagem.
     * @param pb  O preço do bilhete para a viagem.
     * @param nl  O número total de lugares disponíveis na viagem.
     * @return true se a viagem foi adicionada com sucesso, false caso contrário.
     */
    public boolean addViagem(int c, String lp, String ld, Date dp, double pb, int nl) {
        Motorista motorista = motoristas.stream().findFirst().orElse(null);
        if (motorista == null) {
            System.out.println("No available motorista found for the trip.");
            return false;
        }
        Viagem viagem = new Viagem(c, lp, ld, dp, pb, nl, motorista);
        viagens.add(viagem);
        System.out.println("Codigo: " + viagem.getCod());
        System.out.println("Local Partida: " + viagem.getLocalPartida());
        System.out.println("Local Destino: " + viagem.getLocalDestino());
        System.out.println("Data Partida: " + viagem.getDataPartida());
        System.out.println("Preco do Bilhete: " + viagem.getPrecoBilhete());
        System.out.println("Numero de Lugares: " + viagem.getNumLugares());
        System.out.println("Motorista: " + viagem.getMotorista().getNome());
        return viagem.getLugaresDisponiveis() > 0;
    }
     /**
     * Remove um motorista da lista de motoristas da empresa.
     * 
     * @param nif O NIF do motorista a ser removido.
     * @return true se o motorista foi removido com sucesso, false caso contrário.
     */
    public boolean removeMotorista(String nif) {
        return motoristas.removeIf(motorista -> Objects.equals(motorista.getNIF(), nif));
    }
    /**
     * Remove uma viagem da lista de viagens da empresa.
     * 
     * @param cod O código identificador único da viagem a ser removida.
     * @return true se a viagem foi removida com sucesso, false caso contrário.
     */
    public boolean removeViagem(int cod) {
        return viagens.removeIf(viagem -> viagem.getCod() == cod);
    }
    /**
     * Calcula a receita total gerada por todas as viagens realizadas pela empresa.
     * 
     * @return A receita total gerada pela empresa.
     */
    public double getReceitasTotais() {
        return viagens.stream().mapToDouble(Viagem::getReceitas).sum();
    }
    /**
     * Vende um bilhete para um passageiro em uma viagem específica.
     * 
     * @param passageiro O passageiro que está comprando o bilhete.
     * @param codViagem  O código identificador único da viagem.
     * @return true se o bilhete foi vendido com sucesso, false caso contrário.
     */

    public boolean vendeBilhete(Passageiro passageiro, int codViagem) {
        Optional<Viagem> viagemOptional = viagens.stream()
                .filter(viagem -> viagem.getCod() == codViagem)
                .findFirst();
        if (viagemOptional.isPresent()) {
            Viagem viagem = viagemOptional.get();
            if (viagem.addPassageiro(passageiro)) {
                System.out.println("NIF: " + passageiro.getNIF());
                System.out.println("Nome: " + passageiro.getNome());
                System.out.println("Telefone: " + passageiro.getTelefone());
            } else {
                System.out.println("Viagem cheia.");
            }
            System.out.println("Lugares disponiveis: " + viagem.getLugaresDisponiveis());
        }
            return false;
    }
}
    
    

