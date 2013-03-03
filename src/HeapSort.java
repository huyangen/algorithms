/**
 * 
 * @author huyangen
 * heapSort
 *
 */

public class HeapSort {
	
	private static int left(int a){
		return 2*a+1;
	}
	private static int right(int a){
		return 2*a+2;
	}
/*	private int parent(int a){
		if(a%2==1){
			return a/2;
		}else {
			return a/2-1;
		}
	}*/
	
	
	public static void heapSort(int[] a){
		
		buildMaxHeap(a);
		int heapSize=a.length;
		for(int i=a.length-1;i>0;i--){
			swap(a,0,i);
			heapSize--;
			maxHeapify(a,0,heapSize);
		}
	}
	
	public static void display(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
	}
	
	private static void maxHeapify(int[] a,int i,int heapSize){
		int l=left(i);
		int r=right(i);
		int largest;
		if(l<heapSize&&a[l]>a[i]){
			largest=l;
		}else
			largest=i;
		if(r<heapSize&&a[r]>a[largest]){
			largest=r;
		}
		if(largest!=i){
			swap(a,i,largest);
			maxHeapify(a,largest,heapSize);
		}
	}
	private static void buildMaxHeap(int[] a){
		int heapSize=a.length;
		for(int i=a.length/2;i>=0;i--){
			
			maxHeapify(a,i,heapSize);
		}
	}
	private static void swap(int[] a,int m,int n){
		int tmp=a[m];
		a[m]=a[n];
		a[n]=tmp;
	}
	
}
