package day6;

public class Demo1 {
	public static void main(String args[]) {
		//二维数组
		String[][] cities= new String[2][2];
		
		cities[0][0]="苏州";
		cities[0][1]="无锡";
		cities[0][2]="常熟";
		
		cities[1][0]="洛阳";
		cities[1][1]="郑州";
		cities[1][2]="信阳";
		
		for(String[] c:cities) {
			for(String cc:c) {
				System.out.println(cc);
			}
		}
	}
}
