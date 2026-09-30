/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trab1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * A classe Viagem representa uma viagem que pode ser realizada pela Empresa.
 * Contém informações sobre o código da viagem, locais de partida e destino,
 * data de partida, preço do bilhete, número de lugares disponíveis,
 * motorista responsável e lista de passageiros.
 */
public class Viagem {
    private int cod;       /** O código identificador único da viagem. */
    private String localPartida;  /** O local de partida da viagem. */
    private String localDestino;  /** O local de destino da viagem. */
    private Date dataPartida;   /** A data de partida da viagem. */
    private double precoBilhete;     /** O preço do bilhete para a viagem. */
    private int numLugares;      /** O número total de lugares disponíveis na viagem. */
    private Motorista motorista; /** O motorista responsável pela viagem. */
    private List<Passageiro> passageiros = new ArrayList<>();  /** A lista de passageiros que compraram bilhetes para a viagem. */
    /**
     * Construtor para a classe Viagem.
     *
     * @param c   O código identificador único da viagem.
     * @param lp  O local de partida da viagem.
     * @param ld  O local de destino da viagem.
     * @param dp  A data de partida da viagem.
     * @param p   O preço do bilhete para a viagem.
     * @param nl  O número total de lugares disponíveis na viagem.
     * @param m   O motorista responsável pela viagem.
     */

    public Viagem(int c, String lp, String ld, Date dp, double p, int nl, Motorista m) {
        this.cod = c;
        this.localPartida = lp;
        this.localDestino = ld;
        this.dataPartida = dp;
        this.precoBilhete = p;
        this.numLugares = nl;
        this.motorista = m;
    }
    /**
     * Obtém o código identificador único da viagem.
     *
     * @return O código identificador único da viagem.
     */
    public int getCod() {
        return cod;
    }
     /**
     * Obtém o local de partida da viagem.
     *
     * @return O local de partida da viagem.
     */
    public String getLocalPartida() {
        return localPartida;
    }
     /**
     * Obtém o local de destino da viagem.
     *
     * @return O local de destino da viagem.
     */

    public String getLocalDestino() {
        return localDestino;
    }
    /**
     * Obtém a data de partida da viagem.
     *
     * @return A data de partida da viagem.
     */

    public Date getDataPartida() {
        return dataPartida;
    }
    /**
     * Obtém o preço do bilhete para a viagem.
     *
     * @return O preço do bilhete para a viagem.
     */

    public double getPrecoBilhete() {
        return precoBilhete;
    }
     /**
     * Obtém o número total de lugares disponíveis na viagem.
     *
     * @return O número total de lugares disponíveis na viagem.
     */

    public int getNumLugares() {
        return numLugares;
    }
     /**
     * Define o motorista responsável pela viagem.
     *
     * @param m O motorista responsável pela viagem.
     */

    public void setMotorista(Motorista m) {
        this.motorista = m;
    }
    /**
     * Obtém o motorista responsável pela viagem.
     *
     * @return O motorista responsável pela viagem.
     */

    public Motorista getMotorista() {
        return motorista;
    }
    /**
     * Adiciona um passageiro à lista de passageiros se houver lugares disponíveis.
     *
     * @param p O passageiro a ser adicionado.
     * @return true se o passageiro foi adicionado com sucesso, false caso contrário.
     */

    public boolean addPassageiro(Passageiro p) {
        if (passageiros.size() < numLugares) {
            return passageiros.add(p);
        }
        return false;
    }
    /**
     * Obtém o número de lugares disponíveis na viagem.
     *
     * @return O número de lugares disponíveis na viagem.
     */

    public int getLugaresDisponiveis() {
        int disponivel = numLugares - passageiros.size();
        return disponivel;
    }
    /**
     * Obtém a receita total gerada pela viagem com base no número de passageiros e no preço do bilhete.
     *
     * @return A receita total gerada pela viagem.
     */

    public double getReceitas() {
        return passageiros.size() * precoBilhete;
    }
}