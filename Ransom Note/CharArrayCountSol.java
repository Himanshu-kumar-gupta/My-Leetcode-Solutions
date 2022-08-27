class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int count[] = new int[26];
        
        for(int i=0;i<magazine.length();i++) 
            count[magazine.charAt(i)-'a']++;
        
        
        for(int i=0;i<ransomNote.length();i++) {      
           int c=--count[ransomNote.charAt(i)-'a'];
            if(c==-1)
                return false;
        }
        
        return true;
    }
}
