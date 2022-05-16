package ua.lviv.lgs;

public class PersonFactory {
	
	
	//Inner class
	private class SportsMan implements Personable{

		@Override
		public void eat() {
			System.out.println("Sportsman is eating");
		}

		@Override
		public void move() {
			System.out.println("Sportsman is moving");
		}

		@Override
		public void sleep() {
			System.out.println("Sportsman is sleeping");
		}
		
	}
	
		public SportsMan createSportsMan() {
			return new SportsMan();
		}
		
		
		// Local class
		public Personable createHouseWifeLocal() {
			class HouseWife implements Personable{

				@Override
				public void eat() {
					System.out.println("HouseWife is eating");		
				}

				@Override
				public void move() {
					System.out.println("HouseWife is moving");
				}

				@Override
				public void sleep() {
					System.out.println("HouseWife is sleeping");
				}
				
			}
			return new HouseWife();
		}
		
		//Anonymous class
		public Personable createAnonymous() {
		
			return new Personable() {

				@Override
				public void eat() {
					System.out.println("Anonymous is eating");		
				}

				@Override
				public void move() {
					System.out.println("Anonymous is moving");
				}

				@Override
				public void sleep() {
					System.out.println("Anonymous is sleeping");
				}
			};
		}
		
	private static class GoldPlayer implements Personable{

		@Override
		public void eat() {
			System.out.println("Gold Player is eating");		
		}

		@Override
		public void move() {
			System.out.println("Gold Player is moving");
		}
	
		@Override
		public void sleep() {
			System.out.println("Gold Player is sleeping");
		}
	}
	
	public static GoldPlayer createGoldPlayer() {
		return new GoldPlayer();
	}
	
	
	
	
	
	
}
