package src.classes;

public class RomanToInt {
    public static int romanToIntSlower(String s) {
        int ret = 0;
        s = s.replace("IV","4,");
        s = s.replace("IX","9,");
        s = s.replace("I","1,");
        s = s.replace("V","5,");
        s = s.replace("XL","40,");
        s = s.replace("XC","90,");
        s = s.replace("X","10,");
        s = s.replace("L","50,");
        s = s.replace("CD","400,");
        s = s.replace("CM","900,");
        s = s.replace("C","100,");
        s = s.replace("D","500,");
        s = s.replace("M","1000,");
        String[] temp = s.split(",");
        for(String ch : temp)
            ret+=Integer.parseInt(ch);
        return ret;
    }

    public static int romanToInt(String s) {
        int ret = 0;
        char selected;
        char next;
        for(int i = 0; i<s.length(); i++){
            selected = s.charAt(i);
            if(selected == 'I') {
                if(i< s.length()-1) {
                    next = s.charAt(i + 1);
                    if (next == 'X') {
                        ret += 9;
                        i++;
                        continue;
                    }
                    if (next == 'V') {
                        ret += 4;
                        i++;
                        continue;
                    }
                }
                ret+=1;
                continue;
            }
            if(selected == 'V') {
                ret += 5;
                continue;
            }
            if(selected == 'X') {
                if(i< s.length()-1) {
                    next = s.charAt(i + 1);
                    if (next == 'L') {
                        ret += 40;
                        i++;
                        continue;
                    }
                    if (next == 'C') {
                        ret += 90;
                        i++;
                        continue;
                    }
                }
                ret+=10;
                continue;
            }
            if(selected == 'L') {
                ret += 50;
                continue;
            }
            if(selected == 'C') {
                if(i< s.length()-1) {
                    next = s.charAt(i + 1);
                    if (next == 'D') {
                        ret += 400;
                        i++;
                        continue;
                    }
                    if (next == 'M') {
                        ret += 900;
                        i++;
                        continue;
                    }
                }
                ret+=100;
                continue;
            }
            if(selected == 'D') {
                ret += 500;
                continue;
            }

            if(selected == 'M') {
                ret += 1000;
                continue;
            }
        }

        return ret;
    }
}
