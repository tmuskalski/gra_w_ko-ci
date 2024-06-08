import java.util.Scanner;

public class Game
{
    protected int liczbaRzutow;


    public void start ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe rzutow:");
        liczbaRzutow = scanner.nextInt();
        gra();

    }

    protected void gra()
    {

    }
}
