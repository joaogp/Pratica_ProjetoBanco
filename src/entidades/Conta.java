/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

    

public class Conta {
    private String nome;
    private int numero;
    private double saldo;
    
    public Conta(int numero, String nome){                           //construtor para caso não informe um deposito inicial
        this.numero = numero;       
        this.nome = nome;
    }
    public Conta(int numero, String nome, double depositoInicial){  //construtor para caso informa deposito inicial
        this.numero = numero;
        this.nome = nome;
        deposito(depositoInicial);              //é preciso jogar o deposito inicial direto para o metodo "deposito" para que coloque como saldo
    }  
    public int getNumero(){                     //não utiliza-se o set, pois o programa não pode deixar o numero e saldo serem alterados 
        return numero;                          //assim deixando o método disponnivel apenas para visualização
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getSaldo(){
        return saldo;
    }
    public void deposito(double amount){    //amount é o valor que entra e sai, ele é utilizado apenas nos dois métodos 
        saldo += amount;                    //pega o valor que entra(que é o informado pelo usuario) e soma com o saldo que ja tinha
    }
    public void saque(double amount){       
        saldo -= amount + 5.0; //pega o valor que entra(informado pelo usuario), subtrai com o saldo e acrescenta uma taxa de saque
    }
    public String toString(){
        return "Senhor(a) " + nome + " o numero da sua conta é: " + numero + " e tem o valor de R$" + String.format("%.2f", saldo);
    }     
}

