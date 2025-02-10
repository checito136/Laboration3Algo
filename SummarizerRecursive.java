package algo.sum;
/**
 * Algorithmic methods to calculate sum using recursive solutions.
 */
public class SummarizerRecursive implements Summarizer {
	@Override
	public long sumOfNaturalNumbers(long n) {
		// TODO Implement a recursive solution.
		if (n > 0) {
			return n + sumOfNaturalNumbers(n - 1);
		}
		return 0;
	}
	@Override
	public long sumOfNaturalNumbersSquared(long n) {
		// TODO Implement a recursive solution.
		if (n > 0) {
			return n * n + sumOfNaturalNumbersSquared(n - 1);
		}
		return 0;
	}
}