public class BackStringComp {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1= new StringBuilder(s);
        StringBuilder s2= new StringBuilder(t);

        int c=s1.indexOf("#");
        while (c != -1){
            if (c==0)
                s1.deleteCharAt(0);
            else {
                s1.delete(c-1,c+1);
            }

            c=s1.indexOf("#");
        }

        c=s2.indexOf("#");
        while (c != -1){
            if (c==0)
                s2.deleteCharAt(0);
            else {
                s2.delete(c-1,c+1);
            }

            c=s2.indexOf("#");
        }

        return s1.toString().equals(s2.toString());
    }

    public static void main(String[] args) {
        BackStringComp obj =new BackStringComp();
        System.out.println(obj.backspaceCompare("a#c","b"));
    }
}
