package chap5;

public class java5_4 {
	
	public static void main(String[] args) {
		// Ŭ���� 4 - ������
		// �Ű����� ���� ������
		A test1 = new A();
		System.out.println("test1 m_nVar : " + test1.Get());
		// this() �̿��� �ٸ� ������ ȣ��
		System.out.println("test1 m_fVar : " + test1.m_fVar);
		// this. �̿��� ��� ���� ���
		test1.SetPrint(11);
		
		// �Ű����� �ִ� ������ 
		A test2 = new A(7);
		System.out.println("test2 m_nVar : " + test2.Get());
		System.out.println("test2 m_fVar : " + test2.m_fVar);
	}
	
}

class A 
{
	private int m_nVar;
	public float m_fVar = 0.5f;
	
	public A()
	{	
		this(3.14f);	// ù �ٿ��� �ٸ� ������ ȣ��
		m_nVar = 12;
	}
	
	public A (int nVar)
	{
		m_nVar = nVar;
	}
	
	public A (float fVar)
	{
		m_fVar = fVar;
	}
	
	// this 
	public void SetPrint(int nVar)
	{
		this.m_nVar = nVar;
		this.Print();
	}
	
	public int Get()
	{
		return m_nVar;
	}
	
	public void Print()
	{
		System.out.println("m_nVar : " + m_nVar);
	}
}