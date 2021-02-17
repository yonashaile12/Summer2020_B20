package Office_Hours.Practice_11_04_2020;

import java.util.*;

public class wordLen {

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String each : strings) {
            map.put(each, each.length());
        }
        return map;
    }

    public static Map<Character, Integer> charCount(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {

            if (map.containsKey(each)) {

                map.put(each, map.get(each) + 1);

            } else {

                map.put(each, 1);

            }

        }

      return map;

    }

    public static String uniques(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character each : str.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        String s = "";
        for (Map.Entry<Character, Integer> each : map.entrySet()){
            if(each.getValue() == 1){
                Character unique = each.getKey();
                s += unique;
            }
        }
        return s;
    }

    public static void SortingArrayListDesc(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        wordLen wordLen = new wordLen();
        System.out.println(wordLen.wordLen(new String[]{"abebe", "beso", "bela"}));

        System.out.println("charCount(\"abebe\") = " + charCount("abebe"));

        System.out.println(uniques("gwhdhfgqiwifhadb"));
        List<Integer> lst = new ArrayList<>();
        lst.addAll(Arrays.asList(87,34,88,32, 98,44, 2, 4));
        SortingArrayListDesc(lst);

        System.out.println(hourglassSum(new int[][]{{1, 1, 1, 0, 0, 0,}, {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0}, {0, 0, 2, 4, 4, 0}, {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}}));
        /*
        1 1 1 0 0 0  | 1 1 1 |  7  | 1 1 0 |  4  | 1 0 0|  2 |0 0 0| 0
        0 1 0 0 0 0  |   1   |     |   0   |     |   0  |    |  0  |
        1 1 1 0 0 0  | 1 1 1 |     | 1 1 0 |     | 1 0 0|    |0 0 0|
        0 0 2 4 4 0  4, 4, 7,6,3,4
        0 0 0 2 0 0
        0 0 1 2 4 0
         */

        //System.out.println(longestCommonPrefix(new String[]{"baba", "abab", "bbaa"}));

        System.out.println(Arrays.toString(moveZeros(new int[]{1, 0, 2, 0, 3, 0, 4, 0})));
        System.out.println(Arrays.toString(Sort(new int[]{7, 3, 6, 2, 8, 1, 9})));
        System.out.println(findMin(new ArrayList<>(Arrays.asList(7, 3, 6, 2, 8, 1, 9))));
        SortingArrayAsc(new int[]{7, 3, 6, 2, 8, 1, 9});
    }

    public static int hourglassSum(int[][] arr) {
        int h = 0;
        int[] sum = new int[16];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                sum[h] = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1]
                        [j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                h++;
            }
        }

        Arrays.sort(sum);

        return sum[15];
    }



    public static int[] moveZeros( int[]  arr ) {
        ArrayList<Integer> list = new ArrayList<>();
        int countZero = 0;
        for(int each: arr) {
            list.add(each);
            if(each==0){
                countZero++;
            }
        }
        list.removeAll(Arrays.asList(0));
        arr = new int[arr.length];
        for(int i=0; i <arr.length-countZero; i++ ) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static int[] Sort(int[] a) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int each: a)
            list.add(each);
        for(int i=0; i < a.length; i++) {
            a[i] = findMin(list);
            list.remove(Integer.valueOf(a[i]));
        }
        return a;
    }

    public static int findMin(ArrayList<Integer> a) {
        int min =Integer.MAX_VALUE;  //  23455858
        for(int each: a)
            min = Math.min(min, each);
        return min;

    }

    public static void SortingArrayAsc(int[] arr) {
        ArrayList<Integer> list = new ArrayList();
        for(int each: arr) {
            list.add(each);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        for(int i=0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }




}