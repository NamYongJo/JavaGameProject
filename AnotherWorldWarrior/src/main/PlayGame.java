package main;

import java.util.Scanner;

import Characters.Goblin;
import Characters.Imp;
import Characters.Monster;
import Characters.Orc;
import Characters.Skeleton;
import Characters.Slime;
import Characters.Warrior;

public class PlayGame {

	public static void main(String[] args) {

		// 선택 변수
		String choiceNum = "";

		// 캐릭터 스탯
		String name = ""; // 이름
		int hp = 0; // 체력
		int mp = 0; // 마나
		int level = 0; // 레벨
		int power = 0; // 공격력
		int def = 0; // 방어력
		int money = 0; // 돈
		int exp = 0; // 경험치

		// 캐릭터 생성
		Scanner scan = new Scanner(System.in);
		System.out.print("당신의 이름 : ");
		name = scan.nextLine();
		level = 1;
		hp = 100;
		mp = 25;
		power = 10;
		def = 10;
		money = 0;
		exp = 0;

		Warrior warrior = new Warrior(name, level, hp, mp, power, def, money, exp);

		System.out.println("당신은 이세계에 초대되셨습니다.");
		System.out.println("몬스터를 사냥하여 레벨을 올리고");
		System.out.println("드래곤을 퇴치하여 세계를 구해주세요!");

		while (true) {

			System.out.println("1.상태창\t 2.장비\t 3.상점\t 4.전투");
			choiceNum = scan.nextLine();
			if (choiceNum.equals("1")) {
				warrior.showInfo();
			} else if (choiceNum.equals("2")) {

			} else if (choiceNum.equals("3")) {

			} else if (choiceNum.equals("4")) {
				Monster monster = new Monster();
				System.out.println("전투할 상대를 골라주세요.");
				System.out.println("1.슬라임");
				System.out.println("2.고블린");
				System.out.println("3.오크");
				System.out.println("4.스켈레톤");
				System.out.println("5.임프");
				System.out.println("6.드래곤(보스)");
				System.out.println("0.뒤로가기");
				choiceNum = scan.nextLine();
				if (choiceNum.equals("1")) {
					monster = new Slime("슬라임", 300, 0, 1, 20, 5, 10, 10);
					System.out.println("＝┃ニニフ 전투 상대");
					monster.showInfo();
				} else if (choiceNum.equals("2")) {
					monster = new Goblin("고블린", 500, 0, 5, 50, 10, 50, 50);
					System.out.println("＝┃ニニフ 전투 상대");
					monster.showInfo();
				} else if (choiceNum.equals("3")) {
					monster = new Orc("오크", 800, 0, 10, 80, 20, 100, 100);
					System.out.println("＝┃ニニフ 전투 상대");
					monster.showInfo();
				} else if (choiceNum.equals("4")) {
					monster = new Skeleton("스켈레톤", 1000, 0, 15, 100, 50, 250, 250);
					System.out.println("＝┃ニニフ 전투 상대");
					monster.showInfo();
				} else if (choiceNum.equals("5")) {
					monster = new Imp("임프", 1500, 0, 20, 120, 70, 500, 500);
					System.out.println("＝┃ニニフ 전투 상대");
					monster.showInfo();
				} else if (choiceNum.equals("6")) {
					break;
				} else if (choiceNum.equals("0")) {
					System.out.println("이전 선택지로 돌아갑니다.");
					break;
				} else {
					System.out.println("잘못된 선택입니다.");
				}
				while (true) {
					System.out.println(warrior.name + "의 차례");
					monster.attacked(warrior.attack());
					System.out.println(monster.name + "의 남은 체력: " + monster.hp);

					if (monster.hp <= 0) {
						System.out.println(monster.name + " 토벌 성공!");
						warrior.exp += monster.exp;
						warrior.money += monster.money;
						break;
					}

					System.out.println(monster.name + "의 공격!");
					warrior.attacked(monster.attack());
					System.out.println(warrior.name + "의 남은 체력: " + warrior.hp);

					if (warrior.hp <= 0) {
						System.out.println(warrior.name + " 사망");
						warrior.hp = 1;
						System.out.println(warrior.hp + "의 체력으로 부활합니다.");
						break;
					}
				}
			} else {
				System.out.println("잘못된 선택입니다.");
			}
			if (warrior.exp >= warrior.level * 80) {
				warrior.level += 1;
				System.out.println(warrior.name + "의 레벨이 " + warrior.level + "이 되었습니다.");
				warrior.money += warrior.level * 50;
				System.out.println("레벨업 보상으로 " + warrior.level * 50 + "원을 받았습니다.");
				warrior.exp = 0;
			}
		}

	}

}
