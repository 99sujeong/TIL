package chap4;

public class java4_4 {

	public static void main(String[] args) {
		// 배열 초기화 - 2차원
		int[][] nArray = { {1, 2}, {3, 4, 5} };
		
		for (int i = 0; i < nArray.length; i++)
		{
			for (int j = 0; j < nArray[i].length; j++)
			{
				System.out.printf("%1$d ", nArray[i][j]);
			}
			System.out.println();
		}
	}	

}
