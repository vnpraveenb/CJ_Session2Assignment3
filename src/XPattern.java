public class XPattern {

	public static void main(String[] args) {
 
		
		System.out.println("Printing X pattern");
		
		char xChar = '*';  // Stores the value of character *
		
		/* Total number of characters in each line.
		 * Increasing this number(replacing it with any higher odd number) will make the pattern bigger in size
		 */
		int maxChar= 5;
		
		// For loop to go to a new line till maxChar no.of lines are reached  
 		for(int i=0; i<maxChar; i++)
		{
 			
			//For loop to print the characters in each line viz., _ and *, for 
			for(int j=0; j<maxChar; j++)
			{
				
				/* If statement to check when the position of the character in the line(j) equals
				 * the line number(or row no.) 
				 *						 OR 
				 * when the position of the character in the line(j) equals
				 * (maximum number of characters in a line minus the line no. minus 1) and print
				 *    '*' else print "_"
				*/
				if((j==i) || (j==maxChar-i-1))
				{
					System.out.print(xChar);
				}
				else
				{
					System.out.print("_");
				} 
			}
			
			// To go to a new line after all characters in every line are printed
			System.out.println();
		}
	}
}

 
