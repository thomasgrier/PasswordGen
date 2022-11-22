import java.util.Scanner;

public class main 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What length would you like your password to be?");
        int length = input.nextInt();

        for(int ii = 0; ii < length; ii++)
        {
            randomChar rand = new randomChar();
            rand.charToString();
        }
        System.out.println();
    }    
}
