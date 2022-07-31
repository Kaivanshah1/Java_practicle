import java.util.Scanner;
class Main{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nn = sc.nextInt();
		int m = nn % 10;
		if(n == m)
		{
			System.out.println("True");
		}
		else
		{
		System.out.println("False");
		}
    }
}
	
}
