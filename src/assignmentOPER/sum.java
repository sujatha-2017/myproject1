package assignmentOPER;

public class sum {
	public static void main(String[] args) {
		int sum=0,n=1234;
		while(n>0) {//1234           123>0T         12>T            1>0T        0>0F
			sum=sum+n%10;//(0+4=4) (4+3=7)         (7+2=9)       (9+1=10)
			n=n/10;//       123     (123/10=12)     (12/10=1)      (1/10=0)
		}
		System.out.println(sum);
	}

}
