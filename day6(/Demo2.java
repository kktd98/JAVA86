package day6;

public class Demo2 {
	public static void main(String args[]) {
		String[][] proCitys= {{"河南省"},{"郑州","洛阳","信阳"}};
		
		for(String[] pcs:proCitys) {
			for(String pc:pcs) {
				System.out.println(pc);
			}
		}
	}
}
