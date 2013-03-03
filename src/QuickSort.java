/**
 * 
 * @author huyangen
 *
 */
public class QuickSort {
	
	private static int partition(int[] a,int start,int end){
		int i=start,j=i-1,pivot=end;
		for(;i<=end;i++){
			if(a[i]<a[pivot]){
				j++;
				swap(a,i,j);
			}
		}
		j++;
		swap(a,pivot,j);
		return j;
	}
	private static void quickSort(int[] a,int start,int end){
		
		int index=partition(a,start,end);
		if(start<index){
			quickSort(a,start,index-1);
		}
		if(index<end){
			quickSort(a,index+1,end);
		}
	}
	public static void quickSort(int[] a){
		quickSort(a,0,a.length-1);
	}
	private static void swap(int[] a,int m,int n){
		int tmp=a[m];
		a[m]=a[n];
		a[n]=tmp;
	}
	public static void display(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println("\n");
	}
}
