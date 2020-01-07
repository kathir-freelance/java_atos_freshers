class TestPatterns{

	public static void main(String ar[]){
	
		int i=1,j=5,k=1;
		for(;i<=5;i++)
		{
			for(;j>=i;j--)
			{
			System.out.print(" ");
			}
			for(;k<=((2*i)-1);k++)
			{
			System.out.print("*");
			}
		System.out.println("");			
		}

	}
}