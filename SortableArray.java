public class SortableArray {

    public static void main(String[] args) {
        // Integer sorting example
        int[] integers = {5, 2, 9, 1, 5, 6};
        bubbleSortIntegers(integers);

        // Print sorted integers
        System.out.println("Sorted Integers:");
        for (int num : integers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // String sorting example
        String[] strings = {"apple", "orange", "banana", "pear"};
        bubbleSortStrings(strings);

        // Print sorted strings
        System.out.println("Sorted Strings:");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    // Bubble Sort method for integers
    public static void bubbleSortIntegers(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Bubble Sort method for strings
    public static void bubbleSortStrings(String[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
