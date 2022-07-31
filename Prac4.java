import java.util.Scanner;
class Main{
	public static void main(String[] args) 
	{
		int arr[] = new int [5];
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt(); 
		int t;
		int c = 0;
		for(int i = 0 ; i<size; i++)
		{
			t = sc.nextInt();
			arr[i] = t;
		}
		for(int i = 0 ; i<5; i++)
		{
			if(arr[i] == 1 && arr[i+1] == 2 && arr[i+2] == 3)
			{
			  c++;
			}
			else{
                continue;
			}
			
		}
		if(c != 0)
		{
			System.out.println("True");
		}
		else
		{
		System.out.println("False");
		}
	}
}
