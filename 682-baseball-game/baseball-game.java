class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String s:operations){
            if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                st.push(2*st.peek());
            }
            else if(s.equals("+")){
                int last=st.pop();
                int sec=st.peek();
                st.push(last);
                st.push(last+sec);
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        int ans=0;
        for(int num:st){
            ans+=num;
        }
        return ans;
    }
}