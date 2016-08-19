import java.util.Scanner;
import java.util.Random;

public class chelsea
{
	public static void main(String h[])
	{
		int frequency[] = new int[10];
		Random rand = new Random();
		
		for(int a=0; a < 10; a++)
		{
			++frequency[ rand.nextInt(10)];
		}
		
		for(int b=0; b < 10; b++)
		{
			System.out.print(b + "\t" + frequency[b]);
		}
	}
}