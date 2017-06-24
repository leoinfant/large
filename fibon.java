import java.util.Scanner;

public class Fibnocies {

	public static void main(String[] args) {
		int n=0;
		int n1=1;
		int n2;
		Scanner n=new Scanner(System.in);
		
		int count=n.nextInt();
		System.out.println(+n+n1);
		for(int i=0;i<count;i++){
			n2=n+n1;
			System.out.println(n2);
			n=n1;
			n1=n2;
		}
		
	}

}
