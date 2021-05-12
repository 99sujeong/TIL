package chap5;

public class java5_5 {

	public static void main(String[] args) {
		// Å¬·¡½º 5 - static
		B.m_nVar = 5;
		
		B test1 = new B();
		B test2 = new B();
		B test3 = new B();

		System.out.printf("%1$d %2$d %3$d\n", test1.m_nVar, test2.m_nVar, test3.m_nVar);
		
		test1.m_nVar = 11;
		System.out.printf("%1$d %2$d %3$d\n", test1.m_nVar, test2.m_nVar, test3.m_nVar);
		
		B.m_nVar = 7;
		System.out.printf("%1$d %2$d %3$d\n", test1.m_nVar, test2.m_nVar, test3.m_nVar);
		
		B.Print();
	}

}

class B 
{
	public static int m_nVar;
	
	public static void Print()
	{
		System.out.println("java programming");
	}
}