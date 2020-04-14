package day3;
/**
 * 
 * @author nlc
 * @date   2020年4月14日
 */
public class Demo1 {
	public static void main(String args[]) {
		boolean a = 10>100;
		boolean b = 10<100;
		System.out.println(a||b);
		System.out.println(a||!b);
		System.out.println(!a||b);
		System.out.println(!a||!b);
		System.out.println(!a||!b);
		
		
		System.out.println(a&&b);
		System.out.println(!a&&b);
		System.out.println(!(a&&b));
		System.out.println("***************************");
		System.out.println(7>6?true:false);
		System.out.println("***************************");
		String loginName =null;
		String loginName2 ="张三";
		
		System.out.println(loginName !=null ? (loginName.equals(loginName2)?"相等":"不相等"):"值为空");
		
		
	}
}
