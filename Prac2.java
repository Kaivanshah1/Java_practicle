import java.util.Scanner;

class Main{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.charAt(0) == 'o' && s.charAt(1) == 'z')
		{
			System.out.println("oz");
		}
		else if(s.charAt(0) == 'o')
		{
			System.out.println('o');
		}
		else if(s.charAt(1) == 'z')
		{
			System.out.println('z');
		}
    }
}
