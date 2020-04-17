package day6;

import java.util.Arrays;

public class Demo4 {
	public static void main(String args[]) {
		 String loginName="nlc";
		 /*  boolean f=runComparaEQ(loginName);
		 * System.out.println(f?"有此人":"无此人");
		 */
	System.out.println(runComparaEQ(loginName));
	
	}
	private static boolean runComparaEQ(String loginName) {
		String[] names = {"李四","nlc","张三"};
		boolean flag =false;
	for(String n:names) {
		if(n.equals(loginName.trim())) { //trim() 前后去空格
			flag=true;
		}
	}
		return flag;
	}
}
