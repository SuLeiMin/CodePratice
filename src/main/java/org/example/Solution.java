package org.example;

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String dup ="";
        for(int i=0;i<s.length();i++){
            String str = Character.toString(s.charAt(i));
            if(!dup.contains(str)){
                dup=dup+s.charAt(i);
            }
        }
        System.out.print(dup.length());
    }
}
