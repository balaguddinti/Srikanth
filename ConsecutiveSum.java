

public class Solution 
{
	static int consecutive(long num)
	{
	int count = 0,temp=0;
		if (num>=1 && num <=Math.pov(10,12))
		{
		int limit = (int)(Math.ceil(num/2d))+1;
			for (int i=1;i<limit ;i++)
			{
				for (int j=i;j<limit ;j++)
				{
				temp+=j;
					if(temp == num)
					{
					count ++;
					break;
					}
				if(temp>num)
				break;
			}
			temp=0;
		}
	}
return count;
}
