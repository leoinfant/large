import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		
if(n1>n2&&n2>n3){
	System.out.println(n1 +"is big");}
	else if(n2>n3){
		System.out.println(n2 +"is big");
	}
else{
	System.out.println(n3 +"is big");
	}

   }
}
