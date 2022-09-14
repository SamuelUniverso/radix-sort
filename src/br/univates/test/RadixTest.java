package br.univates.test;

import org.junit.Test;

import br.univates.main.Radix;

public class RadixTest {
	
	@Test
	public void testRadix1(){
		
		Radix r = new Radix();
		
		int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
	    int n = arr.length;

	    r.radixsort(arr, n);
	    r.print(arr, n);
	}
	
	@Test
	public void testRadix2(){
		
		Radix r = new Radix();
		
		int arr[] = { 110, 221, 442, 663, 884, 1105, 1326, 1547, 1768, 1989 };
	    int n = arr.length;

	    r.radixsort(arr, n);
	    r.print(arr, n);
	}
	

}
