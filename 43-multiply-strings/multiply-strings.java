class Solution {
    public String multiply(String num1, String num2) {

        if(num1.equals("0") || num2.equals("0"))
            return "0";

        int[] res = new int[num1.length() + num2.length()];

        for(int i = num1.length()-1; i >= 0; i--) {
            for(int j = num2.length()-1; j >= 0; j--) {

                int p = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');

                p += res[i + j + 1];

                res[i + j + 1] = p % 10;
                res[i + j] += p / 10;
            }
        }

        String ans = "";

        for(int x : res) {
            if(!(ans.isEmpty() && x == 0))
                ans += x;
        }

        return ans;
    }
}