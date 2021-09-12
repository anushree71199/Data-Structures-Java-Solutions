import java.util.*;
public class Sort102
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int[] a = new int[n];
	    for(int i =0;i<n;i++){
	        a[i] = in.nextInt(); 
	    }
	    sort(a);
	    printArray(a);
	}
	public static void sort(int[] arr){
	    int low = 0;int high = arr.length-1;int mid = 0;
	    while(mid<=high){
	        if(arr[mid] == 0){
	            swap(arr,low,mid);
	            low++;mid++;
	        }
	        else if(arr[mid] == 1){
	            mid++;
	        }
	        else if(arr[mid] == 2){
	            swap(arr,mid,high);
	            high--;
	        }
	    }
	}
	public static void swap(int[] a, int i, int j){
	    int temp = a[i];
	    a[i]=a[j];
	    a[j]=temp;
	}
	public static void printArray(int[] arr){
	    for(int i =0;i<arr.length;i++){
	        System.out.print(arr[i]+" ");
	    }
	}
}
