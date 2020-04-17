package day6.zuoye;

public class Hotel1 {
	public  String hotel_name;
	public	String address;
	public String bed_mode;
	public String    price_mode;
	public boolean vouchers;//代金券是否使用 真为用 假为不用
	
	
	public void green_station() {
		System.out.println(hotel_name);
		System.out.println(address);
		if(bed_mode=="大床房"&&price_mode=="门市价"&&vouchers==false) {
			System.out.println("189元");
		}else if(bed_mode=="大床房"&&price_mode=="会员专享价"&&vouchers==false){
			System.out.println("161元");
		}else if(bed_mode=="大床房"&&price_mode=="会员专享价"&&vouchers==true){
			System.out.println("141元");
		}else if(bed_mode=="大床房"&&price_mode=="门市价"&&vouchers==true){
			System.out.println("169元");
		}
		
		else if(bed_mode=="标间"&&price_mode=="门市价"&&vouchers==false){
			System.out.println("169元");
		}else if(bed_mode=="标间"&&price_mode=="会员专享价"&&vouchers==false){
			System.out.println("149元");
		}else if(bed_mode=="标间"&&price_mode=="会员专享价"&&vouchers==true){
			System.out.println("139元");
		}else if(bed_mode=="标间"&&price_mode=="门市价"&&vouchers==true){
			System.out.println("159元");
		}
		
		
		
		
		
		else if(bed_mode=="豪华双床房"&&price_mode=="门市价"&&vouchers==false){
			System.out.println("209元");
		}else if(bed_mode=="豪华双床房"&&price_mode=="会员专享价"&&vouchers==false){
			System.out.println("190元");
		}else if(bed_mode=="豪华双床房"&&price_mode=="会员专享价"&&vouchers==true){
			System.out.println("160元");
		}else if(bed_mode=="豪华双床房"&&price_mode=="门市价"&&vouchers==true){
			System.out.println("179元");
		}
		
	}
	
}
