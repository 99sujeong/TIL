package chap5;

public class java5_1 {

	public static void main(String[] args) {
		// Ŭ���� 1
		// ��ü ���� : new 
		Book sjBook = new Book();
		
		sjBook.SetTitle("Java Programming");
		System.out.println("Book Title : " + sjBook.GetTitle());
		
		sjBook.m_strPublisher = "SJ";
		System.out.println("Book Publisher : " + sjBook.m_strPublisher);
		
		sjBook.m_nPage = 100;
		
	}

}

class Book {
	// ��� ����
	String m_strTitle;		// å ����
	int m_nPage;			// ������ �� 
	String m_strPublisher;	// ���ǻ� 
	int m_nPrice;			// ����
	
	
	void SetTitle(String strTitle)
	{
		m_strTitle = strTitle;
	}
	
	String GetTitle()
	{
		return m_strTitle;
	}
	
	void setPage(int nPage)
	{
		m_nPage = nPage;
	}
	
	int GetPage()
	{
		return m_nPage;
	}
	
	void SetPublisher(String strPublisher)
	{
		m_strPublisher = strPublisher;
	}
	
	String GetPublisher()
	{
		return m_strPublisher;
	}
	
	void SetPrice(int nPrice)
	{
		m_nPrice = nPrice;
	}
	
	int GetPrice()
	{
		return m_nPrice;
	}
}