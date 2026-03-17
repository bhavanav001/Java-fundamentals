package module6_7;

public class binarysearch {
  public static int iterative(int[] arr, int target) {
int low = 0, high = arr.length - 1;
while (low <= high) {
int mid = low + (high - low) / 2;
if (arr[mid] == target) return mid;
else if (arr[mid] < target) low = mid + 1;
else high = mid - 1;
}
return -1;
}
public static int recursive(int[] arr, int low, int high, int target) {
if (low > high) return -1;
int mid = low + (high - low) / 2;
if (arr[mid] == target) return mid;
else if (arr[mid] < target) return recursive(arr, mid + 1, high, target);
else return recursive(arr, low, mid - 1, target);
}
public static void main(String[] args) {
int[] arr = {1, 3, 5, 7, 9, 11};
System.out.println("iterative: index " + iterative(arr, 7));
System.out.println("recursive: index " + recursive(arr, 0, arr.length - 1, 7));
}
}

