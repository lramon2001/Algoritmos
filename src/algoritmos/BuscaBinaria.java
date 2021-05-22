package algoritmos;

import javax.swing.*;

public class BuscaBinaria {
    public static int[] numeros =new int[6];

    public static void main (String args[]){
      numeros = SelectionSort.lerVetores(numeros);
      SelectionSort.ordenaVetor(numeros);
      SelectionSort.mostraVetor(numeros,"Lista ordenada");
      int alvo=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número a ser procurado: "));
      buscaBinaria(numeros,alvo);
      SelectionSort.mostraVetor(numeros,"Confira:");

    }

    public static int buscaBinaria(int[] array,int alvo){
        int index=-1;
        int inicio = 0;
        int fim = array.length -1;
        int meio;
        while(inicio<=fim){
            meio=(inicio+fim)/2;
            if(alvo>numeros[meio]){
                inicio=meio+1;
            }
            else if(alvo<numeros[meio]){
                fim=meio-1;
            }
            else if(alvo==numeros[meio]){
                index=meio;
                JOptionPane.showMessageDialog(null,"O número procurado está na posição "+index+" do array");
                break;
            }
        }
        return index;
    }
}
