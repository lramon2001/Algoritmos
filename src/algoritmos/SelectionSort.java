package algoritmos;

import javax.swing.*;

public class SelectionSort {
    static int[] numeros = new int[6];

    public static void main(String args[]) {
        lerVetores(numeros);
        mostraVetor(numeros,"Vetor desordenado: ");
        ordenaVetor(numeros);
        mostraVetor(numeros,"Vetor ordenado: ");

    }

    public static int[] lerVetores(int[] array) {
        for (int i = 0; i < array.length; i++) {
            String input = JOptionPane.showInputDialog(null, "Digite o valor do numero a ser alocado no array: ");
            array[i] = Integer.parseInt(input);
        }
        return array;
    }

    public static void mostraVetor(int[] array,String message) {
        StringBuilder lista = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            lista.append(" " + array[i]);
        }
        String output =message+lista.toString();
        JOptionPane.showMessageDialog(null, output);
    }

    public static void ordenaVetor(int[] array) {
        for(int i=0;i<array.length;i++){
            int posMenor =i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[posMenor]){
                    posMenor=j;
                }
            }
            int temp = array[i];
            array[i]=array[posMenor];
            array[posMenor]=temp;
        }
    }
    }
