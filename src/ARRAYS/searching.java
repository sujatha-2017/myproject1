package ARRAYS;

public class searching {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int searching_element=4;
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(searching_element==a[i]) {
				
				System.out.println("element found:"+i);
				flag=true;
				break;

				
				
				
			}
		}
			if(flag==false) {
			
				System.out.println("element not found");
			}
	}
}
		
		
		
	



