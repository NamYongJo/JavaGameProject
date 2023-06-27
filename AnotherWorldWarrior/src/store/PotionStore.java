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

	public int buyHpPotion() {
		Scanner scan = new Scanner(System.in);
		String ChoiceNum = "";
		int price = 0;

		System.out.println("1.하급 포션\t2.중급 포션\t3.상급 포션");
		ChoiceNum = scan.nextLine();
		if (ChoiceNum.equals("1")) {
			System.out.println("하급 체력 포션을 구매하였습니다.");
			potionMap.replace("하급 체력 포션", potionMap.get("하급 체력 포션") + 1);
			price = lowClassHpPotion;
		} else if (ChoiceNum.equals("2")) {
			System.out.println("중급 체력 포션을 구매하였습니다.");
			potionMap.replace("중급 체력 포션", potionMap.get("중급 체력 포션") + 1);
			price = middleClassHpPotion;
		} else if (ChoiceNum.equals("3")) {
			System.out.println("상급 체력 포션을 구매하였습니다.");
			potionMap.replace("상급 체력 포션", potionMap.get("상급 체력 포션") + 1);
			price = highClassHpPotion;
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		return price;
	}

	public int buyMpPotion() {
		Scanner scan = new Scanner(System.in);
		String ChoiceNum = "";
		int price = 0;

		System.out.println("1.하급 포션\t2.중급 포션\t3.상급 포션");
		ChoiceNum = scan.nextLine();
		if (ChoiceNum.equals("1")) {
			System.out.println("하급 마나 포션을 구매하였습니다.");
			potionMap.replace("하급 마나 포션", potionMap.get("하급 마나 포션") + 1);
			price = lowClassMpPotion;
		} else if (ChoiceNum.equals("2")) {
			System.out.println("중급 마나 포션을 구매하였습니다.");
			potionMap.replace("중급 마나 포션", potionMap.get("중급 마나 포션") + 1);
			price = middleClassMpPotion;
		} else if (ChoiceNum.equals("3")) {
			System.out.println("상급 마나 포션을 구매하였습니다.");
			potionMap.replace("상급 마나 포션", potionMap.get("상급 마나 포션") + 1);
			price = highClassMpPotion;
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		return price;
	}

	public HashMap<String, Integer> getPotionMap() {
		return potionMap;
	}

}
