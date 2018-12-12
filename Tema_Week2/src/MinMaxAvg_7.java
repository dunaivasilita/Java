
public class MinMaxAvg_7 {

	public static void main(String[] args) {
		
		int[] myArray = new int[] { 13,20,14,5,2,8};
		int min=myArray[0];
		int max=0;
		int sum=0;
		double avg =0.0;
		
		for(int i=0;i<myArray.length; i++) {
			if(myArray[i]>max) {
				max=myArray[i];
			}
		}
		for(int i=0;i<myArray.length; i++) {
			if(myArray[i]<min) {
				min=myArray[i];
			}
		}
		
		for(int i=0;i<myArray.length; i++) {
			 sum+=myArray[i];
			 if(myArray[i]==0) {
				 avg=0;
			 }else avg=sum/myArray.length;
		}
		
		

		
		
		System.out.println("Minim din lista este: " +min);
		System.out.println("Maxim din lista este: " +max);
		//System.out.println("Suma listei: " +sum);
		System.out.println("Media elementelor din lista: " +avg);

	
		
	}

}
