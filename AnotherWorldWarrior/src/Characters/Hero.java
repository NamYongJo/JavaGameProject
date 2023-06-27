package Characters;

import java.util.HashMap;
import java.util.Scanner;

public class Hero extends Character {

	int[] maxHpMpArr = new int[2];

	HashMap<String, Integer> potionMap = new HashMap<String, Integer>();

	public Hero(String name, int level, int hp, int mp, int power, int def, int money, int exp) {
		this.name = name;
		this.level = level;
		this.hp = hp;
		this.mp = mp;
		this.power = power;
		this.def = def;
		this.money = money;
		this.exp = exp;
	}

	public void setMaxHpMp() {
		maxHpMpArr[0] = hp;
		maxHpMpArr[1] = mp;
	}

	public int getHp() {
		return maxHpMpArr[0];
	}

	public int getMp() {
		return maxHpMpArr[1];
	}

	public void potionInit() {
		potionMap.put("하급 체력 포션", 0);
		potionMap.put("중급 체력 포션", 0);
		potionMap.put("상급 체력 포션", 0);
		potionMap.put("하급 마나 포션", 0);
		potionMap.put("중급 마나 포션", 0);
		potionMap.put("상급 마나 포션", 0);
	}

	public void setPotionMap(HashMap<String, Integer> potionMap) {
		this.potionMap = potionMap;
	}
	
	public void potionInfo() {
		System.out.println("잔여 포션");
		System.out.println("하급 체력 포션: " + potionMap.get("하급 체력 포션"));
		System.out.println("중급 체력 포션: " + potionMap.get("중급 체력 포션"));
		System.out.println("상급 체력 포션: " + potionMap.get("상급 체력 포션"));
		System.out.println("하급 마나 포션: " + potionMap.get("하급 마나 포션"));
		System.out.println("중급 마나 포션: " + potionMap.get("중급 마나 포션"));
		System.out.println("상급 마나 포션: " + potionMap.get("상급 마나 포션"));
	}

	public int attack() {
		Scanner scan = new Scanner(System.in);
		int sum = 0;

		System.out.println("1.베기");
		System.out.println("2.검기");
		System.out.print("공격 선택: ");
		String num = scan.nextLine();

		if (num.equals("1")) {
			sum += level * 5;
			sum += power * 10;
			System.out.println(name + "의 베기: " + sum + "의 대미지");
		} else if (num.equals("2")) {
			if (mp >= 5) { // 해당 스킬 마나 소모량으로 수정
				sum += level * 10;
				sum += power * 20;
				mp -= 5;
				System.out.println(name + "의 검기 스킬 발동  " + sum + "의 대미지");
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

	public void LevelUp() {
		level += 1;
		maxHpMpArr[0] += 200;
		maxHpMpArr[1] += 5;
		power += 5;
		def += 5;
		money += level * 50;
		exp = 0;

		System.out.println("┌───────────────┐");
		System.out.println("│" + "레벨: " + level + " 1↑" + " \t│");
		System.out.println("│" + "체력: " + maxHpMpArr[0] + " 200↑" + " \t│");
		System.out.println("│" + "마나: " + maxHpMpArr[1] + " 5↑" + " \t│");
		System.out.println("│" + "공격력: " + power + " 5↑" + " \t│");
		System.out.println("│" + "방어력: " + def + " 5↑" + " \t│");
		System.out.println("└───────────────┘");
		System.out.println("레벨업 보상으로 " + level * 50 + "원을 획득했습니다.");
		System.out.println("체력과 마나가 모두 회복되었습니다.");
		hp = getHp();
		mp = getMp();

	};

}
