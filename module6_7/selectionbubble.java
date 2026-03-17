package module6_7;

import java.util.Arrays;

public class selectionbubble {
  public static void selectionSort(int[] arr) {
int n = arr.length;
for (int i = 0; i < n - 1; i++) {
int minIdx = i;
for (int j = i + 1; j < n; j++) {
if (arr[j] < arr[minIdx]) minIdx = j;
}
int temp = arr[minIdx];
arr[minIdx] = arr[i];
arr[i] = temp;
}
}
public static void main(String[] args) {
int[] arr = {64, 25, 12, 22, 11};
selectionSort(arr);
System.out.println("sorted: " + Arrays.toString(arr));
System.out.println("selection sort always does o(n^2) comparisons unlike bubble sort");
System.out.println("bubble sort can stop early if already sorted, selection sort cannot");
}
  
}
