class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int l = 0, r = a.length - 1;
        
        while (l < r) {
            while (l < r && "aeiouAEIOU".indexOf(a[l]) < 0) l++;
            while (l < r && "aeiouAEIOU".indexOf(a[r]) < 0) r--;
            
            char t = a[l]; 
            a[l++] = a[r]; 
            a[r--] = t;
        }
        return new String(a);
    }
}