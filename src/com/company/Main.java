package com.company;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
         String numero = JOptionPane.showInputDialog(null,"Digite o número da posição "+i+" do vetor");
         numeros[i]= Integer.parseInt(numero);
        }
        imprime(numeros);
        String wanted =JOptionPane.showInputDialog(null,"Digite o valor que deseja buscar");
        JOptionPane.showMessageDialog(null,"o valor procurado está na posição "+busca(numeros,Integer.parseInt(wanted)));
    }
    public static  int busca ( int[] vector, int wanted){
        wanted=-1;
        for(int i=0;i<vector.length;i++){
            if(vector[i]==wanted){
                wanted=i;
                break;
            }
        }
        return wanted;
    }

    public static void imprime (int[] vector){
        StringBuilder lista = new StringBuilder();
        for (int i=0;i<vector.length;i++){
            lista.append(" "+vector[i]);
        }
        String string = lista.toString();
        JOptionPane.showMessageDialog(null,string);
    }
}
