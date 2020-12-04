package InterviewQuestions.LeetCode;

public class solution {

        public static int maxArea(int[] height) {
            int maxarea = 0;
            for (int i = 0; i < height.length; i++)
                for (int j = i + 1; j < height.length; j++)
                    maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));
            return maxarea;
        }

    public static void main(String[] args) {
        int[] hi  = {4,3,2,1,4};
        System.out.println(maxArea(hi));
    }
 }

