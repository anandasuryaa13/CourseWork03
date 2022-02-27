import java.util.Scanner;

public class TestClass5026211142 {

    public static void main(String[] args) {

        ComputeMethods5026211142 cm = new ComputeMethods5026211142();
        Scanner scn = new Scanner(System.in);

	// Kalkulator Suhu
        System.out.println("Fahrenheit to Celcius");
        System.out.println("Masukkan angka ==>");
        double x = scn.nextDouble();
        double celcius = cm.fToC(x);
        System.out.printf("100 F = %f\n", celcius);

	// Kalkulator Phytagoras
        System.out.println("Phytagoras Calculator");
        System.out.println("Panjang sisi 1 ==>");
        double sisi1 = scn.nextDouble();
        System.out.println("Panjang sisi 2 ==>");
        double sisi2 = scn.nextDouble();

        double hypotenuse = cm.hypotenuse (sisi1,sisi2);
        System.out.println("Hypotenuse = " + hypotenuse);


	// Menghitung roll dice
        int rollDice = cm.roll();
	System.out.println("Hasil penjumlahan dadu = " + rollDice);

    }

}