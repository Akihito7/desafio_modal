import java.util.ArrayList;

public class Desafio02_modal {

    public static void main(String[] args) {

        int[] array1 = { 1, 1, 6, 6, 6, 21, 16, 8, 10, 100, 1, 1, 5, 6, 7, 8, 8, 9, 10, 44 };

        int[] array2 = { 2, 6, 2, 8, 6, 3, 3, 5, 10, 44, 19, 21, 16, 27, 29, 10, 7, 9, 10, 44 };

        ArrayList<Integer> array3 = new ArrayList<Integer>();

        for (int i = 0; i < array2.length; i++) {
            if (array1Contains(array1, array2[i]) && !array3.contains(array2[i])) {
                array3.add(array2[i]);
                System.out.println("Valor adicionado ao array final");
            }
        }

        int[] array4 = new int[array3.size()];
        
        for (int x = 0; x < array3.size(); x++) {
            array4[x] = array3.get(x);
            System.out.printf("%s ", array4[x]);
        }

    }

    private static boolean array1Contains(int[] array1, int value) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == value) {
                return true;
            }
        }
        return false;
    }
}
