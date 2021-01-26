package RepitTasks;

import java.util.*;

public class Anagrams {

    public static String order(String word) {
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static List<String> funWithAnagrams(List<String> text) {
        List<String> answer = new LinkedList<String>();
        Set<String> found = new HashSet<String>();
        for (int i = 0; i <= text.size()-1; i++) {
            String word = text.get(i);
            String orderedWord = order(word);
            if (!found.contains(orderedWord)) {
                answer.add(word);
                found.add(orderedWord);
            }
            String str = new String();
        }
        Collections.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
       List<String>  str = new ArrayList<>();
       str.addAll(Arrays.asList("code", "doce", "frame", "ramef"));
        System.out.println(funWithAnagrams(str));
    }
}
