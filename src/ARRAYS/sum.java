package ARRAYS;

public class sum {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int sum=0,evencount=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum of a value is:"+sum);
		System.out.println("even count value");
		
		for(int j=0;j<a.length;j++) {//i and j are indices//
			if(a[j]%2==0) {
				System.out.println(a[j]);

			
			}
		}
		System.out.println("odd count value");	
			
		for(int oddvalue:a) {
		if(oddvalue%2!=0) {
			
				System.out.println(oddvalue);
			}
		}
	}
			


}
