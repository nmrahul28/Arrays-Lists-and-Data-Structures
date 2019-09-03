package rahul.assignment.week1;
import edu.duke.*;
public class CaesarCipher {
	public String encrypt(String input, int key) {
        StringBuilder stringBuilder = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet = alphabet.substring(key)+alphabet.substring(0,key);
        for(int i = 0; i < stringBuilder.length(); i++) {
            char currChar = stringBuilder.charAt(i);
            int index = alphabet.indexOf(Character.toUpperCase(currChar));
            if(index != -1){
                if (currChar == Character.toUpperCase(currChar)){
                    char newChar = shiftedAlphabet.charAt(index);
                    stringBuilder.setCharAt(i, newChar);
                }
                else{
                   char newChar = shiftedAlphabet.charAt(index);
                   stringBuilder.setCharAt(i, Character.toLowerCase(newChar)); 
                }
            }
        }
        return stringBuilder.toString();
    }
    

    public String encryptTwoKeys(String input, int key1, int key2) {
        StringBuilder stringBuilder = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet1 = alphabet.substring(key1)+alphabet.substring(0,key1);
        String shiftedAlphabet2 = alphabet.substring(key2)+alphabet.substring(0,key2);
        for(int i = 0; i < stringBuilder.length(); i++) {
            char currChar = stringBuilder.charAt(i);
            int idx = alphabet.indexOf( Character.toUpperCase(currChar));
            if(idx != -1 && i%2 ==0){
                if (currChar == Character.toUpperCase(currChar)){
                    char newChar = shiftedAlphabet1.charAt(idx);
                    stringBuilder.setCharAt(i, newChar);
                }
                else{
                   char newChar = shiftedAlphabet1.charAt(idx);
                   stringBuilder.setCharAt(i, Character.toLowerCase(newChar)); 
                }
            }
            else if (idx != -1 && i%2 ==1){
                if (currChar == Character.toUpperCase(currChar)){
                    char newChar = shiftedAlphabet2.charAt(idx);
                    stringBuilder.setCharAt(i, newChar);
                }
                else{
                   char newChar = shiftedAlphabet2.charAt(idx);
                   stringBuilder.setCharAt(i, Character.toLowerCase(newChar)); 
                }
            }
        }
        return stringBuilder.toString();
    }

    public void testCaesar() {
        int key = 3;
        FileResource fr = new FileResource();
        String message = fr.asString();
        String encrypted = encrypt(message, key);
        System.out.println("key is " + key + "\n" + encrypted);
        String decrypted = encrypt(encrypted, 26-key);
        System.out.println(decrypted);
        int key1=23;
        int key2=17;
        String encryptedWithTwoKeys = encryptTwoKeys(message, 23,17);
        System.out.println("keys are" +key1+" "+key2+ "\n" + encryptedWithTwoKeys);
        String decryptedWitTwoKeys = encryptTwoKeys(encryptedWithTwoKeys, 26-key1,26-key2);
        System.out.println(decrypted);
    }
}
