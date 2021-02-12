package Examen2021;

public class ordenAscendente {

	public static boolean ordenado (int[] x)
	{
		int n = x[0];
		for (int i=1; i < x.length; i++)
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
