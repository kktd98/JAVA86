package day3;

public class ZuoYe1 {
	public static void main(String args[]) {
		hospital();
	}
	public static void hospital() {
		int times=5;
		double time=9.30;
		if (times>3&&time==9.30) {
			System.out.println("你已经被拉入黑名单了");
			System.out.println("9:30不能挂号了 请其他时间去挂号");
		}
	}
}
