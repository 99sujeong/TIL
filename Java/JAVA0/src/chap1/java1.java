package chap1;

public class java1 {

	public static void main(String[] args) {
		// int, float
		int nVar = 12;
		float fVar = 3.14f;
		
		System.out.print(nVar);
		System.out.print(fVar);
		System.out.println();
		System.out.println("정수 : " + nVar + "  부동소수 : " + fVar);
		System.out.printf("정수 : %1$d 부동소수 : %2$.2f", nVar, fVar);	// format을 통해 출력
	}

}
