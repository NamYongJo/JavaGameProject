package Characters;

import java.util.Random;
import java.util.Scanner;

public class Dragon extends Monster{
	
	public Dragon(String name, int hp, int mp, int level, 
			int power, int def, int money, int exp) {
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

		num = random.nextInt(2)+1;
		
		if (num == 1) {
			sum += level * 10;
			sum += power * 30;
			System.out.println(name + "의 할퀴기: " + power + "의 대미지");

			return sum;
		} else if (num == 2) {
			sum += level * 20;
			sum += power * 15;
			mp -= 20;
			
			System.out.println(name + "의 파이어 브레스: " + power + "의 대미지");
			
			return sum;
		}
		System.out.println(name + "의 공격: " + power + "의 대미지");
		
		return sum;
	}
	
}
