/**
 * @author 	Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0208 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
class NumberSeries {

    /**
     * Exercise: 3.2
     *         3.2 Loop series
	 *
	 *         Write a program to display 10-based column numbers to the
	 *         screen. The *length* of the display can be configured.
	 *         Substitute last number with space at the end.
	 *
	 *             int length = 25;
	 *             ... code ...
	 *
	 *         Output:
	 *
	 *             123456789 123456789 12345
     *
     * @param args Command line arguments. Not used.
     * @return No return value (void method).
     */
	public static void main(String[] args) {
		printSeries(25);
	}

	/**
	 * This method prints the number series.
	 * @param length the length of the number series
	 * @return No return value (void method).
	 */
	public static void printSeries(int length) {
		for (int i = 1; i <= length; i++) {
			printNumberOrSpace(i);
		}
	}

	/**
	 * This method prints a number or a space.
	 * @param value the current value in the series
	 * @return No return value (void method).
	 */
	public static void printNumberOrSpace(int value) {
		if (value % 10 == 0) {
			System.out.print(" ");
		} else {
			System.out.print(value % 10);
		}
	}
}

// End of file