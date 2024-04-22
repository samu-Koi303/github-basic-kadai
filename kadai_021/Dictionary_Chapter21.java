package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	public void searchWord(String[] Word) {

		HashMap<String, String> Dictionary = new HashMap<String, String>();

		Dictionary.put("apple", "りんご");
		Dictionary.put("peach", "桃");
		Dictionary.put("banana", "バナナ");
		Dictionary.put("lemon", "レモン");
		Dictionary.put("pear", "梨");
		Dictionary.put("kiwi", "キウィ");
		Dictionary.put("strawberry", "いちご");
		Dictionary.put("grape", "ぶどう");
		Dictionary.put("muscat", "マスカット");
		Dictionary.put("cherry", "さくらんぼ");

		for (int i = 0; i < Word.length; i++) {

			String Turget = Word[i];

			if (Dictionary.containsKey(Turget)) {
				System.out.println(Turget + "の意味は" + Dictionary.get(Turget));
			} else {
				System.out.println(Turget + "は辞書に存在しません");
			}

		}

	}

}
