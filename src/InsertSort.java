/**
 * 
 * @author Administrator
 *
 */
public class InsertSort {
	public static void insertSort(int[] a){
		int i,j;
		for(i=1;i<a.length;i++){
			
			for(j=i-1;j>=0;j--){
				if(a[j+1]<a[j]){
					swap(a,j,j+1);
				}
			}
			
		}
	}
	private static void swap(int[] a,int m,int n){
		int tmp=a[m];
		a[m]=a[n];
		a[n]=tmp;
	}
}
