import java.util.Scanner;

public class Zadanie {
	public static void main(String[] args) {
		int x, y, a, b;
		String zn;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Podaj x");
		 x = in.nextInt();
		
		System.out.println("Podaj Y");
		 y = in.nextInt();
		
		System.out.println("Podaj ilosc rzedow");
		 a = in.nextInt();
		
		System.out.println("Podaj ilosc kolumn");
		 b = in.nextInt();
		
		System.out.println("Podaj znak");
		 zn = in.next();
		 
		 Rysowanie rys = new Rysowanie(x, y, a, b, zn);
		 
		 rys.funkcja();
		 
	}
	
	
}
