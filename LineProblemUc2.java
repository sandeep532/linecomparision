import java.util.Scanner;
public class LineProblemUc2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1,y1,x2,y2 values");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int sum=(int)Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.println("Enter a1,b1,a2,b2 values");
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		int sum1=(int)Math.sqrt(Math.pow(b1-a1,2)+Math.pow(b2-b1,2));
		if(sum==sum1){
			System.out.println("lengths are equal");}
		else{
			System.out.println("lengths are not equal");}

	}
}