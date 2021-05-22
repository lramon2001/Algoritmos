package algoritmos;


import javax.swing.*;

public class BuscaLinear {


    public static int linearSearch(int[] vector, int target) {
        JOptionPane.showMessageDialog(null,"O programa vai executar uma busca linear.\n" +
                "Se o valor desejado não for encontrado ele retornará -1");
        int searched = -1;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == target) {
                searched = i;
                JOptionPane.showMessageDialog(null, "O número procurado está na posição " + searched+ " do array");
                break;
            }
        }
        return searched;
    }


}
