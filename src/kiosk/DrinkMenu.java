package kiosk;

public class DrinkMenu{
	
	
	public void menu() {
		String[] drink = {	"1.아메리카노\t2,200원", "2.아이스초코\t2,700원"
							, "3.코카콜라\t\t2,800원", "4.스프라이트\t2,800원"
							, "5.씨그램\t\t2,800원", "6.미닛메이드오렌지\t3,400원", "7.담기"};
		
		System.out.println("-----------**음료수**-----------");
		for (int i = 0; i < drink.length; i++) {
			System.out.printf(drink[i] + "\n");
		}
		System.out.println("-----------------------------");
	}
	
	
	public String cartDrink(int cdrink) {
		String[] drink = {	"아메리카노\t\t2,200원", "아이스초코\t\t2,700원"
							, "코카콜라\t\t2,800원", "스프라이트\t\t2,800원"
							, "씨그램\t\t2,800원", "미닛메이드오렌지\t3,400원"};
		return drink[cdrink-1];
	}
	
	public int price(int cdrink) {
		int[] drinkPrice = {2200, 2700, 2800, 2800, 2800, 3400};
		
		return drinkPrice[cdrink-1];
	}
}
