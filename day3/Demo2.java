package day3;

public class Demo2 {
	public static void main(String args[]) {
		System.out.println("主程序启动");
		ifrun();
	}
	public static void ifrun() {
		int season = 5;				
		if(season==1) {
			System.out.println("春天");
		}else if(season==2) {
			System.out.println("夏天");
		}else if(season==3) {
			System.out.println("秋天");
		}else if(season==4) {
			System.out.println("冬天");
		}else  {
			System.out.println("错误季节");
		}
	}
}
