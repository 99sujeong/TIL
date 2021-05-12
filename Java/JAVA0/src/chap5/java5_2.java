package chap5;

public class java5_2 {

	public static void main(String[] args) {
		// 클래스 2 - 접근 제어자  
		Book2 sjBook = new Book2();
		
		// 멤버 변수로 직접 접근 하는 것이 아니라, public으로 선언된 메소드를 통해 멤버 변수로 간접 접근 
		sjBook.SetTitle("Java Programming");
		System.out.println("Book Title : " + sjBook.GetTitle());
		
		sjBook.SetPublisher("SJ");
		System.out.println("Book Publisher : " + sjBook.GetPublisher());
		
		sjBook.SetPrice(100);
		
	}

}

class Book2 {
	// 멤버 변수
	private String m_strTitle;		// 책 제목
	private int m_nPage;			// 페이지 수 
	private String m_strPublisher;	// 출판사 
	private int m_nPrice;			// 가격
	
	
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