package day6.zuoye;

public class Hotel3 {
	public  String hotel_name;
	public	String address;
	public String bed_mode;
	public String    price_mode;
	public boolean vouchers;
	
	public void green_lake() {
		System.out.println(hotel_name);
		System.out.println(address);
		if(bed_mode=="高级大床床房"&&price_mode=="门市价"&&vouchers==false) {
			System.out.println("189元");
		}else if(bed_mode=="高级大床房"&&price_mode=="会员专享价"&&vouchers==false){
			System.out.println("161元");
		}else if(bed_mode=="高级大床房"&&price_mode=="会员专享价"&&vouchers==true){
			System.out.println("151元");
		}else if(bed_mode=="高级大床房"&&price_mode=="门市价"&&vouchers==true){
			System.out.println("179元");
	}
}
}
