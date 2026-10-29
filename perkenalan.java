import java.util.Scanner;

public class Main{
	public static void main(String[] x) {
		Scanner input = new Scanner(System.in);

			System.out.println("Masukkan nama? = ");
				String nama = input.nextLine();

			System.out.println("Masukkin kelas = ");
				String kelas = input.nextLine();

			System.out.println("============");

			System.out.println("Name :" + nama);
			System.out.println("Class :" + kelas);

			System.out.println("============");
	}
}