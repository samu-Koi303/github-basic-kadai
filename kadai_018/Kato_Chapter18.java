package kadai_018;

public abstract class Kato_Chapter18 {
	String familyName = "加藤";
	String givenName;
	String address = "東京都中野区〇×";

	public void commonintroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");

	}

	abstract void eachintroduce();

	{

	}

	public void exceintroduce() {
		commonintroduce();
		eachintroduce();

	}

}
