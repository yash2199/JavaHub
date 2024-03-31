package patterns;

public class Pyramid1 {
	public static void printpattern(int n) {
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<n-1;j++)
			{
				System.out.println("1");
			}
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		printpattern(n);
	}

}
