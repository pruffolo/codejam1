import java.util.Scanner;

public class Solution
{
	public static void sum(String origN, int T, int i)
	{
		Integer num = Integer.parseInt(origN);
		num /= 2;
		String N = num.toString();
		Integer num1 = Integer.parseInt(N);
		Integer num2 = Integer.parseInt(N);
		int counter = 1;
		String int1 = num1.toString();
		String int2 = num2.toString();
		
		if(Integer.parseInt(origN) % 2 != 0)
		{
			num1++;
			int1 = num1.toString();
		}

		for(int q = (int1.length() - 1); q >= 0; q--)
		{
			while(int1.charAt(q) == '4')
			{
				num1 += counter;
				num2 -= counter;
				int1 = num1.toString();
				int2 = num2.toString();
			}
			while(int2.charAt(q) == '4')
			{
				num1 -= counter + 1;
				num2 += counter + 1;
				int1 = num1.toString();
				int2 = num2.toString();
			}
			counter *= 10;
		}
		System.out.println("Case #" + (i+1) + ": " + num1 + " " + num2);
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		String N;
		for(int i = 0; i < T; i++)
		{
			N = input.next();
			sum(N, T, i);
			
		}
	}
}
