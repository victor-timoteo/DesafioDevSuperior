package util;

public class Bill {

	public static char gender;
	public static int beer;
	public static int barbecue;
	public static int softDrink;
	
	public static double cover() {
		if(feeding() < 30.00) {
			return 4.00;
		}else {
			return 0.00;
		}
	}
	
	public static double feeding() {
		return (beer * 5) + (softDrink * 3) + (barbecue * 7);
	}
	
	public static double ticket() {
		if(gender == 'M') {
			return 10.00;
		} else{
			return 8.00;
		}
	}
	
	public static double total() {
		return cover() + feeding() + ticket();
	}

}
