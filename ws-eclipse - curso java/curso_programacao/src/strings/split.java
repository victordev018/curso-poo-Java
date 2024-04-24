package strings;

public class split {

	public static void main(String[] args) {
		String exemplo = "Hello World!";
		
		String[] vetor = exemplo.split(" ");
		String word1 = vetor[0];
		String word2 = vetor[1];
		
		//System.out.printf("whord 1: %s, word2 %s",word1,word2);
		System.out.print(vetor.length);

	}

}
