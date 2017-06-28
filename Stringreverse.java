package reverse;

import java.util.Scanner;

public class Stringreverse {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.next();
		String s2=new StringBuffer(s1).reverse().toString();
		System.out.println(s2);
	}

}
