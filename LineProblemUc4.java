import java.util.*;
public class LineProblemUc4
{
public static void compareTo(int x1,int y1,int x2,int y2,int a1,int b1,int a2,int b2)
{
double len1 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
double len2 = Math.sqrt(Math.pow(a2-a1,2)+Math.pow(b2-b1,2));
System.out.println("length of line 1 "+len1);
System.out.println("length of line 2 "+len2);
if(len1 == len2)
System.out.println("lengths are equal");
else if(len1>len2)
System.out.println("length 1 is greater");
else
System.out.println("length 2 is greater");

}
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
		compareTo(x1,y1,x2,y2,a1,b1,a2,b2);
	}
}