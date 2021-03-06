
public class Permutation_Visited {

	public static void main(String[] args) {
		int n = 3;
		int arr[] = { 1, 2, 3 };
		int output[] = new int[n];
		boolean visited[] = new boolean[n];
		
		for (int i = 0; i < arr.length; i++) {
			Permutation(arr, output, visited, 0, n, i + 1);
		}
	}
	
	static void Permutation(int[] arr, int[] output, boolean visited[], int depth, int n, int r) {
		if (depth == r) {
			print(output, r);
			return;
		}
		
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				output[depth] = arr[i];
				Permutation(arr, output, visited, depth + 1, n, r);
				visited[i] = false;
			}
		}
	}
	
	static void print(int[] arr, int r) {
		for (int i = 0; i < r; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
