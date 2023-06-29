package characters.bossMonster;

import characters.Character;

public class BossMonster extends Character {

	public BossMonster() {

	}

	public BossMonster(String name, int hp, int mp, int level, int power, int def, int money, int exp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.power = power;
		this.def = def;
		this.money = money;
		this.exp = exp;
	}
	
	public void gameEnd() {
		System.out.println("╔───────────────────────────────╗");
		System.out.println("│마왕이 힘을 잃어 봉인되었습니다.\t│");
		System.out.println("│당신은 이 세계를 구한 영웅입니다!\t│");
		System.out.println("│당신을 원래 세계로 보내드리겠습니다!\t│");
		System.out.println("╚───────────────────────────────╝");
		System.exit(0);
	}

}
