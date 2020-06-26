package Day4;

public class Nested_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] fancyColors = { { "Red", "Blue", "Green" }, { "Cyan", "Magenta", "Turqiouse" } };

		for (int row = 0; row < 2; row++) {
			for (int column = 0; column < 3; column++) {
				System.out.println(fancyColors[row][column]);
			}
		}
		
		
		
		 for (int i=0; i<=3; i=i+1){
	           for (int j=1; j<=i; j=j+1) {
	                 System.out.print(" "+j);
	           }
	           System.out.println("");
	       }
			}
		

	}

