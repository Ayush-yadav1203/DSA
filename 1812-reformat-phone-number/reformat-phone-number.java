class Solution {
    public String reformatNumber(String number) {
        number = number.replaceAll("[-]","").replaceAll(" ","");
        StringBuilder ans =new StringBuilder();
        int i=0,n=number.length();
        while(n-i>4){
            ans.append(number.substring(i,i+3)).append("-");
            i+=3;
        }
        if(n-i==4){
            ans.append(number.substring(i,i+2)).append("-").append(number.substring(i+2));
        }else{
            ans.append(number.substring(i));
        }
        return ans.toString();
    }
}