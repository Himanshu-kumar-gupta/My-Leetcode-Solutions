public class MaxProductWords {
    public int maxProduct(String[] words) {
        int maxP = 0,maxPtemp=0;
        for(int i=0;i< words.length;i++)
            for (int j = i + 1; j < words.length; j++)
                if (checkChar(words[i],words[j])) {
                    maxPtemp = words[i].length() * words[j].length();
                    if (maxPtemp > maxP)
                        maxP = maxPtemp;
                }

        return maxP;
    }

    public boolean checkChar(String a,String b){

        if (a.length()>b.length()){
            String temp=b;
            b=a;
            a=temp;
        }

        for (int i = 0; i < a.length(); i++) {
            if (b.contains(Character.toString(a.charAt(i))))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String[] words ={"a","aa","aaa","aaaa"};
        MaxProductWords obj = new MaxProductWords();
        System.out.println(obj.maxProduct(words));
    }
}
