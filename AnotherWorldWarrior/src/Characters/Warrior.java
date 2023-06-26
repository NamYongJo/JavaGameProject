package Characters;

import java.util.Scanner;

public class Warrior extends Character {

//	String items[] = null;

	public Warrior(String name, int level, int hp, int mp, int power, int def, int money, int exp) {
		this.name = name;
		this.level = level;
		this.hp = hp;
		this.mp = mp;
		this.power = power;
		this.def = def;
		this.money = money;
		this.exp = exp;
//		this.items = items;
	}

	public int attack() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.베기");
		System.out.println("2.검기");
		System.out.print("공격 선택: ");
		String num = sc.nextLine();

		int sum = 0;

		if (num.equals("1")) {
			sum += level * 5;
			sum += power * 10;
			System.out.println(name + "의 베기: " + sum + "의 대미지");

			return sum;
		} else if (num.equals("2")) {
			if (mp >= 0) {
				sum += level * 10;
				sum += power * 20;
				mp -= 5;
				System.out.println(name + "의 검기 스킬 발동  " + sum + "의 대미지");
				return sum;
			} else {
				System.out.println("마나가 부족합니다.");
			}
		} else {
			System.out.println("잘못된 입력입니다.");
		}

		return sum;
	}

}
