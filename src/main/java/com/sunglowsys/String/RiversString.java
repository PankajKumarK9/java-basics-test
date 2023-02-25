package com.sunglowsys.String;

public class RiversString {

    public static  String riverseString(String str) {
        StringBuffer reverse = new StringBuffer(" ");
        for (int i = str.length()-1; i >= 0; i-- ) {
             reverse.append(str.charAt(i));
        }return reverse.toString();
    }
    public static void main(String[] args) {
        String str = "Pankaj";
        System.out.println(riverseString(str));
    }
}
