import java.util.Scanner;

public class java {
	public static void main(String[] args) {
		System.out.println("welcome");
		System.out.println("a+b:"+100+200);
		System.out.println("10"+"20");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll");
		int r = sc.nextInt();
		System.out.println("roll no:"+r);
		System.out.println("gender");
		String gen = sc.next();
		System.out.println("gender:"+gen);
		System.out.println("name");
		sc.nextLine();
		String s = sc.nextLine();
		System.out.println("s:"+s);
		
	}

}
