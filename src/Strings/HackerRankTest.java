package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.StringTokenizer;

public class HackerRankTest {
    public static String getPhoneNumber(String s) {
        // Write your code here
        Map<String, Integer> numbers = new HashMap<>();
        Map<String, Integer> times = new HashMap<>();
        StringBuilder number = new StringBuilder();

        numbers.put("zero", 0);
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);
        numbers.put("six", 6);
        numbers.put("seven", 7);
        numbers.put("eight", 8);
        numbers.put("nine", 9);

        times.put("double", 2);
        times.put("triple", 3);

        StringTokenizer tokens = new StringTokenizer(s," ");
        while(tokens.hasMoreTokens()){
            String token = tokens.nextToken();
            if((Objects.equals(token, "double") || Objects.equals(token, "triple"))){
                int repeat = times.get(token);
                token = tokens.nextToken();
                for(int i = 1; i<= repeat; i++){
                    number.append(numbers.get(token));
                }
            }
            else
                number.append(numbers.get(token));
        }

        return number.toString();
    }

    public static void main(String[] args) {
        String ans = "five one zero two four eight zero double three two";
        String finalAns = getPhoneNumber(ans);
        System.out.println(finalAns);
    }
}
