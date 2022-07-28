class Solution {
    public boolean isAnagram(String s, String t) { // array mapping - don't have to sort
        var fs = new int[26]; // create two empty arrays count number of offset for each char in the string array (from letter 'a')
        var ft = new int[26];
        for(var c: s.toCharArray()){
            fs[c-'a']++; //any char inside of s.toCharArray() count++
        }
        for(var c: t.toCharArray()){ //same here
            ft[c-'a']++;
        }
        for(int i = 0; i < 26; i++){ //compare the two arrays char by char if any not equal -> false
            if(fs[i] != ft[i])
                return false;
        }
        return true;
    }
}
