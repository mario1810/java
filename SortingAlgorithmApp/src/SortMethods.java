
public class SortMethods {

	public void countingSort(int[] a, int k) {
		int n=a.length;
		//Output array
		int []b= new int [n];
		int []count= new int [k+1];
		
		//how many times the element appears in our array
		for(int i=0; i<n; i++) {
			count[a[i]]=count[a[i]]+1;
		}
		
		//Number of elements less than or equal to the element
		for(int i=1; i<count.length; i++) {
			count[i]= count[i]+count[i-1];
		}
		
		//Get the sorted array
		//To make it stable we are operating in reverse order
		//	Stable sort algorithms sort equal elements in the same order that they appear in the input.
		for(int i=n-1; i>=0 ; i--) {
			b[count[a[i]]-1]=a[i];
			count[a[i]]=count[a[i]]-1;
		}
		
		for(int i=0; i<n; i++) {
			a[i]=b[i];
		}		
	}
	
	
	public void mergeSort(int arr[], int lb, int ub) {
		
		if(lb<ub){
			int m= lb+(ub-lb)/2;
			mergeSort(arr,lb,m);
			mergeSort(arr, m+1, ub);
			merge(arr, lb, m, ub);	
		}
	}
	
	private void merge(int arr[], int lb, int m, int ub) {
		int n1= m-lb+1;
		int n2=ub-m;
		
		int L[]= new int[n1];
		int R[]= new int[n2];
		
		for(int i=0; i<n1; i++) {
			L[i]=arr[lb+i];
		}
		for(int j=0; j<n2; j++) {
			R[j]=arr[m+1+j];
		}
		int i=0, j=0, k=lb;
		while(i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				arr[k++]=L[i++];
			}else {
				arr[k++]=R[j++];
			}
		}
		
		while(i<n1) {
			arr[k++]=L[i++];
		}
		
		while(j<n2) {
			arr[k++]=R[j++];
		}
	}
	
	
}//end class
