package week1.weekendassignment2;

public class FindIntersection {

	/*
	 * Pseudo Code
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 *  f) Print the first array (shoud match item in both arrays)
	 */
	
	public static void getFineInsertion(int[] a,int[] b) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[]= {3,2,11,4,6,7};
		int y[]= {1,2,8,4,9,7};
		getFineInsertion(x, y);

	}

}
