public class App {

    public static boolean bubbleSort(int[] data) {

        int temp = 0;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        return true;
    }

    public static void printData(int[] data) {

        for(int i = 0; i < data.length; i++) {
            System.out.printf("%d ", data[i]);
        }
        System.out.println();
    }



    public static void main(String[] args) throws Exception {
        
        int[] arr1 = new int[]{1, 9, 4, 6, 11, 10, 3, 15, 2, 13};
        bubbleSort(arr1);
        printData(arr1);

        int[] arr2 = new int[]{-2, 6, 1, 3, 12};
        bubbleSort(arr2);
        printData(arr2);


    }
}
