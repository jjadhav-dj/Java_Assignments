package languageBasics;

public class singleDimentionalArray {

	public static void main(String[] args) {
//		Approach 1, declaring arrays

//		int a[] = new int[5];
//		a[0] = 100;
//		a[1] = 200;
//		a[2] = 300;
//		a[3] = 400;
//		a[4] = 500;

//		System.out.println("index 2 value: "+ a[2]);

//		Approach 2

		/*
		 * int b[] = { 10, 20, 30, 40, 50 }; System.out.println(b.length);
		 * System.out.println(b[2]);
		 * 
		 * for (int i = 0; i < b.length; i++) { System.out.println(b[i]);
		 * 
		 * String names[] = { "Joy", "cloyee", "Kamal", "Raj", "Leena" };
		 * 
		 * for (String x : names) { System.out.println(x);
		 */
//			Two dimensional Arrays

		/*
		int a[][] = new int[3][2];

		int b[][] = { { 100, 200 }, { 300, 400 }, { 500, 600 } };

		for (int r = 0; r <= 2; r++) {
			for (int c = 0; c <= 1; c++) {
				System.out.println(b[r][c]);

			}

		}/*/
		
		/*
		
		int b[][] = { { 100, 200 }, { 300, 400 }, { 500, 600 } };
		
		for (int arr[]:b) 
		{
			for(int x:arr) 
			{
				System.out.println(x+" ");
				
			}
			
		}
		*/
		
		int arr[] = {1,2,3,4,5};
		
		int sum=0;
		
		for(int x:arr) 
		{
			System.out.println(x);
			
		} 
		System.out.println(sum+1);
	}

}
