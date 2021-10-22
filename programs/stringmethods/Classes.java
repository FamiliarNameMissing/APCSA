//Benjamin C
//2021-10-22

import java.util.Scanner;

public class Classes
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = in.nextLine();
        
        Convert x = new Convert(word);
        String result = x.changeMe();
        System.out.println(result);

    }
}
