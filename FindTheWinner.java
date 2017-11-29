import java.util.ArrayList;
import java.util.Scanner;


public class FindTheWinner {

	public static void main(String[] args) {
		
		int nA,nM;
		String s;
		ArrayList<Integer> a =  new ArrayList<Integer>();
		ArrayList<Integer> m =  new ArrayList<Integer>();
		Scanner acceptData = new Scanner(System.in);
		System.out.println("Accept Inputs");
		nA = acceptData.nextInt();
		for(int i = 0 ; i < nA ; i++)
		{
			//tickets[i]= acceptData.nextInt();
			a.add(acceptData.nextInt());
		}
		nM = acceptData.nextInt();
		for(int i = 0 ; i < nM ; i++)
		{
			//tickets[i]= acceptData.nextInt();
			m.add(acceptData.nextInt());
		}
		acceptData.nextLine();
		s = acceptData.nextLine();
		acceptData.close();
		if(nA == nM)
		{
			FindTheWinner ftw = new FindTheWinner();
			ftw.winner(a,m,s);
	
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
	public void winner(ArrayList<Integer> a,ArrayList<Integer> m,String s)
	{
		int pointsOfAndrea=0,pointsOfMaria=0,diff;
		
		for (int i=0;i<a.size();i++)
		{
			if ((i%2 == 0)&& (s.equalsIgnoreCase("Even")))
			{
				diff = a.get(i) - m.get(i);
				if(diff > 0)
				{
					pointsOfAndrea = pointsOfAndrea + diff;
				}
				else
				{
					if (diff < 0)
					{
						pointsOfMaria = pointsOfMaria - diff;
					}
				}
			}
			else
			{
				if((i%2 != 0)&& (s.equalsIgnoreCase("ODD")))
				{
					diff = a.get(i) - m.get(i);
					if(diff > 0)
					{
						pointsOfAndrea = pointsOfAndrea + diff;
					}
					else
					{
						if (diff < 0)
						{
							pointsOfMaria = pointsOfMaria - diff;
						}
					}
				}
			}
		}
		
		if (pointsOfMaria == pointsOfAndrea)
		{
			System.out.println("Tied");
		}
		else if (pointsOfMaria > pointsOfAndrea)
		{
			System.out.println("Maria");
		}
		else
		{
			System.out.println("Andrea");
		}
	}

}
