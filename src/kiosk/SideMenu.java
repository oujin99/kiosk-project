package kiosk;

public class SideMenu{
	
	
	public void menu() {
		String[] side = {	"1.너겟킹\t\t3,500원", "2.어니언링\t\t3,000원"
							, "3.코울슬로\t\t2,700원", "4.콘샐러드\t\t2,700원"
							, "5.치즈스틱\t\t2,700원", "6.담기"};
		System.out.println("---------**사이드 메뉴**---------");
		for (int i = 0; i < side.length; i++) {
			System.out.printf(side[i] + "\n");
		}
		System.out.println("-----------------------------");
	}
	
	public String cartSide(int cside) {
		String[] menu = {	"너겟킹\t\t3,500원", "어니언링\t\t3,000원"
							, "코울슬로\t\t2,700원", "콘샐러드\t\t2,700원"
							, "치즈스틱\t\t2,700원"};
		return menu[cside-1];
	}
	
	public int price(int cside) {
		int[] sidePrice = {3500, 3000, 2700, 2700, 2700};
		
		return sidePrice[cside-1];
	}

}
