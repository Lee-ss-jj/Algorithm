
public class Permutation_Swap {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		
		for (int i = 0; i < arr.length; i++) {
			Permutation(arr, 0, arr.length, i + 1);
		}
	}
	
	static void Permutation(int arr[], int current, int n, int r) {
		if (current == r) {
			print(arr, r);
			return;
		}
		
		for (int i = current; i < n; i++) {
			swap(arr, current, i);
			Permutation(arr, current + 1, n, r);
			swap(arr, current, i);
		}
	}
	
	static void swap(int arr[], int current, int i) {
		int temp = arr[current];
		arr[current] = arr[i];
		arr[i] = temp;
	}
	
	static void print(int arr[], int r) {
		for (int i = 0; i < r; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
