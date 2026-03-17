package module6_7;

import java.util.Arrays;

public class rearray {

    public static void rearrange(int[] arr) {

        int n = arr.length;
        int[] evens = new int[n];
        int[] odds = new int[n];

        int e = 0, o = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evens[e++] = arr[i];
            } else {
                odds[o++] = arr[i];
            }
        }

        int ei = 0, oi = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = evens[ei++];
            } else {
                arr[i] = odds[oi++];
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 1, 6, 5};

        rearrange(arr);

        System.out.println("rearranged: " + Arrays.toString(arr));
    }
}
