package rahul.assignment.week1;

public class WordPlay {
    public boolean isVowel(char ch)
    {
        if("aeiouAEIOU".indexOf(ch) != -1){
            return true;
        }
        else {
            return false;
        }
    }

    public String replaceVowels(String phrase, char ch)
    {
        String newphrase="";
        for (int i=0;i<phrase.length();i++)
        {
            if (!isVowel(phrase.charAt(i)))
            {
                newphrase = newphrase + phrase.charAt(i);
            }
            else 
            {
                newphrase =  newphrase + ch;
            }    
        }
        return newphrase;
    }
    
    public String emphasize(String phrase, char ch)
    {
        String newphrase="";
        for (int i=0;i<phrase.length();i++)
        {
            if (phrase.charAt(i) == Character.toUpperCase(ch) || phrase.charAt(i) == Character.toLowerCase(ch))
            {
                if (i%2==0)
                {
                	newphrase = newphrase + '*';
                } 
                else 
                	newphrase = newphrase + '+'; 
            }
            else 
            {
            	newphrase =  newphrase + phrase.charAt(i);
            }    
        }
        return newphrase;
    }
    
	public void isVowelTest() {
		System.out.println(isVowel('F'));
		System.out.println(isVowel('a'));
	}
	
	public void replaceVowelsTest() {
		System.out.println(replaceVowels("Hello World", '*'));
	}
	
	public void emphasizeTest() {
		System.out.println(emphasize("dna ctgaaactga", 'a'));
		System.out.println(emphasize("Mary Bella Abracadabra", 'a'));
	}

}
