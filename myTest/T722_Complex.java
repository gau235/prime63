package myTest;

/**
 * 複數.<br/>
 * 複數 高考普考.
 *
 * @version 2021/05/10_20:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/srchSrc.jsp?nameOfClass=T722_Complex" >T722_Complex.java</a>
 *
 */
class Complex {

	// (a+bi)/(c+di) = ((ac+bd)/(c^2+d^2))+((bc−ad)/(c^2+d^2))

	private double real;
	private double imaginary;

	public Complex() {

		this(0.0, 0.0);
	}

	public Complex(double r, double i) {

		real = r;
		imaginary = i;
	}

	public Complex add(Complex right) {

		return new Complex(real + right.real, imaginary + right.imaginary);
	}

	public Complex subtract(Complex right) {

		return new Complex(real - right.real, imaginary - right.imaginary);
	}

	public Complex division(Complex right) {

		double a = this.real;
		double b = this.imaginary;

		double c = right.real;
		double d = right.imaginary;

		return new Complex((a * c + b * d) / (c * c + d * d), (b * c - a * d) / (c * c + d * d));

		// return new Complex(
		// (real * right.real + imaginary * right.imaginary) / (right.real * right.real + right.imaginary * right.imaginary),
		// (imaginary * right.real - real * right.imaginary) / (right.real * right.real + right.imaginary * right.imaginary));

	}

	@Override
	public String toString() {

		return String.format("(%.1f, %.1f)", real, imaginary);
	}

	public String standardForm() { // 複數的另一表示法a+bi。注意0.0+bi要表示為bi；a+0.0i要表示為a；a+1.0i要表示為a+i

		double a = this.real;
		double b = this.imaginary;

		String s = "";
		if (a == 0.0) {

			if (b == 1.0)
				return "i";

			else {

				s = String.format("%.1f", b) + "i";

				return s;

			}
		}

		if (b == 0.0) {

			s = String.format("%.1f", a);
			return s;

		}

		if (b == 1.0) {

			s = String.format("%.1f", a) + " + i";
			return s;

		}

		s = String.format("%.1f", a) + " + " + String.format("%.1f", b) + "i";
		return s;

	}
}

public class T722_Complex {

	public static void main(String[] sAry) {

		Complex x = new Complex(1, 1);
		Complex y = new Complex(2, 2);
		System.out.printf("x = %s%n", x.toString());
		System.out.printf("n = %s%n", y);

		System.out.println("x+n=" + x.add(y));

		Complex z = new Complex(1, 0);
		System.out.println("inver=" + z.division(y));

		System.out.println("inver=" + z.division(y).standardForm());

	}
}