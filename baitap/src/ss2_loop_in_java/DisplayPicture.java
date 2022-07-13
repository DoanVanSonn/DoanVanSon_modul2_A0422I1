package ss2_loop_in_java;

public class DisplayPicture {
    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 6; j++) {
                System.out.print('*');
            }
            System.out.print("\n");
        }
        System.out.println('\n');
        System.out.println('\n');
        System.out.println('\n');
        System.out.println('\n');
        System.out.println('\n');
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }
        System.out.println('\n');
        System.out.println('\n');
        System.out.println('\n');
        System.out.println('\n');
        System.out.println('\n');
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }

}
