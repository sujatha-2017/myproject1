package String;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a s");
		String s = sc.next();
		String reverse="";
		//char a[]=s.toCharArray();
		//int len=a.length;
		int len=s.length();
		for(int i=len-1;i>=0;i--) {
			//reverse=reverse+a[i];
			reverse=reverse+s.charAt(i);
			
		}
		if(s.equals(reverse)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("is not a palindrome");
		}
		
		
	}

}
