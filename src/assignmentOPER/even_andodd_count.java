package assignmentOPER;

public class even_andodd_count {
	public static void main(String[] args) {
		
		int n=1234,even_count=0,odd_count=0;
		
		while(n!=0) {  //1234  123  12   1 0!=0F
			int rem=n%10;//4   3    2    1
		
			if(rem%2==0) {   //2   1.5==0  0==0    1==1
			
			even_count++;//1 2
			
		
	}else {
		odd_count++;//1  2
	}
		n=n/10; ///123 12 1  0

}
		System.out.println("no. of even count:"+even_count);
		System.out.println("no. of odd count:"+odd_count);
		
	}
}
