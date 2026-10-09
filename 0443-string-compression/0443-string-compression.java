class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }

        int i = 0;
        int write = 0;

        while (i < chars.length) {
            int count = 0;
            char current = chars[i];

            for (int j = i; j < chars.length; j++) {
                if (chars[j] == current) {
                    count++;
                } else {
                    break;
                }
            }

            chars[write++] = current;

            if (count > 1) {
                for (char digit : String.valueOf(count).toCharArray()) {
                    chars[write++] = digit;
                }
            }

            i += count;
        }

        return write;
    }
}