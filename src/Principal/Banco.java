/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Locale;        //importação do Locale (serve para deixar os numeros quebrados padronizados)
import java.util.Scanner;       //importação do Scanner(Pegar dados do teclado quando a função for chamada)
import entidades.Conta;         //importação da Classe "Conta" do pacote "entidades"

public class Banco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);           //chamando o locale e colocando no padrão de US
        Scanner sc = new Scanner(System.in);    //criando variavel para escanear oq for informado
        
        //variaveis
        int numero;
        double depositoInicial, deposito, saque;
        String nome, resp1, resp2;
        Conta cont;         //Não posso criar essa variavel dentro do if e else se não ela fica limitada
        
        System.out.print("Digite o numero da sua conta: ");
        numero = sc.nextInt();                
        System.out.print("Digite o seu Nome: ");
        sc.nextLine();
        nome = sc.nextLine();
        System.out.print("gostaria de realizar um depósito inicial? ");
        resp1 = sc.next();
        if(resp1.equalsIgnoreCase("sim")){      
            System.out.print("Digite o valor do depósito inicial: ");
            depositoInicial = sc.nextDouble();
            cont = new Conta(numero, nome, depositoInicial);    //primeiro construtor caso tenha um deposito inicial
        }else{
            cont = new Conta(numero, nome);                     //segundo construtor caso não tenha deposito inicial
        }   
        System.out.println();
        System.out.println("Dados da Conta: ");
        System.out.println(cont);
        System.out.println("Gostaria de realizar um deposito ou um saque?: ");
        resp2 = sc.next();
        if(resp2.equalsIgnoreCase("deposito")){
            System.out.print("Valor que deseja depositar: ");
            deposito = sc.nextDouble();
            cont.deposito(deposito);        //instanciando a variavel deposito para levar os dados para outra classe
            System.out.println();
            System.out.println("Dados Atualizados: ");
            System.out.println(cont);
        }else if(resp2.equalsIgnoreCase("saque")){
            System.out.print("Valor de saque: ");
            saque = sc.nextDouble();
            cont.saque(saque);              //intanciando a variavel saque para levar os dados para outra classe
            System.out.println();
            System.out.println("Dados Atualizados: ");
            System.out.println(cont);
        }else{
            System.out.println("Concluido");
        }
        System.out.print("Deseja realizar mais alguma operação?: ");
        resp2 = sc.next();
        if(resp2.equalsIgnoreCase("sim")){
            System.out.print("Gostaria de realizar um deposito ou um saque?: ");
        resp2 = sc.next();
        }
        if(resp2.equalsIgnoreCase("deposito")){
            System.out.print("Valor que deseja depositar: ");
            deposito = sc.nextDouble();
            cont.deposito(deposito);
            System.out.println();
            System.out.println("Dados Atualizados: ");
            System.out.println(cont);
        }else if(resp2.equalsIgnoreCase("saque")){
            System.out.print("Valor de saque: ");
            saque = sc.nextDouble();
            cont.saque(saque);
            System.out.println();
            System.out.println("Dados Atualizados: ");
            System.out.println(cont);
        }else{
            System.out.println("Concluido ");
            sc.next();
        }   
        
    }
}
