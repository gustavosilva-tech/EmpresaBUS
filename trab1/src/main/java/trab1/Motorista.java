/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trab1;


public class Motorista extends Pessoa {
    
    /** o salario do motorista**/
    private double salario;
    /**
     * Constrói um novo Motorista com o NIF, nome e salário especificados
     *
     * @param nf    NIF (Número de Identificação Fiscal) do motorista.
     * @param nome O nome do motorista.
     * @param s    Salario do motorista.
     */

    public Motorista(String nf, String nome,double s) {
        super(nf, nome);
        this.salario = s;
    }
     /**
     * Recebe o salário do motorista..
     *
     * @return O salario do motorista.
     */
    public double getSalario(){
        return salario;
    }
    /**
     * Define o salário do motorista.
     *
     * @param s O novo salário a ser definido.
     */
    public void setSalario(double s){
        this.salario = s;
    }
}
