package module6_7;

import java.util.Arrays;

public class partarr {
  public static void partition(int[] arr) {
int left = 0;
int right = arr.length - 1;
while (left < right) {
while (left < right && arr[left] < 0) left++;
while (left < right && arr[right] >= 0) right--;
if (left < right) {
int temp = arr[left];
arr[left] = arr[right];
arr[right] = temp;
}
}
}
public static void main(String[] args) {
int[] arr = {3, -2, 1, -5, 4, -1};
partition(arr);
System.out.println("partitioned: " + Arrays.toString(arr));
}

}
