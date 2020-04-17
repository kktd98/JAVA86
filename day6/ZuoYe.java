package day6;

import java.util.Random;

import day6.zuoye.Hotel1;
import day6.zuoye.Hotel2;
import day6.zuoye.Hotel3;

public class ZuoYe {
	public static void main(String args[]) {
		Hotel1 hotel1=new Hotel1();
		hotel1.hotel_name="格林豪泰苏州火车站南广场拙政园商务酒店";
		hotel1.address="江苏省苏州市姑苏区人民路2156号";
		hotel1.bed_mode="大床房";
		hotel1.price_mode="门市价";
		hotel1.vouchers=true;
		hotel1.green_station();
		int a=(int)(Math.random()*1000000000+1);	
		System.out.println("您的订单号: "+a);
		System.out.println("********************");
		
		
		Hotel2 hotel2=new Hotel2();
		hotel2.hotel_name="格雅苏州工业园区金鸡湖东方之门酒店";
		hotel2.address="江苏省苏州工业园区星海街169号";
		hotel2.bed_mode="豪华双床房";
		hotel2.price_mode="会员专享价";
		hotel2.vouchers=true;
		hotel2.green_door();
		int b=(int)(Math.random()*1000000000+1);	
		System.out.println("您的订单号: "+b);
		System.out.println("********************");
		
		Hotel3 hotel3=new Hotel3();
		hotel3.hotel_name="格林豪泰苏州漕湖工业园智选酒店";
		hotel3.address="江苏省苏州市相城区黄畦路3号";
		hotel3.bed_mode="高级大床房";
		hotel3.price_mode="会员专享价";
		hotel3.vouchers=true;
		hotel3.green_lake();
		int c=(int)(Math.random()*1000000000+1);	
		System.out.println("您的订单号: "+c);
		System.out.println("********************");
	}

	
}
