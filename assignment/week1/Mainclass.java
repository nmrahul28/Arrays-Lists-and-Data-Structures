package rahul.assignment.week1;

public class Mainclass {

	public static void main(String[] args) {
		WordPlay wp = new WordPlay();
		wp.isVowelTest();
		wp.replaceVowelsTest();
		wp.emphasizeTest();
		CaesarCipher cc = new CaesarCipher();
		cc.testCaesar();
		WordLengths wl = new WordLengths();
		wl.testCountWordLengths();

	}

}
