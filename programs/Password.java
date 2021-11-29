//2021-11-23
import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the password: ");
        String password = input.nextLine();
        System.out.println(passwordCheck(password));
    }
   
    public static boolean passwordCheck(String password)
    {
        int total = 0;
        boolean status = true;
       
        int letters = letterCheck(password);
       
        total += letters;
       
        int numbers = numberCheck(password);
       
        total += numbers;

        if (total < 8) {
            return false;        
        } else if (total == password.length()) {
            return true;
        } else {
            return false;
        }
       
    }
   
    public static int letterCheck(String paword) {
        String pword = paword.toLowerCase();
        String a = "abcdefghijklmnopqrstuvwxyz";
        int isIn = 0;
        for (int x = 0; x < pword.length(); x++) {
            String pletter = pword.substring(x, x + 1);
            for (int y = 0; y < a.length(); y++) {
                String aletter = a.substring(y, y + 1);
                if (pletter.equals(aletter)) {
                    isIn++;
                }
            }
        }
       
        return isIn;
    }
   
    public static int numberCheck(String word) {
        String n = "1234567890";
        int is = 0;
        for (int z = 0; z < word.length(); z++) {
            String nletter = word.substring(z, z + 1);
            for (int g = 0; g < n.length(); g++) {
                String nnumber = n.substring(g, g + 1);
                if (nletter.equals(nnumber)) {
                    is++;
                }
            }
        }
       
        return is;
    }
}
