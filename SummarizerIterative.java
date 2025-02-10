package algo.sum;
/**
 * Algorithmic methods to calculate sum using iterative solutions.
 */
public class SummarizerIterative implements Summarizer {
	@Override
	public long sumOfNaturalNumbers(long n) {
		// TODO Implement an iterative solution.

		long sum = 0;

		for (long i = 0; i >= 1; i++) {
			sum += i;
		}
		return sum;
	}
	@Override
	public long sumOfNaturalNumbersSquared(long n) {
		// TODO Implement an iterative solution.

		long sum = 0;
		for (long i = 1; i <= n; i++) {
			sum += i * i;
		}
		return sum;
	}
}