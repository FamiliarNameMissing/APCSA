public class NumberTriangle
{
    public static void main(String[] args)
    {
       triangle();
    }
    
    public static void triangle()
    {
        for (int x = 1; x < 6; x++) {
            for (int y = 1; y < x + 1; y++) {
                System.out.print(y + " ");
            }
        System.out.println();
        }
    }
}
