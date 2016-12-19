import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Scanner;

public class DnaSeq {

	public static void main(String []args) {

	
		//user input sequence
		String  thisLine = "";
				try{
					// open input stream DnaSeqInput.txt for reading purpose.
					
					BufferedReader br = new BufferedReader(new FileReader("DnaSeqInput.txt"));
					while ((thisLine = br.readLine()) != null) {
						System.out.println(thisLine);
						
						int count = 1, max = 0;
						char maxString = '\0';

						for (int i=0; i<thisLine.length()-1; i++) {
							char currChar = thisLine.charAt(i);
							if (currChar == thisLine.charAt(i+1)) {		//if curr char == next, increase count
								count++;
							}
							else {										//else update max & maxString
								if (max < count){
									max = count;
									maxString = currChar;
									count = 1;
								}
							}
						}

						System.out.println(maxString);
						System.out.println(max);						
						
					}       
				}catch(Exception e){
					e.printStackTrace();
				}

		
	}
}
