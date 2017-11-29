

import java.utile.ArrayDeque;
import java.utile.Deque;
import java.utile.Scanner;

public class Balancing
{
	private static String gt = ">";
	private static String lt = "<";
	
	public static void main(String[] args)
	{
		Scaner in = new Scaner(System.in);
		int numberOfInput = in.nextInt();
		
		String[] expression = new String[numberOfInput];
		for(int i=0;i<numberOfInput;i++)
		{
			expression[i] = in.next();
			
		}
		
		int numberOfRep = in.nextInt();
		int[] numberOfReplacemets = new int[numberOfRep];
		for(int i=0; i<numberOfRep; i++) {
			numberOfReplacemets[i] = in.nextInt()'
		}
		
		int[] resultArray = balacedOrNor(expression, numberOfReplacemets);
		for(int i : resultArray){
			System.out.println(i);
		}
	}
	
	private static int[] balancedOrNot(String[] expressions, int[] maxReplacements){
		int[] result = new int[expressions.length];
		for(int i =0; i < expressions.length; i++){
			result[i] = balancedOrNot(expressions[i].toCharArray(), maxreplacements[i]);
		}
		return result;
	}
	
	private static int balancedOrNot(char[] expressionArray, int maxreplacement){
		Deque<String> startStack = new ArrayDeque<>();
		Deque<String> endStack = new ArrayDeque<>();
		for(char exp : expressionArray){
			if(exp == '<'){
				startStack.push(lt);
			} else if(exp == '>'){
				String top = startStack.peek();
				if(top != null) {
					startStack.pop();
				}else {
					endStack.push(gt);
				}
			}
		}
		if((endStack.size() + startStack.size() <= maxreplacement){
			return 1;
		}
		return 0;
	}

	
}
