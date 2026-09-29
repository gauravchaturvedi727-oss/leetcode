class Solution {
    public String removeKdigits(String num, int k) {

        if(num.length() == k) {
            return "0";
        }

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < num.length(); i++) {

            char curr = num.charAt(i);

            while(k > 0 && !st.isEmpty() && st.peek() > curr) {
                st.pop();
                k--;
            }

            st.push(curr);
        }

        while(k > 0) {
            st.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();

        for(char ch : st) {
            sb.append(ch);
        }

        while(sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}