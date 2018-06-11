package Tools;

/**
 * Testing different kind of things..
 */
public class MyTools {

	/**
	 * Generate array of - max value
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
	
	
	/**
	 * Generate array of - max value = base nbColors 
	 * @param nbColors
	 * @param nbDigits
	 */
	public void generateArrayBase(int nbColors, int nbDigits) {
		
		String item;
		
		// n combo max = nbColors^nbDigits 
		for(int i = 0;i< Math.pow(nbColors,nbDigits);i++) {
			
			String tmp = Integer.toString(Integer.parseInt(Integer.toString(i), 10), 6);
			
			
			item = String.format("%1$" + nbDigits + "s",tmp).replace(' ', '0');
			System.out.println("- i = " + item);
			
		}
	}
}
