package chap3;

public class java3_3 {
	public static void main(String[] args) {
		// continue
		for ( int i = 0; i < 5; i++)
		{
			if (i == 3)
				continue;
			System.out.println(i);
		}

		// break
		int i = 0;
		
		OUT : while(true)
		{
			while(true)
			{
				i++;
				if (i == 3)
				{
					System.out.println("java programming");
					break OUT;
				} else {
					System.out.println("good!");
				}
			}
		}
	}

}
