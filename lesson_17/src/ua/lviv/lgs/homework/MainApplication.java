package ua.lviv.lgs.homework;


public class MainApplication {
	public static void main(String[] args) {
		
		//Task 1
		System.out.println("1.	Using an inner modify odd values by zero.");
		// Fill the array with random value
		Integer[] array = createArray();		
		System.out.println("\nThe original array:");
		showArray(array);
		
		System.out.println();
		System.out.println("\nModified odd values by zero from start:");

		Collection collection = new Collection(array);
		Iterator iterator = collection.oddIterator();
		
		while(iterator.hasNext()) {
			iterator.next();
		}
		
		//Task 2
		System.out.println();
		System.out.println("\n2.	Using an inner skip the odd value:");
		
		// Fill the array with random value
		Integer[] array2 = createArray();
		System.out.println("\nThe original array:");
		showArray(array2);
		
		System.out.println("\nThe odd index skiped from end:");
		Collection collection2 = new Collection(array2);
		Iterator iterator2 = collection2.skipIterator();
		
		while(iterator2.hasNext()) {
			iterator2.next();
		}
			
		//Task 3
		System.out.println();
		System.out.println("\n3.	Using an anonymous class check every third element for an odd value:");
		
		// Fill the array with random value
		Integer[] array3 = createArray();
		// Method to show the array 
		System.out.println("\nThe original array:");
		showArray(array3);
		
		System.out.println();
		System.out.println("\nChecking for a pairing of every third element from end:");
		Collection collection3 = new Collection(array3);
		Iterator iterator3 = collection3.getAnonymous();
		
		while(iterator3.hasNext()) {
			iterator3.next();
		}

		//Task 4
		System.out.println();
		System.out.println("\n4.	Using a local class check every fifth element and minus 100 if the value is paired");
		
		// Fill the array with random value
		Integer[] array4 = createArray();
		// Method to show the array 
		System.out.println("\nThe original array:");
		showArray(array4);
		
		System.out.println();
		System.out.println("\nChecking for a pairing of every fifth element from start:");
		Collection collection4 = new Collection(array4);
		Iterator iterator4 = collection4.createLocalClass();
		
		while(iterator4.hasNext()) {
			iterator4.next();
		}
	
		//Task 5
		System.out.println();
		System.out.println("\n5.	Using a static class check every second element. If the value is paired convert it to unpaired.");
		
		// Fill the array with random value
		Integer[] array5 = createArray();
		// Method to show the array 
		System.out.println("\nThe original array:");
		showArray(array5);
		
		System.out.println();
		System.out.println("\nChecking for a pairing of every second element from start:");
		Iterator iterator5 = Collection.createIteratorFive(array5);   
		
		while(iterator5.hasNext()) {
			iterator5.next();
		}
	

		
		
		
	}






	private static void showArray(Integer[] array) {
		for (Integer integer : array) {
			System.out.print(integer + " ");
		}
	}

	private static Integer[] createArray() {
		Integer[] array = new Integer [20];  
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() *100 +1);
		}
		return array;
	}

}
