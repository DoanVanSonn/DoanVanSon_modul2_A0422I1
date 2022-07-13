package ss2_loop_in_java;

import java.util.Scanner;

public class Display20TheFirstPrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("moi ban nhap so nguyen to muon in ra: ");
        double numbers= Double.parseDouble(sc.nextLine());
        int count=1;
        int num=3;
        if (numbers>=1){
            System.out.println(2);
        }
        for ( int i = 2 ; i <=numbers ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num % j == 0 )
                {
                    count = 0;
                    break;
                }
            }
            if ( count != 0 )
            {
                System.out.println(num);
                i++;
            }
            count = 1;
            num++;

        }
    }
}
