package fluke;
import java.util.*;
public class  Tree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Put of number nods:  ");
		int n = sc.nextInt();
		String way1 [] = new String[n+2];
		String way2 [] = new String[n+2];
		int po[] = new int[n+2];
		for (int i =0;i<n+2 ;i++ ) {
			System.out.println();
			System.out.print("way1: ");
			way1[i] = sc.next();
			System.out.println(" to ");
			System.out.print("way2: ");
			way2[i] = sc.next();
			System.out.println();
			System.out.print("number of way:  ");
			po[i] = sc.nextInt();
		}
		int po3[] = po.clone();
		int po4[] = po.clone();
		int po2[] = Sortnumber(po3);
		System.out.println("----------> Print THE WAY  <-------------");

		for (int j =0;j<n+2 ;j++ ) {
				for (int i =0; i<n+2;i++ ) {
				int s = po2[j];
				int y = po4[i];
		
				if (s==y) {
					 System.out.println(way1[i]+"---->"+way2[i]+"\t"+po4[i]);
					 po4[i] = -1;
					break;
				}
			}
		}
		System.out.println("-----------> Print THE Kruskals <------------");
		int minimun= 0;
		
		
		for (int m = 0; m<n-1;m++ ) {
				
			for (int i =0; i<n+2;i++ ) {
				int s = po2[m];
				int y = po[i];
		
				if (s==y) {
					 System.out.println(way1[i]+"---->"+way2[i]+"\t"+po[i]);
					 minimun += po[i];
					po[i] = -1;
					break;
				}
			}
			
		}
		System.out.print("minimun : "+minimun);

 }
public static int[] Sortnumber(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int temp = arr[index]; 
            arr[index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}
