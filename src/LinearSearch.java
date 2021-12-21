public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {2, 4, 9, 5, 1, 3, 8, 7, 6, 10};
        System.out.println(linearSearch(array, 111));
    }

    public static int linearSearch(int[] array, int elementToFind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToFind) {
                System.out.println(elementToFind + " found at index: " + i);
                return i;
            }
        }
        System.out.println("not found: " + elementToFind);
        return -1;
    }
}