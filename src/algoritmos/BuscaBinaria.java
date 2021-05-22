package algoritmos;

import javax.swing.*;

public class BuscaBinaria {

    public static int binarySearch(int[] array, int target) {
        JOptionPane.showMessageDialog(null,"O programa vai executar uma busca binária.\n" +
                "Se o valor desejado não for encontrado ele retornará -1");
        int searched = -1;
        int start = 0;
        int end = array.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (target > array[mid]) {
                start = mid + 1;
            } else if (target < array[mid]) {
                end = mid - 1;
            } else if (target == array[mid]) {
                searched = mid;
                JOptionPane.showMessageDialog(null, "O número procurado está na posição " + searched + " do array");
                break;
            }
        }
        return searched;
    }
}
