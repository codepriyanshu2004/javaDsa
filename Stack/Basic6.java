import java.util.Stack;
class Basic6{

     public static boolean ValidParenthesies(String s) {
        
        Stack<Character>st = new Stack();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='('){
                st.push(')');

            }else if(ch=='{'){
                st.push('}');
            }else if(ch=='['){
                st.push(']');
            }
            else if(st.isEmpty() || st.pop()!=ch){
                return false;
            }
        }

        return st.isEmpty();
    }

     public  static String removeDuplicates(String s) {
        Stack<Character>st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(!st.isEmpty() && st.peek()==ch){
                st.pop();
            }else{
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        sb = sb.reverse();
        return sb.toString();
        
    }
    public static void main(String[] args){
        String s = "()[]{}"; String ss = "(]"; String sss = "([])"; String ssss = "([)]";
        // boolean ans = ValidParenthesies(s);
        // System.out.println(ans);
       
        String h = "aaabbbb";  String hh = "aaabbc"; String hhh = "abc";
        String ans  = removeDuplicates(h);
        System.out.println(ans);

    }
}