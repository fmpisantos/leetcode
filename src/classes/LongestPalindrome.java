package src.classes;

public class LongestPalindrome {

    public static int max = 0, start = 0;
    public static char[] cA;

    public static String longestPalindrome( String s ){
        cA = s.toCharArray();
        int center = s.length() >> 1;
        max = Math.min( 1, cA.length );
        helper( center, 0 );
        return new String( cA, start, max );
    }

    public static void helper( int center, int direction ) {
        int     i = center - 1,
                j = center + 1;
        while( i >=0 && cA[center] == cA[i] )
            i--;
        while( j < cA.length && cA[center] == cA[j] )
            j++;
        int     left = i,
                right = j;
        while( left >= 0 && right < cA.length ){
            if ( cA[left] != cA[right] )
                break;
            left--;
            right++;
        }
        if( max < right - left - 1 ){
            max = right - left - 1;
            start = left + 1;
        }
        if( i * 2 > max && direction <= 0 )
            helper(i,-1);
        if( ( cA.length - j) * 2 > max && direction >= 0 ){
            helper( j, 1 );
        }
    }

    public static String longestPalindrome2(String s){
        if(s.length() == 1)
            return s;
        if(s.length() == 2)
            return s.charAt(0) == s.charAt(1)?s:Character.toString(s.charAt(0));
        int center  = s.length()/2;
        String  max     = "",
                helper;
        boolean flag = true;
        for( int i = 0; i < s.length() && flag; i++ ){
            flag = false;
            if( center - i > 0  && Math.min(center - i, s.length() - center - i)*2 > max.length() - 2) {
                helper = center(center - i, center - i, s);
                if (helper.length() > max.length())
                    max = helper;
                if (s.charAt(center - i) == s.charAt(center - i + 1))
                    helper = center(center - i, center - i + 1, s);
                if (helper.length() > max.length())
                    max = helper;
                flag = true;
            }

            if( center + i < s.length() && Math.min(center + i, s.length() - center + i)*2 > max.length() - 2) {
                helper = center(center + i, center + i, s);
                if (helper.length() > max.length())
                    max = helper;
                if (s.charAt(center + i -1) == s.charAt(center + i))
                    helper = center(center + i -1, center + i, s);
                if (helper.length() > max.length())
                    max = helper;
                flag = true;
            }
        }
        return max;
    }

    public static String center( int i, int j, String s ){
        boolean flag = i != j;
        char tempI = s.charAt(i), tempJ = flag? s.charAt(j): tempI;
        int add = 1;
        if(tempI != tempJ)
            return Character.toString(tempI);
        StringBuilder max = flag ? new StringBuilder().append(s.charAt(i)).append(s.charAt(j)) : new StringBuilder().append(s.charAt(i));
        if(i > 0){
            char temp1 = s.charAt(i - 1);
            if(temp1 == tempI) {
                max.append(temp1);
                i = i - 1;
            }else if(flag)
                return max.toString();
        }
        if(j < s.length()-1){
            char temp1 = s.charAt(j + 1);
            if(temp1 == tempJ) {
                max.append(temp1);
                j = j + 1;
            }else if(flag)
                return max.toString();
        }
        char left,right;
        for( ;i - add >= 0 && add + j < s.length(); add++ ) {
            left    = s.charAt( i - add);
            right   = s.charAt(add + j);
            if (left == right) {
                max.insert(0,left);
                max.append(right);
            }
            else
                break;
        }
        return max.toString();
    }
}
