package module6_7;
import java.util.*;
public class diffrrarray {
public static void rangeUpdate(int[] diff, int l, int r, int val) {
diff[l] += val;
if (r + 1 < diff.length) diff[r + 1] -= val;
}
public static int[] getFinalArray(int[] diff) {
int[] result = new int[diff.length];
result[0] = diff[0];
for (int i = 1; i < diff.length; i++) {
result[i] = result[i - 1] + diff[i];
}
return result;
}
public static void main(String[] args) {
int n = 5;
int[] diff = new int[n];
rangeUpdate(diff, 1, 3, 5);
rangeUpdate(diff, 2, 4, 3);
int[] result = getFinalArray(diff);
System.out.println("final array: " + Arrays.toString(result));
}
}
  