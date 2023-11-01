import java.util.InputMismatchException;
import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        int n3 = 0;
        while ( true ) // ввод числа строк
        {
            System.out.println("Введите число строк");
            Scanner sc1 = new Scanner(System. in );
            try
            {
                n3 = sc1.nextInt();
                break;
            }
            catch(InputMismatchException fg)
            {
                System.out.print("Вы ввели не число. " );
            }
        }
        String[] str1 = new String[n3];
        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < str1.length; i++)
        {
            System. out.println( " Введите строку №" + (i+1));
            str1[i] = sc2.nextLine();
        }
        double aval=0;
        for(String item : str1)
        {
            aval+=(double) item.length();
        }
        aval/=str1.length;
        System.out.println("Строки короче стредней длины: ");
        for(int i=0;i< n3;i++)
        {
            if (str1[i].length() <aval )
            {
                System.out.println( str1[i]);
            }
        }
    }

}