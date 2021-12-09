import java.util.Arrays;

public class SelectionTest {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 9, 9, 3, 4, 5, 1};

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int temp = array[i];
                array[i] = array[min_i];
                array[min_i] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}