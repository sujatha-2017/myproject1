package String;

import java.util.Scanner;

public class reverseString {
	public static void main(String[] args) {
		
	String s="ABCD";
	String rev="";
	//int len = s.length();
	//for(int i=len-1;i>=0;i--) {
		//rev=rev+s.charAt(i);}
	//System.out.println("reverse of a string:"+rev);
		
		System.out.println("using character");
		char a[]  = s.toCharArray();
		
		int len1=a.length;
		
		for(int i=len1-1;i>=0;i--) {
			rev =rev+a[i];
		}
		System.out.println("rev:"+rev);
		
	
		
		System.out.println("using buffer");
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		
		
	
	

}
}
