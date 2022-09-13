package br.univates.test;

import org.junit.Test;

import br.univates.main.Radix;

public class RadixTest {
	
	@Test
	public void testRadix1(){
		
		Radix r = new Radix();
		
		int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
	    int n = arr.length;

	    // Function Call
	    r.radixsort(arr, n);
	    r.print(arr, n);
	}
	
	@Test
	public void testRadix2(){
		
		Radix r = new Radix();
		
		int arr[] = { 221, 442, 663, 883 };
	    int n = arr.length;

	    // Function Call
	    r.radixsort(arr, n);
	    r.print(arr, n);
	}
	

}
