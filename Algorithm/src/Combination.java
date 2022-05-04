
public class Combination {
	
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		boolean visited[] = new boolean[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			combination(arr, visited, 0, arr.length, i + 1);
		}
	}
	
	static void combination(int arr[], boolean visited[], int start, int n, int r) {
		if (r == 0) {
			print(arr, visited, n);
			return;
		}
		
		for (int i = start; i < n; i++) {
			visited[i] = true;
			combination(arr, visited, i + 1, n, r - 1);
			visited[i] = false;
		}
	}
	
	static void print(int arr[], boolean visited[], int n) {
		for (int i = 0; i < n; i++) {
			if (visited[i]) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
}
