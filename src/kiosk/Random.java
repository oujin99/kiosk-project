package kiosk;

public class Random {
	//싱글톤
	private static Random rd;
	
	public static Random getInstance() {
		if(rd == null) {
			rd = new Random();
		}
		return rd;
	}
	
	public static void freeInstance() {
		rd = null;
	}
	
	private Random() {
		
	}
	
	public int random(int max, int min) {
		int a = (int)((Math.random()*(max  - min + 1))+min);
		return a;
	}
	

}
