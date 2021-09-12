import java.util.*;
public class Sort102
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
		//to input space separated array elements 
	    int[] a = new int[n];
	    for(int i =0;i<n;i++){
	        a[i] = in.nextInt(); 
	    }
	    sort(a);
	    printArray(a);
	}
	//function to sort the array with 0's, 1's and 2's
	public static void sort(int[] arr){
		//set low, mid to 0 and high to length of array -1
	    int low = 0;int high = arr.length-1;int mid = 0;
		//check until the left side of array is smaller than right side
	    while(mid<=high){
		    //if mid term of array is 0 then swap it to the first position and increment the low, mid values so that we can move to the right side of the array one by one.
	        if(arr[mid] == 0){
	            swap(arr,low,mid);
	            low++;mid++;
	        }
		    //if mid term of array is 1 then increase the mid value and let the 1 be there.
	        else if(arr[mid] == 1){
	            mid++;
	        }
		    //if mid term of array is 2 then swap it to the last position of the array and decrement the high value so that we can move to the left side of the array till the mid element.
	        else if(arr[mid] == 2){
	            swap(arr,mid,high);
	            high--;
	        }
	    }
	}
	//simply swap the element using a third variable
	public static void swap(int[] a, int i, int j){
	    int temp = a[i];
	    a[i]=a[j];
	    a[j]=temp;
	}
	// to print the array
	public static void printArray(int[] arr){
	    for(int i =0;i<arr.length;i++){
	        System.out.print(arr[i]+" ");
	    }
	}
	//time complexity of this algorithm is O(n) and space complexity is O(1).
	//name of the algorithm used- Dutch Flag Algorithm
}
