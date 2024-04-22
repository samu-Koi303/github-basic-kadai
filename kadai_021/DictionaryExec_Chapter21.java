package kadai_021;

public class DictionaryExec_Chapter21 extends Dictionary_Chapter21 {

	public static void main(String[] args) {

		Dictionary_Chapter21 Dic = new Dictionary_Chapter21();

		String[] Word = new String[4];

		Word[0] = "apple";
		Word[1] = "banana";
		Word[2] = "grape";
		Word[3] = "orange";

		Dic.searchWord(Word);

	}

}
