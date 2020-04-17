package day6;

import java.util.Arrays;

public class Deomo3 {
	public static void main(String args[]) {
		int[ ]ints= {88,44,66,25,100,-2};
		System.out.println(ints.length);
		System.out.println("********原来的数据********");
		 for(int i:ints) {
			 System.out.print(i+"\t");
			
		}
		
		Arrays.sort(ints);
		System.out.println();
		System.out.println("**********排序后***********");
		 for(int i:ints) {
			 System.out.print(i+"\t");
		 }
		 System.out.println();
		System.out.println("************降序**********");
		 for(int i=ints.length-1;i>=0;i--) {
			 System.out.print(ints[i]+"\t");
			 
		 }
				
		
	}
}
