package Office_Hours.Practice_12_30_2020;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalanceBrackets {

    // {([])}

    // ( { } )]

    public static void main(String[] args) {
        System.out.println(isBalanced("({})"));
    }
    public static boolean isBalanced(String str){
        String open = "{[(";
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('[',']');
        map.put('{','}');
        map.put('(',')');
        for(int i = 0; i < str.length(); i++){

            if(open.contains(""+str.charAt(i))){
                // this char is some open bracket

                stack.push(str.charAt(i));// {
            }else {
                // this char is some closing bracket

                if (stack.isEmpty() || str.charAt(i) != map.get(stack.pop()) ){ // ] != ]
                    return false;                                               // ) != )
                }

            }
            /*
                stack:
                        [
                        (
                        {
             */
        }
        return stack.isEmpty();

    }


}
