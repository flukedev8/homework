import java.util.*;
class atm {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n ;
		do{System.out.print("money for you :  ");
		 n = sc.nextInt();

		int a,b,c;
		a = n/1000;
		n = n%1000;
		b = n/500;
		n = n%500;
		c = n/100;
		n = n%100;

		if (n!=0) System.out.println("not put the tens you ok??");
		else System.out.println("1000: "+a+"\t500: "+b+"\t100: "+c);
	}while (n!=0) ;
	}
}