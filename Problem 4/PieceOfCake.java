import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class PieceOfCake {

	public static void main(String []args) {

		//user input sequence
		
		try{
			// open input stream PieceOfCakeInput.txt for reading purpose.

			BufferedReader br = new BufferedReader(new FileReader("PieceOfCakeInput.txt"));
						
			int noOfCakes = Integer.parseInt(br.readLine());
			int[] area = new int[noOfCakes];
			
			for (int i=0; i<noOfCakes; i++) {
				area[i] = Integer.parseInt(br.readLine());
			}
			
			for (int i=0; i<area.length; i++) {
				
				int min = area[i] + 1, n = 2, sum = 0;

				while (n < area[i]) {
					if (area[i]%n == 0) {
						if (n <= area[i]/n) {
							sum = n + (area[i]/n);
							if (sum < min){
								min = sum;
							}
						}
					}
					n++;
				}
				System.out.println(2*min);
				
			}


		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
