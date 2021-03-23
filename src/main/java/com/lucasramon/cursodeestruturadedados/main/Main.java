/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucasramon.cursodeestruturadedados.main;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite a opção desejada: ");
        System.out.println("1-Gerenciamento de memória");
        try (Scanner ler = new Scanner(System.in)) {
            int opcao=ler.nextInt();
            switch(opcao){
                case 1:
                    
                    fazerGerenciamentoDeMemoria();
                    break;
            }
        }
    }

    private static void fazerGerenciamentoDeMemoria() {
        int a = 3;
        System.out.println("a: " + a);
        int b = a;
        System.out.println("b:" + b);
        b = 2;
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("a: " + a);
        System.out.println("b:" + b);
        System.out.println("a é igual a b:" + (a == b));
        System.out.println("- - - - - - - - - - - - - - -");
        Pessoa pa = new Pessoa(1, "primeiro cabloco");
        System.out.println(pa.toString());
        Pessoa pb = pa;
        System.out.println(pb.toString());
        System.out.println("- - - - - - - - - - - - - - -");
        pb.setNome("segundo cabloco");
        System.out.println(pa.toString());
        System.out.println(pb.toString());
        System.out.println(pa == pb);
        System.out.println("Deu ruim");
    }
    
}
