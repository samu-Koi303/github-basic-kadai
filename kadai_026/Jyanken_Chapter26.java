package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	public String getMyChoice() {

		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();



		if (!(input.equals("r")) && !(input.equals("s")) && !(input.equals("p"))) {

			System.out.println("正しい手を入力してください");
			input = scanner.next();

		} else {

			scanner.close();

		}

		return input;

	}

	public String getRandom() {

		String[] Enemy = { "r", "s", "p" };

		int i = (int) Math.floor(Math.random() * Enemy.length);
		String out = Enemy[i];
		return out;

	}

	public void playGame() {

		String MyChoice = getMyChoice();
		String EnemyChoice = getRandom();

		HashMap<String, String> janken = new HashMap<String, String>();

		janken.put("r", "グー");
		janken.put("s", "チョキ");
		janken.put("p", "パー");

		System.out.println("自分の手は" + janken.get((MyChoice)) + "対戦相手の手は" + janken.get(EnemyChoice));

		if (janken.get(MyChoice).equals(janken.get(EnemyChoice))) {

			System.out.println("あいこです");

		}

		if (janken.get(MyChoice).equals("グー") && janken.get(EnemyChoice).equals("チョキ") ||
				janken.get(MyChoice).equals("チョキ") && janken.get(EnemyChoice).equals("パー") ||
				janken.get(MyChoice).equals("パー") && janken.get(EnemyChoice).equals("グー"))

		{

			System.out.println("自分の勝ちです");

		}

		if (janken.get(MyChoice).equals("グー") && janken.get(EnemyChoice).equals("パー") ||
				janken.get(MyChoice).equals("チョキ") && janken.get(EnemyChoice).equals("グー") ||
				janken.get(MyChoice).equals("パー") && janken.get(EnemyChoice).equals("チョキ"))

		{

			System.out.println("自分の負けです");

		}
	}
}
