package chap1;

public class java1 {

	public static void main(String[] args) {
		// int, float
		int nVar = 12;
		float fVar = 3.14f;
		
		System.out.print(nVar);
		System.out.print(fVar);
		System.out.println();
		System.out.println("���� : " + nVar + "  �ε��Ҽ� : " + fVar);
		System.out.printf("���� : %1$d �ε��Ҽ� : %2$.2f", nVar, fVar);	// format�� ���� ���
	}

}