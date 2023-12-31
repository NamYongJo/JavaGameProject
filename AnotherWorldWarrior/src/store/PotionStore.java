package store;

import java.util.HashMap;
import java.util.Scanner;

public class PotionStore {

	HashMap<String, Integer> potionMap = new HashMap<String, Integer>();

	// HP포션 변수 선언, 가격 지정
	int lowClassHpPotion = 30;
	int middleClassHpPotion = 50;
	int highClassHpPotion = 100;

	// MP포션 변수 선언, 가격 지정
	int lowClassMpPotion = 30;
	int middleClassMpPotion = 50;
	int highClassMpPotion = 100;

	public void potionInit() {
		potionMap.put("하급 체력 포션", 0);
		potionMap.put("중급 체력 포션", 0);
		potionMap.put("상급 체력 포션", 0);
		potionMap.put("하급 마나 포션", 0);
		potionMap.put("중급 마나 포션", 0);
		potionMap.put("상급 마나 포션", 0);
	}

	public int buyHpPotion(int money) {
		Scanner scan = new Scanner(System.in);
		String ChoiceNum = "";
		int price = 0;

		System.out.println("╔───────────────────────────────╗");
		System.out.println("│1.하급 포션(체력 100회복): 30골드\t│");
		System.out.println("│2.중급 포션(체력 300회복): 50골드\t│");
		System.out.println("│3.상급 포션(체력 500회복): 100골드\t│");
		System.out.println("│4.나가기\t\t\t\t│");
		System.out.println("╚───────────────────────────────╝");
		System.out.print("선택: ");
		ChoiceNum = scan.nextLine();
		if (ChoiceNum.equals("1")) {
			price = lowClassHpPotion;
			if (price <= money) {
				System.out.println("하급 체력 포션을 구매하였습니다.");
				money -= price;
				potionMap.replace("하급 체력 포션", potionMap.get("하급 체력 포션") + 1);
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		} else if (ChoiceNum.equals("2")) {
			price = middleClassHpPotion;
			if (price <= money) {
				System.out.println("중급 체력 포션을 구매하였습니다.");
				money -= price;
				potionMap.replace("중급 체력 포션", potionMap.get("중급 체력 포션") + 1);
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		} else if (ChoiceNum.equals("3")) {
			price = highClassHpPotion;
			if (price <= money) {
				System.out.println("상급 체력 포션을 구매하였습니다.");
				money -= price;
				potionMap.replace("상급 체력 포션", potionMap.get("상급 체력 포션") + 1);
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		} else if (ChoiceNum.equals("4")) {
			System.out.println("상점을 나왔습니다.");
		} else {
			System.out.println("대화가 통하지 않아 점장에게 쫓겨났습니다.");
			System.out.println("╔───────────────────────────────╗");
			System.out.println("│점장: 국어 공부나 더 하고 오라고 친구~\t│");
			System.out.println("╚───────────────────────────────╝");
		}

		return money;
	}

	public int buyMpPotion(int money) {
		Scanner scan = new Scanner(System.in);
		String ChoiceNum = "";
		int price = 0;

		System.out.println("╔───────────────────────────────╗");
		System.out.println("│1.하급 포션(체력 100회복): 30골드\t│");
		System.out.println("│2.중급 포션(체력 300회복): 50골드\t│");
		System.out.println("│3.상급 포션(체력 500회복): 100골드\t│");
		System.out.println("│4.나가기\t\t\t\t│");
		System.out.println("╚───────────────────────────────╝");
		System.out.print("선택: ");
		ChoiceNum = scan.nextLine();
		if (ChoiceNum.equals("1")) {
			price = lowClassMpPotion;
			if (price <= money) {
				System.out.println("하급 마나 포션을 구매하였습니다.");
				money -= price;
				potionMap.replace("하급 마나 포션", potionMap.get("하급 마나 포션") + 1);
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		} else if (ChoiceNum.equals("2")) {
			price = middleClassMpPotion;
			if (price <= money) {
				System.out.println("중급 마나 포션을 구매하였습니다.");
				money -= price;
				potionMap.replace("중급 마나 포션", potionMap.get("중급 마나 포션") + 1);
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		} else if (ChoiceNum.equals("3")) {
			price = highClassMpPotion;
			if (price <= money) {
				System.out.println("상급 마나 포션을 구매하였습니다.");
				money -= price;
				potionMap.replace("상급 마나 포션", potionMap.get("상급 마나 포션") + 1);
			} else {
				System.out.println("잔액이 부족합니다.");
			}
		} else if (ChoiceNum.equals("4")) {
			System.out.println("상점을 나왔습니다.");
		} else {
			System.out.println("대화가 통하지 않아 점장에게 쫓겨났습니다.");
			System.out.println("╔───────────────────────────────╗");
			System.out.println("│점장: 국어 공부나 더 하고 오라고 친구~\t│");
			System.out.println("╚───────────────────────────────╝");
		}

		return money;
	}

	public HashMap<String, Integer> getPotionMap() {
		return potionMap;
	}

	public void setPotionMap(HashMap<String, Integer> potionMap) {
		this.potionMap = potionMap;
	}

}
