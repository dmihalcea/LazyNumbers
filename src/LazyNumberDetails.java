
public class LazyNumberDetails {

	private int number;
	private boolean primeCache;
	private boolean perfectCache;
	private boolean magicCache;
	private boolean primeLazy;
	private boolean perfectLazy;
	private boolean magicLazy;

	public LazyNumberDetails(int number) {
		this.number = number;
	}

	public void updateNumber(int number) {
		this.number = number;
		this.primeCache = false;
		this.perfectCache = false;
		this.magicCache = false;
		this.primeLazy = false;
		this.perfectLazy = false;
		this.magicLazy = false;

	}

	public boolean isPrime() {
		if (this.primeLazy == false) {
			return this.primeAlgrithm();
		}
		return this.primeCache;
	}

	public boolean isPerfect() {
		if (this.perfectLazy == false) {
			return this.perfectAlgorithm();
		}
		return this.perfectCache;
	}

	public boolean isMagic() {
		if (this.magicLazy == false) {
			return this.magicAlgorithm();
		}
		return this.magicCache;
	}

	public boolean primeAlgrithm() {
		this.primeLazy = true;
		if (this.number < 2) {
			return false;
		}
		for (int i = 2; i <= this.number / 2; i++) {
			if (this.number % i == 0) {
				return false;
			}
		}
		this.primeCache = true;
		return true;
	}

	public boolean perfectAlgorithm() {
		this.perfectLazy = true;
		int sum = 0;
		for (int i = 1; i < this.number; i++) {
			if (this.number % i == 0) {
				sum += i;
			}
		}
		if (sum == this.number && this.number != 0) {
			this.perfectCache = true;
			return true;
		}
		return false;
	}

	public boolean magicAlgorithm() {
		this.magicLazy = true;
		int sum = 0;
		int n = this.number;
		while (n != 0) {
			int cifra = n % 10;
			sum += cifra;
			n /= 10;
		}

		if (sum == 3 || sum == 7 || sum == 9) {
			magicCache = true;
			return true;
		}
		n = sum;
		sum = 0;
		while (n != 0) {
			int cifra = n % 10;
			sum += cifra;
			n /= 10;
		}

		if (sum == 3 || sum == 7 || sum == 9) {
			magicCache = true;
			return true;
		}
		return false;
	}
}
