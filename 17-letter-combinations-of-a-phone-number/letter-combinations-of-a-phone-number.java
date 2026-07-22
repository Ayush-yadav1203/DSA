class Solution {
    static String[] map = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty())
            return new ArrayList<>();
        return pad("",digits);
    }
    static ArrayList<String> pad(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        ArrayList<String> list=new ArrayList<>();
        String letters=map[digit];
        for(char ch:letters.toCharArray()){
            list.addAll(pad(p+ch,up.substring(1)));
        }
        return list;
    }
}