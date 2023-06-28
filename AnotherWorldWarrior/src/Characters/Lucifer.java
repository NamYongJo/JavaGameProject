package Characters;

import java.util.Random;
import java.util.Scanner;

public class Lucifer extends BossMonster {

	public Lucifer(String name, int hp, int mp, int level, int power, int def, int money, int exp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.power = power;
		this.def = def;
		this.money = money;
		this.exp = exp;
	}

	public int attack() {
		Random random = new Random();

		int num = 0;
		int sum = 0;

		num = random.nextInt(2) + 1;

		if (num == 1) {
			sum += level * 5;
			sum += power * 10;
			System.out.println(name + "의 베기: " + sum + "의 대미지");

			return sum;
		} else if (num == 2) {
			if (mp >= 5) { // 해당 스킬 마나 소모량으로 수정
				sum += level * 10;
				sum += power * 20;
				mp -= 5;
				System.out.println(name + "의 어둠의 검기 스킬 발동  " + sum + "의 대미지");
				return sum;
			} else {
				System.out.println("마나가 부족하므로 베기 공격");
				sum += level * 5;
				sum += power * 10;
				System.out.println(name + "의 베기: " + sum + "의 대미지");
			}
		} else {
			System.out.println("잘못된 입력입니다.");
		}

		return sum;
	}

}
