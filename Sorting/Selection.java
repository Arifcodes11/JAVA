public class Selection {
    static void Sort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int MinIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[MinIndex]) {
                    MinIndex = j;
                }
            }
            int temp = arr[MinIndex];
            arr[MinIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int n = arr.length;
        Sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
