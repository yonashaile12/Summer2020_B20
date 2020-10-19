package InterviewQuestions;

public class OCAPractice {

    public static void main(String[] args) {


        int[][] arr = new int[][]{{1,2},{3,4}};

        arr[1] = arr[0];

        System.out.println(arr[1]);

        //int[][] arr1 = new int[2][]{{1,2},{3,4};

        int[][] arr2 = {{'A','B'},{'C','D'},{'E','F'}};
        //  i            0     1
        int[][] arr3 ={{1,2,3},{3,4}};
        // j            0 1   2 3
        for(int i = 0; i< 2; i++){
            for(int j = 0; j<2; j++){
                System.out.print(arr3[i][j]+" ");
            }
        }


        String[][] str1 = {{"A","B","C"},{"D","E"}};

        for(int i = 0; i < str1.length; i++){
            for(int j = 0; j< str1[i].length;j++){
                System.out.print(str1[i][j]);
                if(str1[i][j].equals("B")){
                    break;
                }
            }
        }

        String[] days = {"sun","mon","tue","Wed","Sat"};

        int wd = 0;
        System.out.println();
        for(int i =0; i< days.length; i++){
            switch (days[i]){
                case "Sat":
                case "sun":
                    wd -= 1;
                    break;
                case "mon":
                    wd++;
                case "Wed":
                    wd+=2;
            }
        }
        System.out.println(wd);


    }
}
