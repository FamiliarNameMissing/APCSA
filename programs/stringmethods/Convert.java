public class Convert {
    
    private String word;
    
    public Convert (String xword) {
        word = xword;
    }
    
    public String changeMe() {
        //String lastLetters = word.substring(word.length() - 2);
        String firstLetter = word.substring(word.length() - 2, word.length() - 1);
        String lastLetter = word.substring(word.length() - 1);
        String modified = word.substring(0, word.length() - 2);
        return modified + lastLetter + firstLetter;
    }
    
}
