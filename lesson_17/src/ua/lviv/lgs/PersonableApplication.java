package ua.lviv.lgs;

public class PersonableApplication {

	public static void main(String[] args) {
		
		PersonFactory pf = new PersonFactory();
		Personable sportsman = pf.createSportsMan();
		sportsman.eat();
		sportsman.move();
		sportsman.sleep();
		
		System.out.println();
		
		Personable housewife = pf.createHouseWifeLocal();
		housewife.eat();
		housewife.move();
		housewife.sleep();
		
		System.out.println();
		
		Personable anonymous = pf.createAnonymous();
		anonymous.eat();
		anonymous.move();
		anonymous.sleep();
		
		System.out.println();
		
		Personable golfplayer = PersonFactory.createGoldPlayer();
		golfplayer.eat();
		golfplayer.move();
		golfplayer.sleep();
		
		
		
		
		
	}

}
