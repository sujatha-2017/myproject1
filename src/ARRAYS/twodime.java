package ARRAYS;

public class twodime {
	public static void main(String[] args) {
		int a[][]= {{1,2},
					{3,4},
					{5,6}
					};
		System.out.println("no of rows:"+a.length);
		System.out.println("no of columns:"+a[0].length);
		//for(int i=0;i<a.length;i++) {
			//for(int j=0;j<a[i].length;j++) {
				//System.out.println(a[i][j]);
				
			//}
			
		//}
		for(int x[]:a) {
			for(int v:x) {
				System.out.print(v+" ");
			}
			
		}
		System.out.println();
	}

	}

