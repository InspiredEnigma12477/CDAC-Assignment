import java.util.Arrays;

public class SortingAlgo {
	
	public static void insertionSort(int[] arr) {
		// Assume first element is always sorted
		// So start sorting from 2nd element
		for(int k=1; k < arr.length ;k++) {
			int element = arr[k];
			int j=k-1; // left hand side k is already sorted
			System.out.println("####################################");
			System.out.println("Element to be inserted : " + element);
			while((j>=0) && (element <= arr[j])) { 
			// While loop --> 
			// move all values in sorted array 
				// which are greater than element one position to right
				System.out.println("Move "+arr[j] + " one position to right");
				arr[j+1] = arr[j];				
				j = j -1;
			}
			arr[j+1] = element;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arr) {
		// After the complete loop last
		// element will be automatically at right place
		for(int pos=0; pos< arr.length -1 ; pos++) {
			// left side of position is already sorted
			int minIndex = pos;
			// For loop finds the minIndex 
			// means index of element which is min in right side
			for(int i=pos+1; i< arr.length; i++) {
				if(arr[minIndex] > arr[i]) {
					minIndex = i;
				}
			}
			// swap the element at position with element at minIndex
			int temp=arr[minIndex];
			arr[minIndex] = arr[pos];
			arr[pos] = temp;
		}
	}
	public static int partition(int []arr, int left, int right) {
		int pivotValue = arr[right];
		// i will be location of last element 
		// which is less than pivot
		int i = (left -1);
		for(int j=left; j<right;j++) {
			if(arr[j] < pivotValue) {
				i++;
				// swap element at i and j location
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		// all smaller elements will be on left side of i
		// so put pivot at i+1
		// swap
		int temp = arr[i+1];
		arr[i+1] = arr[right];
		arr[right] = temp;
		
		return i+1;
	}
	public static void quickSort(int []arr, int left, int right) {
		if(left>right) {
			return;
		}
		else {
			// partition will arrange all smaller elements to pivot
			// on left side of pivotIndex
			// partition will arrange all greater elements to pivot
			// on right side of pivotIndex
			int pivotLocation = partition(arr, left,right);
			System.out.println("Pivot" + arr[pivotLocation]);
			System.out.println(Arrays.toString(arr));
			
			quickSort(arr, left, pivotLocation-1);
			quickSort(arr, pivotLocation+1, right);
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {115,50,15,2,25};
		//insertionSort(arr);
		quickSort(arr, 0, arr.length-1);
		System.out.println("Sorted array "+ Arrays.toString(arr));
	}

}
