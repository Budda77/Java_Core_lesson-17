package ua.lviv.lgs;

public class IteratorApplication {

	public static void main(String[] args) {

		Integer[] array = {1,48,-2,34,9,17,-82,19,6,55};
		
		Collection collection = new Collection(array);
		
		Iterator iteratorForward = collection.createForward();
		
		while(iteratorForward.hasNext()) {
			System.out.println(iteratorForward.next());
		}
		
		System.out.println();

		Iterator iteratorBackward = collection.createBackward();
		
		while(iteratorBackward.hasNext()) {
			System.out.println(iteratorBackward.next());
		}
		
//		System.out.println("mod:");
//		Iterator iteratorForward2 = collection.createForward();
//		while(iteratorForward2.hasNext()) {
//			int tmp = (int) iteratorForward2.next();
//			if(tmp % 2 == 0) {
//				
//				System.out.println("tmp - " + tmp);
//
//			}
//		}
		

	}

}
