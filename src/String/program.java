package String;

public class program {
	public static void main(String[] args) {
		String s="welcome",s1=" hai ",s2=" dad ";
		//String s=new String("welcome");
		
		//length() -returns length of a string//
		System.out.println(s.length());
		
		//concat()//
		System.out.println(s.concat(s1).concat(s2));
		
		//trim()
		System.out.println("before s1:"+s1.length());
		System.out.println("after s1:"+s1.trim().length());
		
		//charAt()//
		System.out.println("character:"+s.charAt(0));
		System.out.println("character:"+s.charAt(2));
		
		//contains("")//
		System.out.println(s.contains("wel"));
		
		//s.equals---s.equalsIgnorecase//
		String s5="SELENIUM",
		s6="selenium";
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		
		//replace//
		System.out.println(s.replace("l", "n"));
		String g="selenium in selenium automation";
		System.out.println(g.replace("selenium", "java"));
		
		//to lowercase and to uppercase//
		System.out.println(s.toUpperCase());
		System.out.println(s5.toLowerCase());
		
		//split//
		
		String g1="abc@gmail.com";
		String g3="welcom to java ";
		String b[]=g3.split(" ");
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		String a[]= g1.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		//substring//
		String substring = s.substring(1, 5);
		System.out.println("substring:"+substring);
		System.out.println(s5.substring(0, 3));
		
		
		
		
		
		
		
		
		
	}

}