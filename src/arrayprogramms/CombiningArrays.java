package arrayprogramms;

import java.util.Arrays;

public class CombiningArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {1,2,3};
		int a2[]= {4,5,6};
		
		int[] a3=new int[a1.length+a2.length];
		System.arraycopy(a1, 0, a3, 0, a1.length);
		System.arraycopy(a2, 0, a3, a1.length, a2.length);
		System.out.println(Arrays.toString(a3));
		System.out.println("new code");

	}

}

