import java.util.*;
import java.lang.*;

class Multiple {
    int num1 = 100;
    int num2 = 100;
    int result = 0;
    int getTwoMultiple(int n1, int n2) {
        Palindrome p = new Palindrome();
        for(int i = n1; i<=999 ; i++) {            
            for (int j = n2; j<=999 ; j++) {
                if (p.getPalindrome(i*j)) {
                    result = i*j;
                    System.out.println(result);
                }
            }
        }
        return result;
    }
}

class Palindrome {
    boolean getPalindrome(int multiple) {
        String temp = Integer.toString(multiple);
        int[] newmultiple = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            newmultiple[i] = temp.charAt(i) - '0';
        }
        
        for (int i = 0; i<temp.length()/2; i++) {
            if(newmultiple[i] != newmultiple[temp.length()-1-i]) {
                return false; 
            }
        }
        return true;            
    }   
}
//comment
class euler04 {
    public static void main(String[] args) {
        Multiple mn = new Multiple();
        int result = mn.getTwoMultiple(mn.num1, mn.num2);
        System.out.println(result);                 
    }
}