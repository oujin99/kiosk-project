package kiosk;

public class BurgerMenu {
	
	public void menu() {
		String[] menu = {	"1.통새우와퍼\t8,600원", "2.베이컨치즈와퍼\t9,600원"
							, "3.불고기와퍼\t7,800원", "4.몬스터와퍼\t9,900원"
							, "5.콰트로치즈와퍼\t8,600원", "6.담기"};
			System.out.println("---------**버거 메뉴**---------");
			for (int i = 0; i < menu.length; i++) {
				System.out.printf(menu[i] + "\n");
			}
			System.out.println("-----------------------------");
	}
	
	public String cartMenu(int cmenu) {
		String[] menu = {	"통새우와퍼\t\t8,600원", "베이컨치즈와퍼\t9,600원"
							, "불고기와퍼\t\t7,800원", "몬스터와퍼\t\t9,900원"
							, "콰트로치즈와퍼\t8,600원"};
		return menu[cmenu-1];
	}
	
	public int price(int cmenu) {
		int[] menuPrice = {8600, 9600, 7800, 10200, 8600};
		
			return menuPrice[cmenu-1];	
	}
}

