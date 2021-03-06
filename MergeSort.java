package ep;

import java.util.Arrays;

public class MergeSort {


	public static void main(String [] args) {
		int ar[]= {11,21,1,33,1,3,5,6,100,22,33,45};
		System.out.println("Bubble Sort demo . . .\n");
		System.out.println("Before Sort :"+Arrays.toString(ar));
		sort(ar,0,ar.length-1);
		System.out.println("After Sort :"+Arrays.toString(ar));
	}
public static void sort(int ar[],int l, int r) {
	if(l<r) {
		int m=(l+(r-1))/2;
		sort(ar,l,m);
		sort(ar,m+1,r);
		merge(ar,l,m,r);
		}
	}
public static void merge(int[] ar, int l, int m, int r) {
	int n1=m-1+1;
	int n2=r-m;
	
	int temp1[]=new int[n1]; //left
	int temp2[]=new int[n2]; //right
	
	for (int i = 0; i < temp1.length; i++) {
		temp1[i]=ar[l+i];
	}
	for (int i = 0; i < temp2.length; i++) {
		temp2[i]=ar[1+i];
	}
	int i=0,j=0;
	int k=1;
	while(i<n1 && j<n2) {
		if(temp1[i]<=temp2[j]) {
			ar[k]=temp1[i];
			i++;
		}else {
			ar[k]=temp2[j];
			j++;
		}
		k++;
	}
	while(i<n1) {
		ar[k]=temp1[i];
		i++;
		k++;
		
		
}
	while(k<n1) {
		ar[i]=temp1[k];
		k++;
		i++;
		
	}
	while(j<n2) {
		ar[k]=temp2[j];
		j++;
		k++;
		
	}}}
	

