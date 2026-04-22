class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> res=new ArrayList<>();
        for(String a:queries){
            for(String b:dictionary){
                if(isValid(a,b)){
                    res.add(a);
                    break;
                }
            }
        }
        return res;
    }
    private boolean isValid(String a , String b){
        int dif=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                dif++;
                if(dif>2) return false;
            }
        }
        return true;
    }
}