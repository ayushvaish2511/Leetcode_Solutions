class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 ||
                s.length() < t.length()) {
            return new String();
        }
        int[] map = new int[128];
        int count = t.length();
        int start = 0, end = 0, minLen = Integer.MAX_VALUE, startIndex = 0;
        for (char c : t.toCharArray()) {
            map[c]++;
        }

        char[] chS = s.toCharArray();

        while (end < chS.length) {
            if (map[chS[end++]]-- > 0) {
                count--;
            }
            while (count == 0) {
                if (end - start < minLen) {
                    startIndex = start;
                    minLen = end - start;
                }
                if (map[chS[start++]]++ == 0) {
                    count++;
                }
            }
        }

        return minLen == Integer.MAX_VALUE ? new String() :
                new String(chS, startIndex, minLen);
    }
}

// class Solution {
//     public boolean check(int[] c1, int[] c2)
//     {
// //         c1 = s    c2 = t
//         for(int i = 0; i<26; i++)
//         {
//             if(c2[i] == 0)
//                 continue;
//             if(c2[i] > 0 && c1[i]!=c2[i])
//                 return false;
//         }
//         return true;
//     }
//     public String minWindow(String s, String t) {
//         int start = 0;
//         int end = 0;
//         int[] c2 = new int[26];
//         for(int i = 0; i<t.length(); i++)
//         {
//             char ch = Character.toLowerCase(t.charAt(i));
//             c2[(int)(ch - 'a')]++;
//         }
//         int[] c1 = new int[26];
//         int strtIndex = 0;
//         int endIndex = -1;
//         while(end < s.length())
//         {
//             char ch = Character.toLowerCase(t.charAt(end));
//             c1[(int)(ch - 'a')]++;
//             if(check(c1, c2))
//             {
//                 strtIndex = start;
//                 endIndex = end;
//                 break;
//             }
//             end++;
//         }
//         if(end == s.length() || end == -1)
//             return "";
        
//         while(start <= end)
//         {
//             char ch = Character.toLowerCase(t.charAt(start));
//             c1[(int)(ch - 'a')]--;
//             if(check(c1, c2))
//             {
//                 strtIndex = start + 1;
//             }
//             else 
//             {
//                 break;
//             }
//         }
//         return s.substring(strtIndex, endIndex+1);
//     }
// }