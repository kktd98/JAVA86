package day6;

public class Demo5 {
	public static void main(String args[]) {
		int[] bubbleNums= {66,55,44,33,58,22,84,11,78,32,10,100};
		System.out.println("********升序*******");
		
		int[] newNums= showBubbleSort(bubbleNums);
		for(int i:newNums) {
			System.out.print(i+"\t");
		}
		
	}
	
	public static int[] showBubbleSort(int[] bubbleNums) {
		int n=0;
		boolean flag=false;
		for(int i=0;i<bubbleNums.length-1;i++) {
			for(int j=0;j<bubbleNums.length-1-i;j++) {
				if(bubbleNums[j]>bubbleNums[j+1]) {
					int temp=bubbleNums[j];
					bubbleNums[j]=bubbleNums[j+1];
					bubbleNums[j+1]=temp;
					n++;
					flag=true;
				}
			}
			if(!flag) {
				break;
			}
		}
		System.out.println("比较过的次数:"+n);
		return bubbleNums;
		
	}
}
