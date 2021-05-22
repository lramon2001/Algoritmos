package algoritmos;

import javax.swing.*;

public class Main {
    static int[] array = new int [6];
    public static void main(String args[]){
       JOptionPane.showMessageDialog(null,"Digite 6 números de forma desorganizada para que o algoritmo possa trabalhar =-)");
       array = util.readArray(array);
       util.printArray(array,"Array desordenado: ");
       OrdenacaoPorSelecao.selectionSort(array);
       util.printArray(array,"Array ordenado: ");
       int target = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor a ser procurado pelo algortimo de busca linear"));
       int answer = BuscaLinear.linearSearch(array,target);
       util.printArray(array,"Confira a posição do elemento procurado! \nO número procurado foi "+target+ " e segundo o algoritmo a posição do número procurado é "+ answer);
       int secondTarget = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro valor a ser procudo pelo algoritmo de busca binária"));
       int secondAnswer = BuscaBinaria.binarySearch(array,secondTarget);
       util.printArray(array,"Confira a posição do elemento procurado! \nO número procurado foi "+secondTarget+" e segundo o algoritmo a posição do número procurado é "+secondAnswer);
    }
}
