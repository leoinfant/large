import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
	int a=n.nextInt();
	int b=n.nextInt();
	int c=0;

	c=a;
	a=b;
	b=c;
	
	System.out.println(a);
	
	System.out.println(b);
	}

}
