package day3;

public class Demo4 {
	public static void main(String args[]) {
		for(int i=0;i<4;i++) {
			if(i==1) {
				System.out.println("输出"+i+"圈");
				continue;
			}
			System.out.println("输出"+i);
		}
	}
}
