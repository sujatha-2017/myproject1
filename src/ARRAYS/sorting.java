package ARRAYS;

import java.util.Arrays;
import java.util.Collections;

public class sorting {
	public static void main(String[] args) {
		int a[]= {50,30,20,40,10};
		System.out.println("before sort:"+Arrays.toString(a));
		//Arrays.parallelSort(a);
		//System.out.println("after sort:"+Arrays.toString(a));
		
		//approach2//
		
		Arrays.sort(a);
		System.out.println("after sort:"+Arrays.toString(a));
		
		//approach3//
		Integer a1[]= {50,30,20,40,10};
		Arrays.sort(a1,Collections.reverseOrder());
		System.out.println("descending order:"+Arrays.toString(a1));
		
		
	}

}
