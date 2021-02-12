package Examen2021;

public class ordenAscendente {

	public static boolean ordenado (int[] x)
	{
		int n = 0;
		for (int i=0; i < x.length; i++)
		{
			if (x[i] >= n)
			{
				n = x[i];
			}else {
				return false;
			}
		}
		return true;
	}
}
