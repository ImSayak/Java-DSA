public class Solution {
        public static int makeBeautiful(String str) {
            char[] ch = str.toCharArray();
            int count = 0;
            int count1 = 0;
            for (int i = 0; i < ch.length; ++i) {
                if (i % 2 == 0) {
                    if (ch[i] == '1')
                        count++;
                } else {
                    if (ch[i] == '0')
                        count++;
                }
            }
            for (int i = 0; i < ch.length; ++i) {
                if (i % 2 == 0) {
                    if (ch[i] == '0')
                        count1++;
                } else {
                    if (ch[i] == '1')
                        count1++;
                }
            }
            return Math.min(count, count1);

        }
    }