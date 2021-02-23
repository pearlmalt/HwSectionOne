package ep1;

public class OrderStatistics4_5 {

	public static int getFourthSmallest(int[] a, int total){
		int temp;
		for (int i = 3; i < total; i++)
		{
			for(int j = i + 3; j < total; j++)
			{
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
		}
		return a[3];
	}
	public static void main(String args[]) {
		int a[]= {1,2,8,4,3,2};
		int b[]= {44,66,99,77,33,22,55};
		System.out.println("Fourth Smallest: " +getFourthSmallest(a,6));
		System.out.println("Fourth Smallest: " +getFourthSmallest(b,7));
	}
	
	
}
