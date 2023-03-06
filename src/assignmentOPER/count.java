package assignmentOPER;

public class count {
	public static void main(String[] args) {
		int num=12345;
		int count=0;
		while(num!=0) { //12345 1234   123   12       1      0!=0F
			num=num/10;//1234    123   12    1    (1/10= 0)
			count++;    // 1        2     3    4        5
		
			
		
		}
		System.out.println("no of digits:"+count);
		
	}

}
