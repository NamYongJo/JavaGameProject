package Characters;

public class Character {

	public String name = ""; //이름
	public int level = 0; //레벨
	public int hp = 0; //체력
	public int mp = 0; //마나
	public int power = 0; //공격력
	public int def = 0; //방어력
	public int money = 0; //돈
	public int exp = 0; //경험치
	
	public void showInfo() {
		System.out.println("┌───────────────┐");
		System.out.println("│" + "이름: " + name + "  \t│");
		System.out.println("│" + "레벨: " + level + "  \t│");
		System.out.println("│" + "체력: " + hp + "  \t│");
		System.out.println("│" + "마나: " + mp + "  \t│");
		System.out.println("│" + "공격력: " + power + "  \t│");
		System.out.println("│" + "방어력: " + def + "  \t│");
		System.out.println("│" + "보유 금액: " + money + "  \t│");
		System.out.println("│" + "경험치: " + exp + "  \t│");
		System.out.println("└───────────────┘");
	};
	
	public int attack() {
		System.out.println(name + "의 공격: " + power + "의 대미지");
		
		return power;
	}
	
	public void attacked(int sum) {
		if(def >= sum) {
			System.out.println("아무런 피해가 없었다.");
			hp = hp - 0;
		}else {
			System.out.println(def + "만큼의 피해 감소");
			hp = hp + def - sum;
		}
	};
	
}
