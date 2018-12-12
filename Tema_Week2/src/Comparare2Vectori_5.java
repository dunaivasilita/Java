import java.util.Arrays;
public class Comparare2Vectori_5 {
	
	   public static void main(String[] args) {

	      // initiliazing three object arrays
	      Object[] myArray1 = new Object[] { 1,2,3,4 };
	      Object[] myArray2 = new Object[] { 1,2,3, 4 };
	      Object[] myArray3 = new Object[] { };
	      Object[] myArray4 = new Object[] { };
	      Object[] myArray5 = new Object[] { 1, 3,2 };
	      Object[] myArray6 = new Object[] { 1,1 };
	      Object[] myArray7 = new Object[] { 1,2,4,3 };
	      

	      // comparing arr1 and arr2
	      boolean comparatie1 = Arrays.equals(myArray1, myArray2);
	      System.out.println("[1,2,3,4] and [1,2,3,4] equal: " + comparatie1);

	      // comparing arr1 and arr3
	      boolean comparatie2 = Arrays.equals(myArray3, myArray4);
	      System.out.println("[] and [] equal: " + comparatie2);
	      
	      boolean comparatie3 = Arrays.equals(myArray5, myArray6);
	      System.out.println("[1,3,2] and [1,3] equal: " + comparatie3);
	      
	      boolean comparatie4 = Arrays.equals(myArray1, myArray7);
	      System.out.println("[1,2,3,4] and [1,2,4,3] equal: " + comparatie4);
	   
	      System.out.println("-----");
	   }
	}	
