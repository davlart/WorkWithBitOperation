import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Scanner;
/**
 * Created by ArthurArt on 08.01.2017.
 */
public class WorkWithBitOperation {
    public static void task1(Scanner sc)
    {

        byte n = sc.nextByte();
        if(n<32)
            System.out.print(1<<n);
        else
            System.out.print("Ты тупой мудак!");
    }

    public static void task2(Scanner sc)
    {

        byte n = sc.nextByte();
        byte m = sc.nextByte();
        if((n<32)&&(m<32) &&(m!=n)) {
            System.out.print((1 << n) | (1 << m));

        }
        else
            System.out.print("Ты тупой мудак!");
    }

    public static void task3(Scanner sc)
    {

        byte A = sc.nextByte();
        byte  i = sc.nextByte();

        System.out.println(Integer.toBinaryString(A) );
        System.out.println(Integer.toBinaryString ((A >>> i)<<i) );

    }
    public static void task4(Scanner sc)
    {
        byte A = sc.nextByte();
        byte  i = sc.nextByte();
        System.out.println(Integer.toBinaryString( A|(1<<i)) );
    }
    public static void task5(Scanner sc)
    {
        byte A = sc.nextByte();
        byte  i = sc.nextByte();
        System.out.println(Integer.toBinaryString( A^(1<<i)) );
    }
    public static void task6(Scanner sc)
    {
        byte A = sc.nextByte();
        byte  i = sc.nextByte();
        System.out.println(Integer.toBinaryString( A&~(1<<i)) );
    }
    public static void task7(Scanner sc)
    {
        byte A = sc.nextByte();
        byte  i = sc.nextByte();
        System.out.println(Integer.toBinaryString ( A^(A >>> i)<<i));

    }
    public static void task8(Scanner sc)
    {
        byte A = sc.nextByte();
        byte  i = sc.nextByte();

        System.out.println(Integer.toBinaryString((A&(1<<i))>>>i));
    }
    public static void task9(Scanner sc)
    {
        byte A = sc.nextByte();
        byte  i = sc.nextByte();

        System.out.println(Integer.toBinaryString(2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // task1(sc);
        // task2(sc);
        //task3(sc);
        // task4(sc);
        // task5(sc);
        // task6(sc);
        // task7(sc);
        //task8(sc);
        task9(sc);
    }
}
