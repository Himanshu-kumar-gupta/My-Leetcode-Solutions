class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre=strs[0];
        int pIndex=-1;
        int len=0;

        for (int i = 1; i < strs.length; i++) {
            pIndex = -1;
            len = Math.min(pre.length(), strs[i].length());
            for (int j = 0; j < len; j++) {
                if (pre.charAt(j) == strs[i].charAt(j))
                    pIndex++;
                else
                    break;
            }

            if (pIndex != -1)
                pre = strs[i].substring(0, pIndex + 1);
            else
                return "";

        }

        return pre;
    }
}
