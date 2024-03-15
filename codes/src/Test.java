
public class Test {
private static int i=11;
private int j=2;
	public static void main(String[] args) {
	System.out.println("printing i"+i);
	show();
	Test t=new Test();
	t.print();
	}
	private static void show()
	{
	System.out.println("in show"+i);	
	}
	private void print()
	{
		System.out.println("in print "+j);
	}

}
