

public class ConcatenareVectori_6 {

	public static void main(String[] args) {
		 int[] myArray1 = new int[] { 1,2,3,4 };
	     int[] myArray2 = new int[] { 5,6,7,8 };
	     int[]myArrayResult = new int[myArray1.length + myArray2.length];
	     int count=0;
	     for(int i = 0; i<myArray1.length; i++) { 
	    	 myArrayResult[i] = myArray1[i];
	         count++;
	      } 
	      for(int j = 0;j<myArray2.length;j++) { 
	    	  myArrayResult[count++] = myArray2[j];
	      } 
	      for(int i = 0;i<myArrayResult.length;i++) System.out.print(myArrayResult[i]+" ");
	     
	     
	     
	     }
	}


