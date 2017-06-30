package day1examples;

public class SwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int human = 3;
	switch(human){
		case 0:
			System.out.println("Human is digitising");
			break;
	    case 1:
	    	System.out.println("Human is cruel");
	    	break;
	    case 2:
	    	System.out.println("Human is Donkey");
	        break;
	    case 3:
	    	System.out.println("Human is Survivour");
	        //break;
	     default:
	    	 System.out.println("Human is full of illbrain");
		        break;
	}
	/*String h = "three";
	
	switch(h){
		case "zero":
			System.out.println("Human is digitising");
			break;
	    case "one":
	    	System.out.println("Human is cruel");
	    	break;
	    case "two":
	    	System.out.println("Human is Donkey");
	        break;
	    case "three":
	    	System.out.println("Human is Survivour");
	        break;
	     default:
	    	 System.out.println("Human is full of illbrain");
		        break;
	
	}*/
	
	}
}

