package InterviewQuestions.HackerRanck;
import java.util.*;

public class NewYearChaos {

        // Complete the minimumBribes function below.
        static void minimumBribes(int[] q) {
            int[] k = new int[0];
            for(int i = 0; i<q.length; i++){
                k[i] = q[i]+q[i+1]+q[i+2]+q[i+4]+q[3];
            }

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

