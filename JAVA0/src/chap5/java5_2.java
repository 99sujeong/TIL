package chap5;

public class java5_2 {

	public static void main(String[] args) {
		// Ŭ���� 2 - ���� ������  
		Book2 sjBook = new Book2();
		
		// ��� ������ ���� ���� �ϴ� ���� �ƴ϶�, public���� ����� �޼ҵ带 ���� ��� ������ ���� ���� 
		sjBook.SetTitle("Java Programming");
		System.out.println("Book Title : " + sjBook.GetTitle());
		
		sjBook.SetPublisher("SJ");
		System.out.println("Book Publisher : " + sjBook.GetPublisher());
		
		sjBook.SetPrice(100);
		
	}

}

class Book2 {
	// ��� ����
	private String m_strTitle;		// å ����
	private int m_nPage;			// ������ �� 
	private String m_strPublisher;	// ���ǻ� 
	private int m_nPrice;			// ����
	
	
	public void SetTitle(String strTitle)
	{
		m_strTitle = strTitle;
	}
	
	public String GetTitle()
	{
		return m_strTitle;
	}
	
	public void setPage(int nPage)
	{
		m_nPage = nPage;
	}
	
	public int GetPage()
	{
		return m_nPage;
	}
	
	public void SetPublisher(String strPublisher)
	{
		m_strPublisher = strPublisher;
	}
	
	public String GetPublisher()
	{
		return m_strPublisher;
	}
	
	public void SetPrice(int nPrice)
	{
		m_nPrice = nPrice;
	}
	
	public int GetPrice()
	{
		return m_nPrice;
	}
}