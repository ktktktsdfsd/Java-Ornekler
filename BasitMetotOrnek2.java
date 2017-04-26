package deneme1;

import java.util.Scanner;

public class Dinamik_metot_ornegi2 {
String parca_al(String klm, int ba, int bi)
{
	int a;
	String ys = "";
	for(a = ba; a <= bi ;a++)
	{
		ys += klm.charAt(a);
		
	}
	return (ys);
	
}
	public static void main(String[] args) {
		int x, y;
		String s;
		Scanner oku = new Scanner(System.in);
		s = oku.nextLine();
		System.out.print("Baþlangýç Noktasý");
		x = oku.nextByte();
		System.out.print("Bitiþ Noktasý");
		y = oku.nextByte();
		Dinamik_metot_ornegi2 F = new Dinamik_metot_ornegi2();
		System.out.println(F.parca_al(s, x,y));
	}

}
