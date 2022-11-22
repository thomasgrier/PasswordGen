import java.util.*;
import java.lang.Math;

public class randomChar
{
    //class fields
    char rand;

    public randomChar()
    {
        rand = generateRand();
    }

    public char generateRand()
    {
        int randomNum = (int)(Math.random() * 94) + 33;
        rand = (char)randomNum;
        return rand;
    }

    public void charToString()
    {
        System.out.print(this.rand);
    }
}