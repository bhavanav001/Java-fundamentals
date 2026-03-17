package module6_7;

import java.util.Arrays;

public class insertion {
  public static void insertionSort(int[] arr) {
int n = arr.length;
for (int i = 1; i < n; i++) {
int key = arr[i];
int j = i - 1;
while (j >= 0 && arr[j] > key) {
arr[j + 1] = arr[j];
j--;
}
arr[j + 1] = key;
}
}
public static void main(String[] args) {
int[] arr = {1, 2, 4, 3, 5};
insertionSort(arr);
System.out.println("sorted: " + Arrays.toString(arr));
System.out.println("insertion sort is efficient for nearly sorted arrays - o(n) best case");
}
  
}
