package chap4;

public class java4_3 {

	public static void main(String[] args) {
		// �迭 - 2����
		int nVar = 1;
		int[][] nArray;
		nArray = new int[3][];
		
		nArray[0] = new int[2];
		nArray[1] = new int[3];
		nArray[2] = new int[5];
		
		for (int i = 0; i < nArray.length; i++) // nArray�� �࿡ ���� �ٷ�
		{
			for (int j = 0; j < nArray[i].length; j++)	// nArray�� ���� ���� ���� �ٷ�
			{
				nArray[i][j] = nVar++;
				System.out.printf("%1$d ", nArray[i][j]);	// format
			}
			System.out.println();
		}
	}

}