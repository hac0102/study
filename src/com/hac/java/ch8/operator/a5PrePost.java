package com.hac.java.ch8.operator;

public class a5PrePost {
	public static void main(String[] args) {
		 int i = 3;
         i++;
         System.out.println(i); // 4 출력
         ++i;
         System.out.println(i); // 5 출력
         System.out.println(++i); // 6 출력
         System.out.println(i++); // 6 출력
         System.out.println(i); // 7 출력		
		
	}
}
