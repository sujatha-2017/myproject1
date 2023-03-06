package String;

public class comparation {
	
	public static void main(String[] args) {
		String s1="welcome";
		//case1//
		String s="welcome",
		s2="welcome";
		System.out.println("CASE1");
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
	
		//case2//
		System.out.println("CASE2");
		String s3=new String("welcome");
		String s4=new String("welcome");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		//case3//
		String s5="hai";
		String s6=new String("hai");
		String s7=s6;
		System.out.println("CASE3");
	System.out.println(s5==s6);
	System.out.println(s5.equals(s6));
	System.out.println(s6==s7);
	System.out.println(s6.equals(s7));
	System.out.println();
		
		
		
	}
	
	

}
