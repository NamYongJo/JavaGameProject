package main;

import java.util.Scanner;

import characters.boss.BossMonster;
import characters.boss.Lucifer;
import characters.hero.Hero;
import characters.monster.Goblin;
import characters.monster.Imp;
import characters.monster.Monster;
import characters.monster.Orc;
import characters.monster.Skeleton;
import characters.monster.Slime;
import store.PotionStore;

public class PlayGame {

	public void GameStart() {

		// 선택 변수
		String choiceNum = "";
		String tempNum = "";

		// 내 캐릭터 스탯 변수 선언
		String name = ""; // 이름
		int hp = 0; // 체력
		int mp = 0; // 마나
		int level = 0; // 레벨
		int power = 0; // 공격력
		int def = 0; // 방어력
		int money = 0; // 돈
		int exp = 0; // 경험치

		// 내 캐릭터 초기 스탯
		Scanner scan = new Scanner(System.in);
		System.out.print("당신의 이름 : ");
		name = scan.nextLine();
		level = 1;
		hp = 300;
		mp = 20;
		power = 10;
		def = 10;
		money = 100;
		exp = 0;

		// 내 캐릭터 생성
		Hero hero = new Hero(name, level, hp, mp, power, def, money, exp);
		hero.setMaxHpMp(); // 최대 체력 마나 초기화
		hero.potionInit(); // 포션 인벤토리 초기화

		// 상점 생성
		PotionStore potionStore = new PotionStore();
		potionStore.potionInit(); // 포션 맵 초기화

		System.out.println("╔───────────────────────────────╗");
		System.out.println("│당신은 이세계에 초대되었습니다. \t│");
		System.out.println("│몬스터를 사냥하고 성장하여 \t\t│");
		System.out.println("│마왕 루시퍼에게서 세계를 구해주세요! \t│");
		System.out.println("╚───────────────────────────────╝");
		while (true) {
			System.out.println("1.상태창\t 2.상점\t 3.전투\t 4.치유");
			System.out.print("선택: ");
			choiceNum = scan.nextLine();
			if (choiceNum.equals("1")) {
				hero.showInfo();
				hero.potionInfo();
			} else if (choiceNum.equals("2")) {
				System.out.println("포션 상점에 입장하였습니다.");
				System.out.println("╔───────────────────────────────────────╗");
				System.out.println("│점장: 어서오게 오늘은 어떤 물건을 사러 왔는가?\t│");
				System.out.println("╚───────────────────────────────────────╝");
				System.out.println("1.체력 포션\t2.마나 포션\t3.돌아가기");
				System.out.print("선택: ");
				choiceNum = scan.nextLine();
				if (choiceNum.equals("1")) {
					hero.money = potionStore.buyHpPotion(hero.money);
					hero.setPotionMap(potionStore.getPotionMap());
				} else if (choiceNum.equals("2")) {
					hero.money = potionStore.buyMpPotion(hero.money);
					hero.setPotionMap(potionStore.getPotionMap());
				} else if (choiceNum.equals("3")) {
					System.out.println("상점을 나왔습니다.");
					continue;
				} else {
					System.out.println("대화가 통하지 않아 점장에게 쫓겨났습니다.");
					System.out.println("╔───────────────────────────────╗");
					System.out.println("│점장: 국어 공부나 더 하고 오라고 친구~\t│");
					System.out.println("╚───────────────────────────────╝");
				}
			} else if (choiceNum.equals("3")) {
				Monster monster = new Monster();
				BossMonster bossMonster = new BossMonster();

				System.out.println("╔───────────────────────╗");
				System.out.println("│전투할 상대를 골라주세요. \t│");
				System.out.println("│1.슬라임 \t\t│");
				System.out.println("│2.고블린 \t\t│");
				System.out.println("│3.오크 \t\t\t│");
				System.out.println("│4.스켈레톤 \t\t│");
				System.out.println("│5.임프 \t\t\t│");
				System.out.println("│6.마왕 루시퍼(보스) \t│");
				System.out.println("│0.뒤로가기 \t\t│");
				System.out.println("╚───────────────────────╝");

				System.out.print("선택: ");
				choiceNum = scan.nextLine();
				tempNum = choiceNum;
				if (choiceNum.equals("1")) {
					monster = new Slime("슬라임", 400, 0, 1, 20, 5, 20, 30);
					System.out.println("⚔️ 전투 상대 ⚔️");
					monster.showInfo();
				} else if (choiceNum.equals("2")) {
					monster = new Goblin("고블린", 800, 0, 5, 30, 10, 40, 50);
					System.out.println("⚔️ 전투 상대 ⚔️");
					monster.showInfo();
				} else if (choiceNum.equals("3")) {
					monster = new Orc("오크", 1200, 0, 10, 30, 20, 60, 100);
					System.out.println("⚔️ 전투 상대 ⚔️");
					monster.showInfo();
				} else if (choiceNum.equals("4")) {
					monster = new Skeleton("스켈레톤", 1500, 0, 15, 30, 30, 80, 150);
					System.out.println("⚔️ 전투 상대 ⚔️");
					monster.showInfo();
				} else if (choiceNum.equals("5")) {
					monster = new Imp("임프", 1800, 0, 20, 40, 20, 100, 200);
					System.out.println("⚔️ 전투 상대 ⚔️");
					monster.showInfo();
				} else if (choiceNum.equals("6")) {
					bossMonster = new Lucifer("루시퍼", 3000, 50, 30, 40, 30, 5000, 5000);
//					bossMonster = new Lucifer("루시퍼", 50, 50, 30, 50, 30, 5000, 5000);
					System.out.println("⚔️ 전투 상대 ⚔️");
					bossMonster.showInfo();
				} else if (choiceNum.equals("0")) {
					System.out.println("이전 선택지로 돌아갑니다.");
					continue;
				} else {
					System.out.println("잘못된 선택입니다.");
				}
				while (true) {
					if (tempNum.equals("6")) {
						System.out.println("╔───────────────╗");
						System.out.println("│" + hero.name + "의 차례\t│");
						System.out.println("│1.공격\t\t│");
						System.out.println("│2.포션\t\t│");
						System.out.println("╚───────────────╝");
						System.out.print("선택: ");
						choiceNum = scan.nextLine();

						if (choiceNum.equals("1")) {
							bossMonster.attacked(hero.attack());

							if (bossMonster.hp <= 0) {
								bossMonster.hp = 0;
							}
							System.out.println(bossMonster.name + "의 남은 체력: " + bossMonster.hp);
							System.out.println(bossMonster.name + "의 남은 마나: " + bossMonster.mp);
							System.out.println("==============================>");

							if (bossMonster.hp == 0) {
								System.out.println(bossMonster.name + " 토벌 성공!");
								hero.exp += bossMonster.exp;
								hero.money += bossMonster.money;
								bossMonster.gameEnd();
								break;
							}

							System.out.println(bossMonster.name + "의 공격!");
							hero.attacked(bossMonster.attack());

							if (hero.hp <= 0) {
								hero.hp = 0;
							}
							System.out.println(hero.name + "의 남은 체력: " + hero.hp);
							System.out.println(hero.name + "의 남은 마나: " + hero.mp);
							System.out.println("==============================>");

							if (hero.hp == 0) {
								System.out.println(hero.name + " 사망");
								hero.hp = 1;
								System.out.println(hero.hp + "의 체력으로 부활합니다.");
								break;
							}
						} else if (choiceNum.equals("2")) {
							hero.takePotion();
							potionStore.setPotionMap(hero.getPotionMap());
						} else {
							System.out.println("잘못된 입력입니다.");
						}
					} else if (tempNum.equals("1") || tempNum.equals("2") || tempNum.equals("3") 
							|| tempNum.equals("4") || tempNum.equals("5")) {
						System.out.println("╔───────────────╗");
						System.out.println("│" + hero.name + "의 차례\t│");
						System.out.println("│1.공격\t\t│");
						System.out.println("│2.포션\t\t│");
						System.out.println("╚───────────────╝");
						System.out.print("선택: ");
						choiceNum = scan.nextLine();

						if (choiceNum.equals("1")) {
							monster.attacked(hero.attack());

							if (monster.hp <= 0) {
								monster.hp = 0;
							}
							System.out.println(monster.name + "의 남은 체력: " + monster.hp);
							System.out.println("==============================>");

							if (monster.hp == 0) {
								System.out.println(monster.name + " 토벌 성공!");
								hero.exp += monster.exp;
								hero.money += monster.money;
								break;
							}

							System.out.println(monster.name + "의 공격!");
							hero.attacked(monster.attack());

							if (hero.hp <= 0) {
								hero.hp = 0;
							}
							System.out.println(hero.name + "의 남은 체력: " + hero.hp);
							System.out.println(hero.name + "의 남은 마나: " + hero.mp);
							System.out.println("==============================>");

							if (hero.hp == 0) {
								System.out.println(hero.name + " 사망");
								hero.hp = 1;
								System.out.println(hero.hp + "의 체력으로 부활합니다.");
								break;
							}
						} else if (choiceNum.equals("2")) {
							hero.takePotion();
							potionStore.setPotionMap(hero.getPotionMap());
						} else {
							System.out.println("잘못된 입력입니다.");
						}

					} else {
						break;
					}

				}
			} else if (choiceNum.equals("4")) {
				System.out.println(" ╔───────────────────────────────────────╗");
				System.out.println("ε│ 여신의 가호로 체력과 마나가 모두 회복 되었습니다.\t │з");
				System.out.println(" ╚───────────────────────────────────────╝");
				hero.hp = hero.getHp();
				hero.mp = hero.getMp();
			} else {
				System.out.println("잘못된 입력입니다.");
			}

			if (hero.exp >= hero.level * 80) {
				hero.LevelUp();
			}

		}

	}

}
