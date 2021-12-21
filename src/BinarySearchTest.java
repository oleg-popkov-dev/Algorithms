import java.util.Arrays;

public class BinarySearchTest {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 9, 9, 3, 4, 5, 13, 55, 17, 11, 9, 45, 19, 20, 1};
        bubbleSort(array);
        //System.out.println(array.length);
        System.out.println(binarySearch(array, 55));
    }

    public static void bubbleSort(int[] array) {
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
        System.out.println("Массив отсортирован");
        System.out.println(Arrays.toString(array));
    }

    public static int binarySearch(int[] array, int elementToSearch) {
        int firstIndex = 0;
        int lastIindex = array.length - 1;

        while (firstIndex <= lastIindex) {
            int middleIndex = (firstIndex + lastIindex) / 2;

            if (array[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (array[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            } else if (array[middleIndex] > elementToSearch) {
                lastIindex = middleIndex - 1;
            }
        }
        return -1;
    }
}