package Examen2021;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runners.Parameterized.Parameters;

import findLast.findLast;

import java.util.*;

public class ordenAscendenteTest {

	private int[] list;
	
	@Before
	public void setup() {
		list = new int[3];
	}
	
	@After
	public void down() {
		list = null;
	}
	
   @Test
   public void testForNullList()
   {
      list = null;
      try {
    	  ordenAscendente.ordenado(list);
      } catch (NullPointerException e) {
         return;
      }
      fail ("NullPointerException expected");
   }
	
	
	@Test (expected = NullPointerException.class)
	public void TestNullElement() {
		list[0] = (Integer) null;
		list[1] = 1;
	}
	
	
	@Test 
	public void TestPositive() {
		list[0] = 1;
		list[1] = 2;
		list[2] = 3;
		Boolean result = true;
		assertTrue(result == ordenAscendente.ordenado(list));
	}
	
	@Test 
	public void TestNullNegative() {
		list[0] = -1;
		list[1] = 2;
		list[2] = -3;
		boolean result = false;
		assertTrue(result == ordenAscendente.ordenado(list));
	}
	
	@Test 
	public void TestIguales() {
		list[0] = -1;
		list[1] = 2;
		list[2] = 3;
		boolean result = true;
		assertTrue(result == ordenAscendente.ordenado(list));
	}
	
}

