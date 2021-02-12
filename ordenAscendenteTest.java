package Examen2021;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runners.Parameterized.Parameters;

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
	
	//Test para comprbar lista vacia
	@Test (expected = NullPointerException.class)
	public void TestNullList() {
		list = null;
		
	}
	
	
	@Test (expected = NullPointerException.class)
	public void TestNullElement() {
		list[0] = null;
		list[1] = 1;
	}
	
	
	@Test 
	public void TestNullElement() {
		list[0] = 1;
		list[1] = 2;
		list[2] = 3;
		Boolean result = true;
		ordenAscendente o = new ordenAscendente();
		assertTrue(result == o.ordenado(list));
	}
	
	@Test 
	public void TestNullElement() {
		list[0] = -1;
		list[1] = 2;
		list[2] = -3;
		Boolean result = false;
		ordenAscendente o = new ordenAscendente();
		assertTrue(result == o.ordenado(list));
	}
	
}
