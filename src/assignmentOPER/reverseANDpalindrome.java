package assignmentOPER;

public class reverseANDpalindrome {
	public static void main(String[] args) {
		
	
	int rev=0,temp;    
	  int n=465; //It is the number variable to be checked for palindrome  
	  
	  temp=n; 
	 
	  while(n>0){    
	    //getting remainder  
	   rev=(rev*10)+n%10;    
	   n=n/10;    
	  } 
	  System.out.println("reverse program:"+rev);
	 
	  if(temp==rev)  {  
	   System.out.println(" palindrome number "); 
	  }
	  else {   
	   System.out.println(" not palindrome ");    
	}  
	
}
}
