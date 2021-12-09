import java.util.Arrays;

public class BubbleTest {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 9, 9, 3, 4, 5, 1};

        boolean isSorted = false;
        int temp;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    isSorted = false;

                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}