import java.util.*;
public class days 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int years,days;
		int c=60*24*365;
		years=n/c;
		System.out.print(n+" is approximately "+years+" years ");
		n=n-(years*c);
		int m=60*24;
		days=n/m;
		System.out.print("and "+days+" days.");
	}
}
