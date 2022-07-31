class Main{

	 public static void main(String[] args) {

	        for(int i=1;i<=8;i++)
	        {
	            for(int j=8;j>i;j--) 
	            {
	                System.out.print("  ");

	            }
	            int k=1;
	            for(int j=1;j<=i;j++)
	            {
	                System.out.print(k+" ");
	                k = k * 2;
	            }
	            k=k/4;
	            for (int j=1;j<i;j++)
	            {
	                System.out.print(k+" ");
	                k = k / 2;
	            }
	                System.out.println();
	        }
	    }
}
