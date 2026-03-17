package module6_7;

public class missnum  {
public static int findMissing(int[] arr, int n) {
int expected = n * (n + 1) / 2;
int actual = 0;
for (int num : arr) actual += num;
return expected - actual;
}
public static void main(String[] args) {
int[] arr = {1, 2, 4, 5, 6};
System.out.println("missing number: " + findMissing(arr, 6));
}
}

