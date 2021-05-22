package algoritmos;

import javax.swing.*;

public class util {
    public static int[] readArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            String input = JOptionPane.showInputDialog(null, "Digite o valor do numero a ser alocado no array: ");
            array[i] = Integer.parseInt(input);
        }
        return array;
    }
    public static void printArray(int[] array,String message) {
        StringBuilder list = new StringBuilder();
        list.append("\n");
        for (int i = 0; i < array.length; i++) {
            list.append("pos: "+(i)+" -> "+array[i]+"\n");
        }
        String output =message+list.toString();
        JOptionPane.showMessageDialog(null, output);
    }

}
