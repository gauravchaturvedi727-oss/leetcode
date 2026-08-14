import java.util.*;

class Solution {
    public long smallestNumber(long num) {

        if (num == 0) {
            return 0;
        }

        boolean negative = num < 0;

        String s = String.valueOf(Math.abs(num));

        char[] digits = s.toCharArray();

        Arrays.sort(digits);

        if (!negative) {
            if (digits[0] == '0') {

                int i = 0;

                while (digits[i] == '0') {
                    i++;
                }

                char temp = digits[0];
                digits[0] = digits[i];
                digits[i] = temp;
            }

            return Long.parseLong(new String(digits));

        } else {
            StringBuilder sb = new StringBuilder(new String(digits));

            sb.reverse();

            return -Long.parseLong(sb.toString());
        }
    }
}