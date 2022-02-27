import java.util.Random;

public class ComputeMethods5026211142 {

    public double fToC (double degreesF) {
        return 5 / 9.0 * (degreesF - 32);
    }

    public double hypotenuse (double a, double b) {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }

    public int roll () {

        Random dice = new Random();

        int d1 = dice.nextInt(6) + 1;
        int d2 = dice.nextInt(6) + 2;
	int sum = (d1+d2);
	return(sum);
    }
}