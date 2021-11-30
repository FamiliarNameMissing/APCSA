public class Stargazers
{
    public static void main(String[] args)
    {
       starTree();
    }
    public static void starTree()
    {
        String buffer = "";
        for (int i = 9; i > 0; i--) {
            System.out.print(buffer);
            for (int x = i; x > 0; x--) {
                System.out.print("* ");      
            }
            buffer += " ";
            System.out.println();
        }
    }
}
