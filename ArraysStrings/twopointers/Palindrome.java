package twopointers;

public class Palindrome{

    public static void main(String[] args){

        String s = "abcdcbar"; // racecar

        int left = 0;
        int right = s.length() -1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                System.out.println("False");
                return;
            }

            left++;
            right--;
        }

        System.out.println("True");

    }

}