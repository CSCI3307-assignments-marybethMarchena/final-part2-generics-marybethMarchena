/**
 * 
 */
package com.mycompany.finalpart2;

/**
 * @author MaryBeth
 *
 */
public class MainEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		private Integer i1;
		private Float f1;
		
		MyGenInterface<Integer, String> mgi1 = new MyGenClass<>(1, "MaryBeth");
		MyGenInterface<Integer, Integer> mgi2 = new MyGenClass<>(1, 2017);
		
		i1 = getSum(10, 20);
		f1 = getSum(100f, 200f);
		
		//outputs
		System.out.println("mgi1: Key: " + mgi1.getKey() + "  Value: " + mgi2.getValue());
		System.out.println("mgi2: Key: " + mgi2.getKey() + "  Value: " + mgi2.getValue());
		
		System.out.println("Integer: " + i1);
		System.out.println("Float: " + f1);

	}

}
