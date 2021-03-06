package algorithms.recursion;

/**
 * @author sebastianjara on 28-02-21
 * @project data-structures-and-algorithms
 *
 * Class which sorts ascending an array with integer numbers
 * using a recursive method
 */
public class OrderAsc {

	public static void main(String[] args) {

		// array for testing purposes
		int[] numbers = {312,614,88,22,54};

		printContent(numbers);
		order(numbers, numbers.length);
		printContent(numbers);

	}

	/**
	 * Method which orders an integers array through the bubble sort algorithm
	 * and recursive calls
	 * @param arr with the numbers to be sorted
	 * @param quantity of numbers to be sorted into the array which is decreasing
	 *                 on each recursive iteration until being equal than 1
	 */
	public static void order(int[] arr, int quantity) {

		if(quantity > 1) {
			for(int i = 0; i < quantity-1; i++) {
				if(arr[i] > arr[i + 1]) {
					int aux = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = aux;
				}
			}
			order(arr, quantity-1);
		}
	}

	/**
	 * Method responsible of print the content of an integers array
	 * @param arr is an array to be printed
	 */
	public static void printContent(int[] arr) {

		for(int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
	}

}
