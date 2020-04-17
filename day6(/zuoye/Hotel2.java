package day6.zuoye;

public class Hotel2 {
	public  String hotel_name;
	public	String address;
	public String bed_mode;
	public String    price_mode;
	public boolean vouchers;
	
	public void green_door() {
		System.out.println(hotel_name);
		System.out.println(address);
		if(bed_mode=="豪华双床房"&&price_mode=="门市价"&&vouchers==false) {
			System.out.println("399元");
		}else if(bed_mode=="豪华双床房"&&price_mode=="会员专享价"&&vouchers==false){
			System.out.println("339元");
		}else if(bed_mode=="豪华双床房"&&price_mode=="会员专享价"&&vouchers==true){
			System.out.println("319元");
		}else if(bed_mode=="豪华双床房"&&price_mode=="门市价"&&vouchers==true){
			System.out.println("379元");
		}
	}
}
