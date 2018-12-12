
public class CountChar_11 {

	public static void main(String[] args) {
		String text = "<Hello java world>";
		int count = 0;

		
		    

		    for(int i=0; i < text.length(); i++)
		    {    if(text.charAt(i) == 'a')
		            count++;
		    
		}
		    System.out.println("In " +text+ " caracterul 'a' se gaseste de  "+count+ " ori");

	}

}
