# palindrome

package guvi;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.next();
		StringBuffer s=new StringBuffer(str);
	StringBuffer x=s.reverse();
	System.out.println("the reverse of string is:"+x);
	String str1=x.toString();
	if(str.equals(str1)){
	System.out.println("the given string is palindrome");
	}
	else{
		System.out.println("the given string is not a palindrome");
	}
}
}
	
}
}
