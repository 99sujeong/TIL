package chap4;

public class java4_1 {

	public static void main(String[] args) {
		// 배열 - 1차원
		int[] nArray;
		nArray = new int[5];
		
		for (int i = 0; i < 5; i++) 
		{
			nArray[i] = i + 1;
			System.out.printf("%1$d ", nArray[i]); // format
		}
		
		System.out.println();
		
		for (int i = 0; i < nArray.length; i++) // .length -> 배열 길이 
		{
			nArray[i] = i + 1;
			System.out.printf("%1$d ", nArray[i]); // format
		}
		
	}

}
