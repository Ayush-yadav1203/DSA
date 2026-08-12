class Solution {
    public String finalString(String s) {
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='i'){
                reverse(ch,0,i-1);
            }
        }
        StringBuilder ans=new StringBuilder();
        for(char c:ch){
            if(c!='i'){
                ans.append(c);
            }
        }
        return ans.toString();
    }
    void  reverse(char[] ch,int left,int right){
        while(left<right){
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }

    }
}