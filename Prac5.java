import java.util.Scanner;

class Main{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int a = 0,b = 1;
		int c = 0;
		while(a != s1.length())
		{

		   if(s1.charAt(a) == s2.charAt(a) && s1.charAt(b) == s2.charAt(b))
		   {
		   	c++;
		   }
		   a = a+2;
		   b = b+2;

		}

		System.out.println(c);
    }
}
