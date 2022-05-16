package ua.lviv.lgs.homework;

public interface Iterator {
	boolean hasNext();
	Object next();
	void getValue();
}	
	class Collection {
		
		private Object[] array;
		
		public Collection(Object[] array) {
			super();
			this.array = array;
		}
		
		//Inner class
		public class OddClass implements Iterator{		
			private int count = 0;
			
			@Override
			public boolean hasNext() {
				return count < array.length;
			}

			@Override
			public Object next() {
				getValue();
				return array[count++];
			}

			@Override
			public void getValue() {
				int tmp = (int) array[count];
				if(tmp % 2 == 0) {
					array[count] = 0;
				}
				System.out.print(array[count]+ " " );
			}
		}
		
		//Create object of inner class
		public OddClass oddIterator() {
			return new OddClass();
		}
		
		public class SkipClass implements Iterator{
			private int count = array.length;

			@Override
			public boolean hasNext() {
				return count >0;
			}

			@Override
			public Object next() {
				getValue();
				return array[--count];
			}
			
			@Override
			public void getValue() {
				if(count % 2 == 0) {
					System.out.print(array[--count]+ " - " +  " ");
				}
			}
		}
			
		public SkipClass skipIterator() {
			return new SkipClass();
		}

		//Anonymous class
		public Iterator getAnonymous() {
			return new Iterator() {
				private int count = array.length-1;
				int tmp = 1;

				@Override
				public boolean hasNext() {
					return count >=0;
				}

				@Override
				public Object next() {
					getValue();
					return array[count--];
				}

				public void getValue() {
					int value = (int) array[count];
					
					if(tmp == 3) {
						if(dividesByTwo(value) == true) {
							System.out.println("value = " + array[count]+ " is paired "); 
						}else {
							System.out.println("value = " + array[count]+ " is NOT paired");
						}
						tmp =0;
					}
					tmp++;
				}

				public boolean dividesByTwo(int a){
					return (a%2==0);
				}	
			};
		}
		
		

		// Local class
		public Iterator createLocalClass() {
			class IteratorFour implements Iterator{
				
				private int count = 0;
				private int tmp =1;
				
				@Override
				public boolean hasNext() {
					return count < array.length;
				}

				@Override
				public Object next() {
					getValue();
					return array[count++];
				}
				
				@Override
				public void getValue() {
					int value = (int) array[count];
					if(tmp == 5) {
						if(dividesByTwo(value) == true) {
							System.out.println("value is paired= " + array[count]+ " result " + (value -100)); 
						}else {
							System.out.println("value = " + array[count]+ " is NOT paired");
						}								
						tmp =0;
					}
					tmp ++;				
				}
				
				public boolean dividesByTwo(int a){
					return (a%2==0);
				}		
			}			
			return new IteratorFour();		
		}
		
		private static class IteratorFive implements Iterator{
			
			private static Object[] arr;
			private int count = 0;
			private int tmp =1;

			public IteratorFive(Object[] arr) {
				super();
				this.arr = arr;
			}

			@Override
			public boolean hasNext() {
				return count < arr.length;
			}

			@Override
			public Object next() {
				getValue();
				return arr[count++];
			}

			@Override
			public void getValue() {
				int value = (int) arr[count];
				
				if(tmp % 2 == 0) {
					if(dividesByTwo(value) == true) {
						System.out.println("paired value = " + arr[count]+ " modify " + (value+1)); 
					}else {
						System.out.println("value = " + arr[count]+ " is NOT paired");
					}
					tmp =0;
				}
				tmp++;				
			}
			
			static public boolean dividesByTwo(int a){
				return (a%2==0);
			}			
		}
				
		public static IteratorFive createIteratorFive(Object[] arr) {
			return new IteratorFive(arr);
		}
		

	
	}


