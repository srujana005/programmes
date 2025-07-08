package arrayprogramms;

public class AddingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[] = { 1, 2, 3 };
		int a2[] = { 4, 5, 6 };

		for (int i = 0; i <= a1.length - 1; i++) {
			int res = a1[i] + a2[i];
			System.out.print(res + " ");
		}

	}

}
