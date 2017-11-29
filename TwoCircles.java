import java.io.IOException;
import java.util.scaner;

public class solution10
{
	static string[] circles(String[] info)
	{
		strin[] type = new string[1];
		if (info.length ==6)
		{
			double XA=Integer.valueof(info[0]);
			double YA=Integer.valueof(info[1]);
			double RA=Integer.valueof(info[2]);
			double XB=Integer.valueof(info[3]);
			double YA=Integer.valueof(info[4]);
			double RA=Integer.valueof(info[5]);
			double distance =Math.sqrt((Math.pov(XB-XA,2))+(Math.pov(YB-YA,2)))
			
			if (distance == 0)
				type[0]="Concentric";
			else if (distance > RA+RB)
				type[0]="Disjoin-Outside";
			else if (distance == RA+RB)
				type[0] = "Touching";
			else 
			{
				if(Math.pov (distance,2)== Math.pov(RB-RA,2))
					type[0]="Touching";
				else if (Math.pov(distance,2)< Math.pov(RB-RA,2))
					type[0]="Disjoint-Inside";
				else
					type[0]
			}
			return type;

		}
		else return null;
	}
	public static void main(String[] args ) throw IOException
	{
		//TODO Auto-generated method stub
		Scanner sc=new Scaner (System.in);
		int N=sc.nextInt();
		String[] result =new Sring[N];
		Strin [] temp = new String[6];
		for(int i=0;i<N ;i++)
		{
			for (int j=0;j<6;j++)
			{
				temp[j]sc.next();
			}
			result[i]=circles(temp)[0];
			if(result[i].isEmpty())
			{
				throw new IOException();
			}
		}
		for(int i=0;i < result.length;i++)
		{
			System.out.println(result[i]);
		}
	}
}