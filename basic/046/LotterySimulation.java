/**
 * @author 	Jingjing Yang <jingjing.yang@tuni.fi>
 * @version     2024.0208 (last modified)
 * @since   	17.0 (miminimum Java version)
 */
class LotterySimulation {

    /**
     * Exercise: 4.6
     *     4.6 Function lottery
	 *
	 *         NOTE: use function dice() from previous exercise.
	 *
	 *         NOTE: use function dice() from previous exercise.
	 *
	 *         Write a simple[1] Finnish lottery[2] where the numbers and
	 *         spare numbers are displayed to the screen:
	 *
	 *             Lottery: N, N, NN, N, N ...
	 *             Spare: N, N, NN
	 *
	 *         [1] In simple in a sense that you may get same numbers from
	 *         random number generator. Ignore possible duplicate numbers for
	 *         this exercise. To implement lottery correctly, there would be
	 *         need to store the values to an array for checking against
	 *         duplicates.
	 *
	 *         [2] https://www.veikkaus.fi/fi/lotto
     *
     * @param args Command line arguments. Not used.
     * @return No return value (void method).
     */
	public static void main(String[] args) {
		lottery();
	}

	/**
	 * This method simulates a simple lottery system where the numbers and spare numbers are displayed to the screen.
	 * It uses the dice method to generate lottery numbers.
	 */
	public static void lottery() {
		System.out.print("Lottery: ");
		for (int i = 0; i < 7; i++) {
			System.out.print(dice() + " ");
		}
		System.out.print("\nSpare: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(dice() + " ");
		}
	}

	/**
	 * This method simulates a dice roll and returns a random number between 1 and 40.
	 * @return Dice roll value.
	 */
	public static int dice() {
		return (int) (Math.random() * 40) + 1;
	}
}

// End of file