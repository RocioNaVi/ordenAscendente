package Examen2021;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (Parameterized.class)
public class ordenAscendenteTest2 {

	public int[] list = new int[3];   // Test fixture
    public boolean result;

    public ordenAscendenteTest2 (int a, int b, int c, boolean result)
    {
       this.list[0] = a;
       this.list[1] = b;
       this.list[2] = c;
       this.result = result;
    }

   @Parameters
   public static Collection<Object[]> contarValues()
   {
       return Arrays.asList (new Object [][] {{-1,-1,-1, false}, {-1,2,2,false}}); 
   }

   @Test
   public void additionTest()
   {
	   ordenAscendente o = new ordenAscendente();
	   assertTrue ("Addition Test", result == o.ordenado(list));
   }
   
}
