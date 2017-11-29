

import java.util.Scanner;

public class PsychometricTesting {

	static int[] jobOffers(int[] scores, int[] lowerLimits,
			int[] upperLimits) {
		// TODO Auto-generated method stub
		int[] result = new int[lowerLimits.length];
		
			for (int j = 0; j < lowerLimits.length; j++) {
				int count=0;
				for (int i = 0; i < scores.length; i++) {
				if(lowerLimits[j]<=scores[i] && scores[i]<=upperLimits[j])
					count++;
			}
			result[j]=count;
		}
		return result;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int[] result = null;
		int[] scores = new int[A];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt();
		}
		int B = sc.nextInt();
		int[] lowerLimits = new int[B];
		for (int i = 0; i < lowerLimits.length; i++) {
			lowerLimits[i] = sc.nextInt();
		}
		int C = sc.nextInt();
		int[] upperLimits = new int[C];
		for (int i = 0; i < upperLimits.length; i++) {
			upperLimits[i] = sc.nextInt();
		}
		if (B==C)
		{
			result = new int[B];
			result=jobOffers(scores,lowerLimits,upperLimits);
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
