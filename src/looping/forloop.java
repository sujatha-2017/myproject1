package looping;

public class forloop {
	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5;j++) {
				if(i==3||j==5) {
					System.out.println("ivalue:"+i);
					System.out.println("jvalue:"+j);
				}
			}
		}
	}

}
