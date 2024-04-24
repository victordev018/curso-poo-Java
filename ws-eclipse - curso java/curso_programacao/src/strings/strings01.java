package strings;

public class strings01 {

	public static void main(String[] args) {
		String exemplo = "abcde FGHIJ ABC abc DEFG  " ;
		
		//modificações
		String s01 = exemplo.toLowerCase();
		String s02 = exemplo.toUpperCase();
		String s03 = exemplo.trim();
		String s04 = exemplo.substring(2); //construir nova string a apartir do caractere de posição 2.
		String s05 = exemplo.substring(2,9); //substring do caractere 2 ao 9.
		String s06 = exemplo.replace('a', 'D'); //onde encontrar 'a', substituirá por 'D'.
		String s07 = exemplo.replace("abc", "XY"); //faz o mesmo, so que com substring.
		int s08 = exemplo.indexOf("bc"); //primeira posição da substring "bc".
		int s09 = exemplo.lastIndexOf("bc"); //ultima posição da substring "bc".
		
		//saida
		System.out.println("Original -"+exemplo+"-");	
		System.out.println("toLowerCase -"+s01+"-");
		System.out.println("toUpperCase -"+s02+"-");
		System.out.println("trim - "+s03+" -");
		System.out.println("Substring(2) - "+s04+" -");
		System.out.println("Substring (2, 9) - "+s05+" -");
		System.out.println("replace - "+s06+" -");
		System.out.println("replace  - "+s07+" -");
		System.out.println("indexOf 'bc':"+s08);
		System.out.println("lastIndexOf 'bc':"+s09);
		
	}

}
