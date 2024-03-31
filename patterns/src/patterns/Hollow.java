package patterns;

public class Hollow {
	public static void pattern(int m, int n) {
		for (int i = 1; i <=m; i++) {
			for (int j = 1; j <=n; j++) {
				if(i==1||j==1||i==m||j==n)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 5;
		int n = 4;
		pattern(m, n);
	}

}
