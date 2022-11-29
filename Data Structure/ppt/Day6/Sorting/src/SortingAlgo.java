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
	public static int partition(int []arr, int left, int right) { // arr = {67, 45, 112,220,234}
		int pivotValue = arr[right];                               // left= 3   right = 4
		System.out.println("Pivot" + pivotValue);
		// 'i' will be location of last element 
		// which is less than pivot
		int i = (left -1);
		for(int j=left; j<right;j++) {
			if(arr[j] < pivotValue) {
				i++;
				System.out.println("Swap inside for"+i+" "+j+" value@i"+arr[i]+"value@j"+arr[j]);
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

			System.out.println(Arrays.toString(arr));

			quickSort(arr, left, pivotLocation-1);
			quickSort(arr, pivotLocation+1, right);
			//return;
		}
	}

	public static void merge(int[] arr, int beg, int mid, int end) {
		// Assume all elements before mid are sorted
		// All elements after mid are sorted
		// But complete array is not sorted
		int i,j,k;
		int n1 = mid - beg +1; // size of left side array , mid goes on left side
		int n2 = end -mid; // size of right side array
		int[] leftArr = new int[n1];
		int[] rightArr = new int[n2];
		// Copy left side array values from arr to leftArr
		for(i=0;i<n1;i++) {
			leftArr[i] = arr[beg+i];
		}
		for(j=0;j<n2;j++) {
			rightArr[j] = arr[(mid+1)+j];// mid+1 because all elements after mid to rightArr
		}
		i=j=0;
		k=beg;
		while((i<n1) &&(j<n2) ) // merge the two array elements one by one and store in arr
		{
			if(leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			}
			else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		// Put remaining elements from leftArr in arr
		while(i<n1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		// Put remaining elements from rightArr in arr
		while(j<n2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
		// finally arr will have all the elements merged in right order
	}

	public static void mergeSort(int[] arr, int beg, int end) {
		if(beg < end) {
			int mid = ( beg + end)/2;
			mergeSort(arr,beg,mid);
			mergeSort(arr,mid+1,end);
			merge(arr,beg,mid,end);
		}
		return;
	}
	
	public static void bubbleSort(int[] arr) {
		int passes = arr.length-1;
		int compare = arr.length-1;
		
		for (int i =0;i<passes ; i++) {
			for(int j=0; j<(compare-i); j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {234,67,45,220,112,67};
		//insertionSort(arr);
		quickSort(arr, 0, arr.length-1);
		System.out.println("Sorted array "+ Arrays.toString(arr));
		int[] arr1 = {234,67,45,220,112,67};
		mergeSort(arr1,0, arr1.length-1);
		System.out.println("Sorted array "+ Arrays.toString(arr1));
		int[] arr2 = {234,67,45,220,112,67};
		bubbleSort(arr2);
		System.out.println("Sorted array "+ Arrays.toString(arr2));
	}

}
