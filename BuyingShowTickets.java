import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class BuyingShowTickets {

	public static void main(String[] args) {
		
		int n,p;

		ArrayList<Integer> tickets =  new ArrayList<Integer>();
		Scanner acceptData = new Scanner(System.in);
		System.out.println("Accept Inputs");
		n = acceptData.nextInt();
		for(int i = 0 ; i < n ; i++)
		{
			//tickets[i]= acceptData.nextInt();
			tickets.add(acceptData.nextInt());
		}
		p = acceptData.nextInt();
		acceptData.close();
		
		BuyingShowTickets bst = new BuyingShowTickets();
		bst.waitingTime(tickets,n,p);
	}
	public void waitingTime(ArrayList<Integer> tickets,int n,int p)
	{
		int time = 0,ticketsRequired= 0;
		int q = p;
		while(tickets.get(q) > 0)
		{
			for(int i =0 ;(i < n)&&(tickets.get(q) > 0) ; i++)
			{
				ticketsRequired = tickets.get(i) - 1;
				tickets.set(i,ticketsRequired); 
				time = time+1;
				if((tickets.get(i) == 0)&& (i != q))
				{
					tickets.remove(i);
					tickets.trimToSize();
					n = n-1;
					i = i-1;
					q = q-1;
					
				}
			}
		}
		System.out.println("Time needed :"+time);
	}

}
