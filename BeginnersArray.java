import java.util.Arrays;

class BeginnersArray {

	public static void main(String[] args) {
		// initialising an arrays

		int a[] = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(a));

		// Accessing Elements of an Array
		for (int i = 0; i < a.length; i++) {
			if (i == 2) {

				System.out.println("The second Element is:" + a[1]);
			}
		}
		{
			System.out.println("The fifth Element is:" + a[4]);
		}

		// Modifying Elements of an Array

		/*
		 * for (int i = 0; i < a.length; i++) { if (i == 3)
		 */ {
			a[3] = 400;
			int arr[] = new int[3];
		}
		System.out.println(Arrays.toString(a));

		// Finding The Length of An Array
		int size = a.length;
		System.out.println("length of an array:" + size);

		// Looping Through An Array

		for (int i = 0; i < a.length; i++) {
			System.out.println("Element at index" + i + " : " + a[i]);
		}
		// Multi dimensional Arrays

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Elements At Row1 Coloum2:" + arr[0][2]);

		// Copying Arrays
		int arr1[][] = new int[3][3];
		arr1[0][1] = 4;
		System.out.println(arr1[0][1]);

		// Sorting An Array
		int arr2[] = { 50, 10, 70, 40, 100 };
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));

	}
}
