package chap3;

public class java3_2 {

	public static void main(String[] args) {
		// ���ù�
		// if ~ else��
		int nVar = 12;
		if (nVar < 20 )
		{
			System.out.println("java programming");
		} else {
			System.out.println("good!");
		}
		
		// switch��
		int nVar2 = 2;
		switch( nVar2 )
		{
		case 1:
			System.out.println("java1");
			break;
		case 2:
			System.out.println("java2");
			break;
		case 3:
			System.out.println("java3");
			break;
		default:
			System.out.println("����");
		}

	}

}
