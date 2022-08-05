package forthWeek;

public class Main {

	public static void main(String[] args) {

		// 准备两个人
		Player p1 = new Player("satou", new RandomStrategy());
		Player p2 = new Player("tanaka", new SequentialStrategy());

		// 石头剪刀布
		for (int i = 0; i < 10; i++) {

			// 出拳
			Hand hand1 = p1.strategy.nextHand();
			Hand hand2 = p2.strategy.nextHand();

			// 比一比
			int result = hand1.fight(hand2);// 0,-1,1

			StringBuffer sb = new StringBuffer();
			sb.append(p1.name);
			sb.append("出的得是: " + hand1.name());
			sb.append(", ");
			sb.append(p2.name);
			sb.append("出的得是: " + hand2.name());
			// 输出结果并计算
			if (result == 1) {
				p1.score++;
				sb.append(" "+ p1.name + "赢了");
			} else if (result == -1) {
				p2.score++;
				sb.append(" "+ p2.name + "赢了");
			} else {
				sb.append(" "+ "打平");
			}

			System.out.println(sb);

		}

		// 输出结果
		if (p1.score > p2.score) {
			System.out.println(p1.name + "赢了");
		} else if (p1.score < p2.score) {
			System.out.println(p2.name + "赢了");
		} else {
			System.out.println("打平");
		}
	}
}
