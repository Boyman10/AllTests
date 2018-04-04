package Tools;

/**
 * Testing different kind of things..
 */
public class MyTools {

	/**
	 * Generate array of 
	 * @param nbColors
	 * @param nbDigits
	 */
	public void generateArray(int nbColors, int nbDigits) {
		
		String item;
		
		for(int i = 0;i< Math.pow(nbColors,nbDigits);i++) {
			item = String.format("%1$" + nbDigits + "s", i).replace(' ', '0');
			System.out.println("- i = " + item);
			
		}
	}
	
}
