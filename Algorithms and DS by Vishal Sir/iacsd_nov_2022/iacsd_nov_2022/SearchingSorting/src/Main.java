public class Main {
    public static void main(String[] args) {

        int [] arr = {30, 9, 20, 11, 59, 43, 29, 18, 27,  15, 33};

        //System.out.println("Passes: " + Util.bubbleSort(arr) );
        //Util.selectionSort(arr);
        //Util.insertionSort(arr);
        //Util.heapSort(arr, arr.length);
        //Util.quickSort(arr, 0, arr.length-1);
        Util.mergeSort(arr, 0, arr.length-1);


        for(int val : arr) {
            System.out.print(val  + " ");
        }
        System.out.println();

        /*int [] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println( Util.binarySearch(arr, 10));
        System.out.println( Util.binarySearch(arr, 50));
        System.out.println( Util.binarySearch(arr, 100));
        System.out.println( Util.binarySearch(arr, 11));
        System.out.println();

        System.out.println( Util.binarySearch(arr, 10, 0, 9));
        System.out.println( Util.binarySearch(arr, 50, 0, 9));
        System.out.println( Util.binarySearch(arr, 100, 0, 9));
        System.out.println( Util.binarySearch(arr, 11, 0, 9));*/
    }
}
