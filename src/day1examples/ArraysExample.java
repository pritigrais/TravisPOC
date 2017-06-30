package day1examples;

public class ArraysExample {

	/**
	 * @param args
	 * use arrays to store large amount of unique data
	 *  instead of using varialble a1,a2 etc we may be short of variables 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int[] a = {10,20,30,40,50} ;
		System.out.println(a[2] + " " + a[4]);
		
		//other way of printing arrays -enhanced for
		for(int temp : a){
			System.out.println("array is printed smartly" + temp);
			
		}*/
		//array declaration and then use it
		int[] x =new int[5];
		 x[2] = 80;
		 x[4] = 90;
		 for(int temp1 : x){
				System.out.println(temp1);
				
			}
		
		
		
		
	}

	
}
