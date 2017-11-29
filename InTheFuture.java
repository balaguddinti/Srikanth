

import java.util.Scanner;

public class solution5 {
	static int minNum(int a, int k, int p) {
		// TODO Auto-generated method stub
		int days=-1;
		if (k<a || k==a)
		{
			days=0;
		}
		else 
		{
			if (p==0)
				days=1;
			else
			{
				for (int j = 0,count=0; count==0; j++) {
					if(k*j > (a*j +p) )
					{
						count=1;
					}
					days=j;
				}
			}
		}
		return days;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int K = sc.nextInt();
		int P = sc.nextInt();
		if (P>=0 && P<=100)
			if ((A>=1 && A<=100) && (K>=1 && K<=100))
				System.out.println(minNum(A,K,P));
	}

	
}
