package com.company;

import javax.swing.*;

public class SelectionSort {
    static int[] numeros = new int[6];

    public static void main(String args[]) {
        lerVetores(numeros);
        int[] ordenado = ordenaVetor(numeros);
        mostraVetor(ordenado);
    }

    public static int[] lerVetores(int[] array) {
        for (int i = 0; i < array.length; i++) {
            String input = JOptionPane.showInputDialog(null, "Digite o valor do numero a ser alocado no array: ");
            array[i] = Integer.parseInt(input);
        }
        return array;
    }

    public static void mostraVetor(int[] array) {
        StringBuilder lista = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            lista.append(" " + array[i]);
        }
        String output = lista.toString();
        JOptionPane.showMessageDialog(null, output);
    }

    public static int[] ordenaVetor(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int posicaoMenor = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[posicaoMenor]) {
                    posicaoMenor = j;
                }
            }
            int temp = array[posicaoMenor];
            array[posicaoMenor] = array[i];
            array[i] = temp;


        }
        return array;
    }
    }
