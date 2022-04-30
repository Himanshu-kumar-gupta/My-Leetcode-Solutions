import java.util.*;

public class Roman1 {
    public static int romanToInt(String s) {
        Map<String, Integer> romanL = new HashMap<String,Integer>();
        romanL.put("I",1);
        romanL.put("IV",4);
        romanL.put("V",5);
        romanL.put("IX",9);
        romanL.put("X",10);
        romanL.put("XL",40);
        romanL.put("L",50);
        romanL.put("XC",90);
        romanL.put("C",100);
        romanL.put("CD",400);
        romanL.put("D",500);
        romanL.put("CM",900);
        romanL.put("M",1000);

        int sum =0;
        for (int i = 0; i < s.length(); i++) {
            char temp1 = s.charAt(i);
            String eval1 = ""+temp1;
            String eval2 = "";

            if (i!=s.length()-1){
                temp1 = s.charAt(i+1);
                eval2 = eval1+temp1;
            }

            if (romanL.containsKey(eval2)) {
                sum += romanL.get(eval2);
                i++;
            }
            else
                sum += romanL.get(eval1);
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
