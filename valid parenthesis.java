class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<Character>();
        int n = s.length();
        char[] ch = s .toCharArray(); 
        
        for(int i=0; i<n; i++)
        {
            if(ch[i] == '(' || ch[i] == '{' || ch[i] =='[')
            st.push(ch[i]);
            
            else{
            if(st.isEmpty())
            return false;
            
            char c = st.pop();
            
            if((ch[i] == ')' && c == '(') ||
               (ch[i] == ']' && c == '[' )||
               (ch[i] == '}' && c == '{') )
               continue;
               
               else 
               return false;
            }
        }
               return st.isEmpty();
        }
}
