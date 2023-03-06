package assignmentOPER;

public class types1 {
	public static void main(String[] args) {
		//arithmatic operators//
		int a=10,b=11,c=12,d=11;
		System.out.println("a+b:"+a+b);
		System.out.println("a-b:"+(a-b));
		System.out.println("a*b:"+(a*b));
		System.out.println("a%b:"+(a%b));//11)100(1
		
		System.out.println("a/b:"+(a/b));
		
		//relational operators//
		System.out.println(a>=b); // true
		System.out.println(a<=b); // true
		
		System.out.println(a!=b); // false
		
		System.out.println(a==b); // true
		
		//logical operators//
		boolean x=true;
		boolean y=false;
				
		System.out.println(x && y); // false
		System.out.println(x || y); // true
		System.out.println(!x); // false
		
		boolean b1=10>20;   //false
		boolean b2=20>10;   //true
		
		System.out.println(b1 && b2);  //false
		System.out.println(b1 || b2);
		
		// increment and decrement//
		d--;
		a-=5;
		b*=5;
		c/=5;
		
		
		System.out.println(d);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//terinary operators//
		int age=20,g=10;
		String res=(age>=18)?"eligible":"not eligible";
		boolean r=g<5?true:false;
		System.out.println("vote:"+res+" \n"+"gender:"+r);
		
		
		
	}

}
