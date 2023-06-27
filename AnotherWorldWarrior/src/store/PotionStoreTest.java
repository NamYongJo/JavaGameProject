package store;

import java.util.Scanner;

public class PotionStoreTest {

	public static void main(String[] args) {

		PotionStore potionStore = new PotionStore();
		Scanner scan = new Scanner(System.in);
		String choiceNum = "";

		potionStore.potionInit();
		while (true) {
			System.out.println("1.물약 구매 테스트\t2.구매한 물약 확인");
			choiceNum = scan.nextLine();
			
			if (choiceNum.equals("1")) {
				potionStore.buyHpPotion();
			} else if (choiceNum.equals("2")) {
				System.out.println(potionStore.potionMap.get("하급 체력 포션"));
			}

		}

	}

}
