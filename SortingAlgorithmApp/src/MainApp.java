import java.util.Arrays;



public class MainApp {
	
	public static void main(String[] args) {
		int []arr= new int[]{2,5,3,0,2,3,0,3};
		System.out.println("counting sort");
		SortMethods aux= new SortMethods();
		aux.countingSort(arr, 5);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("merge sort");
		arr= new int[]{2,5,3,0,2,3,0,3};
		aux.mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
