import java.util.*;
public class LineProblemUc3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		double len1 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		double len2 = Math.sqrt(Math.pow(a2-a1,2)+Math.pow(b2-b1,2));
		if(len1 == len2)
		System.out.println("lengths are equal");
		else if(len1>len2)
		System.out.println("length of first line is greater");
		else
		System.out.println("length of second line is greater");

	}
}