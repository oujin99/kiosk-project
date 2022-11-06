package kiosk;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Kiosk {

	public static void main(String[] args) {
		System.out.println("나 여깄다@@@@@@@@@@@@@@@@");
		LocalDateTime now = LocalDateTime.now();
		String printNow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm"));

		Scanner sc = new Scanner(System.in);
		
		BurgerMenu b = new BurgerMenu();
		SideMenu s = new SideMenu();
		DrinkMenu d = new DrinkMenu();
		
		int price = 0;	// 총 주문금액
		
		for (; ;) {	// 무한반복
			List<String> cart = new ArrayList<>();// 장바구니 기능
			
			System.out.println("1. 포장하기 / 2. 먹고가기");
			int eat = sc.nextInt();
			
			if(eat != 1 && eat != 2) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			if(eat == 1 || eat == 2) {
			b.menu();	// 버거 메뉴판 출력
			for (;;) {	// 버거 메뉴 선택
				System.out.print("주문하실 메뉴를 선택해주세요 : ");
				int cmenu = sc.nextInt();	//메뉴 고르기
					if(cmenu == 1) {
						price += b.price(cmenu);
						cart.add(b.cartMenu(cmenu));
					}else if(cmenu == 2) {
						price += b.price(cmenu);
						cart.add(b.cartMenu(cmenu));
					}else if(cmenu == 3) {
						price += b.price(cmenu);
						cart.add(b.cartMenu(cmenu));
					}else if(cmenu == 4) {
						price += b.price(cmenu);
						cart.add(b.cartMenu(cmenu));
					}else if(cmenu == 5) {
						price += b.price(cmenu);
						cart.add(b.cartMenu(cmenu));
					}else if(cmenu == 6) {
						break;		// 버거 메뉴 선택 for문 종료
					}else {
						System.out.println("잘못 입력하셨습니다.");
						continue;	// 버거 메뉴 선택 for문 반복
					}
			}
			
			System.out.println("사이드 메뉴를 선택하시겠습니까?(1. 네 / 2. 아니오)");
			int answer2 = sc.nextInt();
			
			if(answer2 != 1 && answer2 != 2) {
				System.out.println("잘못입력하셨습니다.");
				answer2 = sc.nextInt();
			}
			
			if(answer2 == 1) {				
				s.menu();		//사이드 메뉴판 출력

				for (;;) {	//사이드 메뉴 선택
					System.out.print("사이드 메뉴를 선택해주세요 : ");
					int cside = sc.nextInt();	//메뉴 고르기
					
						if(cside == 1) {
							price += s.price(cside);
							cart.add(s.cartSide(cside));
						}else if(cside == 2) {
							price += s.price(cside);
							cart.add(s.cartSide(cside));
						}else if(cside == 3) {
							price += s.price(cside);
							cart.add(s.cartSide(cside));
						}else if(cside == 4) {
							price += s.price(cside);
							cart.add(s.cartSide(cside));
						}else if(cside == 5) {
							price += s.price(cside);
							cart.add(s.cartSide(cside));
						}else if(cside == 6) {
							break;		//사이드 선택 for문 종료
						}else {
							System.out.println("잘못 입력하셨습니다.");
							continue;	//사이드 선택 for문 반복
						}
				}
			}
			

			System.out.println("음료수를 선택하시겠습니까?(1. 네 / 2. 아니오)");
			int answer3 = sc.nextInt();
			
			if(answer3 != 1 && answer3 != 2) {
				System.out.println("잘못입력하셨습니다.");
				answer3 = sc.nextInt();
			}
			
			if(answer3 == 1) {
				d.menu();		//음료수 메뉴판 출력
				
				for (;;) {		// 음료수 선택
					System.out.print("음료수를 선택해주세요 : ");
					int cdrink = sc.nextInt();	//음료수 고르기
						if(cdrink == 1) {
							price += d.price(cdrink);
							cart.add(d.cartDrink(cdrink));
						}else if(cdrink == 2) {
							price += d.price(cdrink);
							cart.add(d.cartDrink(cdrink));
						}else if(cdrink == 3) {
							price += d.price(cdrink);
							cart.add(d.cartDrink(cdrink));
						}else if(cdrink == 4) {
							price += d.price(cdrink);
							cart.add(d.cartDrink(cdrink));
						}else if(cdrink == 5) {
							price += d.price(cdrink);
							cart.add(d.cartDrink(cdrink));
						}else if(cdrink == 6) {
							price += d.price(cdrink);
							cart.add(d.cartDrink(cdrink));
						}else if(cdrink == 7) {
							break;	// 음료수 선택 for문 종료
						}else {
							System.out.println("잘못 입력하셨습니다.");
							continue;//음료수 선택 for문 반복
						}
				}
			}
			
			Map<String, Integer> map = new HashMap<String, Integer>();// 중복된 메뉴를 제외한 장바구니
			for (int i = 0; i < cart.size(); i++) {	
				if(map.containsKey(cart.get(i))) {
					map.put(cart.get(i), map.get(cart.get(i))+1);	//메뉴(key값)가 겹친다면 수량(value)+1
				}else {
					map.put(cart.get(i), 1);						//메뉴(key값)가 겹치지 않는다면 수량(value) = 1
				}
			}
			
			for (int i = 0; i < 5; i++) {
				System.out.printf("%20s\n", ".");				
			}
			
			System.out.printf("%22s\n", "<주문메뉴확인>");
			System.out.println("------------------------------------");
			System.out.printf("%5s%15s%11s\n", "메뉴", "단가", "수량");

			for (Map.Entry<String, Integer> entry : map.entrySet()) {	//key와 value모두 출력
				System.out.printf("%s%10s\n", entry.getKey(), entry.getValue());
			}
			System.out.println("------------------------------------");
			
			
			for (; ;) {	//주문
				System.out.println("주문하시겠습니까? (1. 네 / 2. 취소하기)");
				int answer4 = sc.nextInt();
				
				if(answer4 == 1) {
					System.out.println("결제 금액은 " + price + "원입니다. 카드를 넣어주세요.");
					
					try {		// 카드 결제 시간
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("주문이 완료되었습니다.");
					
					
					// 영수증 출력
					System.out.println();
					System.out.println("____________________________________");
					System.out.printf("%20s\n", "[영수증]");
					System.out.println("버거킹 / " + "TEL : 02-123-4567");
					System.out.println("서울 동작구 동작대로 21");
					System.out.println(printNow);
					System.out.println("------------------------------------");
					System.out.printf("%5s%15s%11s\n", "메뉴", "단가", "수량");
					System.out.println("------------------------------------");
					for (Map.Entry<String, Integer> entry : map.entrySet()) {	//key와 value모두 출력
						System.out.printf("%s%10s\n", entry.getKey(), entry.getValue());
					}
					System.out.println("____________________________________");
					System.out.println("결제 금액 : " + price + "원");
					
					// 주문번호
					String orderNum = "";
					
					for (int i = 0; i < 5; i++) {
						orderNum += Random.getInstance().random(0, 9);
					}
					System.out.println("주문번호 [" + orderNum + "]");
					System.out.println("____________________________________\n");
					break;	//주문 for문 종료
				}else if(answer4 == 2) {
					break;	//키오스크 처음으로 돌아가기
				} else {
					System.out.println("똑바로 입력하세요.");
					continue;	// 주문 for문 반복
				}
			}
				
			continue; // 키오스크 처음으로 돌아가기
		}
		} 
	}

}