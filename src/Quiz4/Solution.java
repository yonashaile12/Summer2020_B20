package Quiz4;

import java.util.Scanner;

public class Solution {

    static void minimumBribes(int[] q) {
        int[] a = q.clone();
        int bribes = 0;
        for (int i = a.length-1; i>0; i--) {
            if (a[i-1] == i+1) {
                a[i-1] = a[i];
                bribes++;
            } else if (i>=2 && a[i-2] == i+1) {
                a[i-2] = a[i-1];
                a[i-1] = a[i];
                bribes+=2;
            } else if (a[i] != i+1) {
                System.out.println("Too chaotic");
                return;
            }
        }
        System.out.println(bribes);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();

    }



}

