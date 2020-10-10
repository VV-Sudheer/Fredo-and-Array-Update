import java.util.Scanner;

public class CommonFactors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int max = 0, count = 0;
		if (a>b)
			max = a;
		else
			max = b;
		
		for(int i=1; i<max/2; i++) {
			if((a%i==0) && (b%i==0)) {
				count++;
			}
		}
		System.out.println(count);
		scan.close();
	}

}
