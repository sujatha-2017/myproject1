//by default it is not possible to do heterogenous ;it only supports homogenous but we can create an object to an array
//object type of an array//
package ARRAYS;

import java.util.Arrays;

public class object_ {
	public static void main(String[] args) {
		Object a[]= {1,2.2,"welcome",'a',4};
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"  ");
			
		}
		System.out.println();
		//for(Object x:a ) {
			//System.out.println(x);
		//}
		
		
		
		
		
		
		
		
	}

}
