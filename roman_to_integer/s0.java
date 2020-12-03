class Solution {
    public static int romanToInt(String s) {
        int value = 0;
        
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            
            switch (c) {
                case 'M':
                    value += 1000;
                    break;
                case 'D':
                    value += 500;
                    break;
                case 'C':
                    if (i < s.length() -1 && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M'))
                        value -= 100;
                    else
                        value += 100;
                    break;
                case 'L':
                    value += 50;
                    break;
                case 'X':
                    if (i < s.length() -1 && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C'))
                        value -= 10;
                    else
                        value += 10;
                    break;
                case 'V':
                    value += 5;
                    break;
                case 'I':
                    if (i < s.length() -1 && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X'))
                        value -= 1;
                    else
                        value += 1;
                    break;
                default:
                    return 0;
            }
        }
            
        return value;
    }

    public static void main(String[] args) {
        int i = romanToInt("MCMXCIV");
    }
}