package algoritmos;


public class OrdenacaoPorSelecao {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int posMenor = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[posMenor]) {
                    posMenor = j;
                }
            }
            int temp = array[i];
            array[i] = array[posMenor];
            array[posMenor] = temp;
        }
    }
}
