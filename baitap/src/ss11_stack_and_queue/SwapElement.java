package ss11_stack_and_queue;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

public class SwapElement {
    public static void main(String[] args) {
        int[] intArray = IntStream.range(1, 11).toArray();
        Integer[] a = new Integer[3];
        a[0] = 1;
        a[1] = 5;
        a[2] = 9;
        System.out.println("Arrays integer before swap: ");
        Arrays.asList(a).forEach(System.out::println);
        Stack<Integer> wstack = new Stack<>();
        Arrays.asList(a).forEach(e -> wstack.push(e));
        int sizeW = wstack.size();
        for (int i = 0; i < sizeW; i++) {
            a[i] = wstack.pop();
        }
        System.out.println("Arrays integer after swap: ");
        Arrays.asList(a).forEach(System.out::println);
        System.out.println("---------------------------------------");
        Stack<String> mStack = new Stack<>();
        String b= "Doan Van Son";
        System.out.println("Array string before swap: ");
        System.out.println(b);
        Arrays.asList(b.split("")).forEach( e-> mStack.push(e) );
        StringBuilder stringBuilder = new StringBuilder();
        int sizeM = mStack.size();
        for (int i = 0; i < sizeM; i++) {
            stringBuilder.append(mStack.pop());
        }
        System.out.println("Arrays String after swap: ");
        System.out.println(stringBuilder);




    }


}
