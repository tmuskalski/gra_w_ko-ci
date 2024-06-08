import java.util.Random;

public class DiceGame extends Game
{
private int [] rzuty;

 private Random random ;
    public DiceGame()
    {
        random = new Random();
    }

    protected void gra ()
    {
        rzuty = new int[liczbaRzutow];
        int suma = 0;
        for (int i= 0; i <liczbaRzutow; i++)
        {
            int rzut1= losowanie();
            int rzut2= losowanie();
            int suma2rzutow= rzut1 + rzut2;
            rzuty[i]= suma2rzutow;
            suma+=suma2rzutow;
            System.out.println("Rzut " + (i + 1) + ": " + rzut1 + " + " + rzut2 + " = " + suma);
        }

    }





    public int losowanie()
    {
        return random.nextInt(6) +1 ;
    }
}
