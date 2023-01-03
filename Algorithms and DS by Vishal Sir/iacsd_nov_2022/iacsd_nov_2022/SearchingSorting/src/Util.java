public class Util {
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while (low <= high) {

            mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int key, int low, int high) {

        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            return mid;
        }

        if (key < arr[mid]) {
            //search in first half
            return binarySearch(arr, key, low, mid - 1);
        } else {
            //search in second half
            return binarySearch(arr, key, mid + 1, high);
        }

    }

    public static int bubbleSort(int[] arr) {

        int passes = arr.length - 1;
        int comps = arr.length - 1;

        for (int i = 0; i < passes; i++) {
            //single pass
            int count = 0;
            for (int j = 0; j < (comps - i); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }

            if (count == 0) {
                return i + 1;
            }

        }

        return arr.length;
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            //single pass
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j != i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void heapSort(int[] arr, int len) {
        if (len <= 1) {
            return;
        }

        for (int i = len - 1; i > 0; i--) {
            if (arr[i] > arr[(i - 1) / 2]) {
                int temp = arr[i];
                arr[i] = arr[(i - 1) / 2];
                arr[(i - 1) / 2] = temp;
            }
        }

        int temp = arr[0];
        arr[0] = arr[len - 1];
        arr[len - 1] = temp;

        heapSort(arr, --len);

        return;

    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivotLoc = partition(arr, left, right);
        quickSort(arr, left, pivotLoc - 1);
        quickSort(arr, pivotLoc + 1, right);
    }

    public static int partition(int[] arr, int left, int right) {

        int pivot = arr[left];

        while (left != right) {

            while (arr[right] > pivot && left != right) {
                right--;
            }

            if (left != right) {
                arr[left] = arr[right];
                left++;
            }

            while (arr[left] < pivot && left != right) {
                left++;
            }

            if (left != right) {
                arr[right] = arr[left];
                right--;
            }
        }

        arr[left] = pivot;

        return right;
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, mid + 1, right);
    }

    public static void merge(
            int[] arr,
            int leftStart, int leftEnd,
            int rightStart, int rightEnd
    ) {

        int numElements = rightEnd - leftStart + 1;
        int[] res = new int[numElements];
        int resIndex = -1;

        while ((leftStart <= leftEnd) && (rightStart <= rightEnd)) {
            if (arr[leftStart] < arr[rightStart]) {
                res[++resIndex] = arr[leftStart];
                leftStart++;
            } else {
                res[++resIndex] = arr[rightStart];
                rightStart++;
            }
        }

        while (leftStart <= leftEnd) {
            res[++resIndex] = arr[leftStart];
            leftStart++;
        }

        while (rightStart <= rightEnd) {
            res[++resIndex] = arr[rightStart++];
        }

        for(int i = 0; i < numElements; i++) {
            arr[rightEnd] = res[resIndex];
            rightEnd--;
            resIndex--;
        }


    }
}











