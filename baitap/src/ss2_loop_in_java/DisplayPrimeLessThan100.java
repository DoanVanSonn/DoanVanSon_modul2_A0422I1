package ss2_loop_in_java;

public class DisplayPrimeLessThan100 {
    public static void main(String[] args) {
        System.out.println(" so nguyen to nho hon 100 la: ");
        double numbers=100;
        int count=1;
        int num=3;
        if (numbers>=1){
            System.out.println(2);
        }
        for ( int i = 2 ; i <numbers ; i++ )
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
            }
            count = 1;
            num++;

        }
    }
    }

