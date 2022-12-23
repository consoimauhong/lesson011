package DaonguocStack;
import java.util.*;

public class wStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<String> stack = new Stack<>();

        System.out.println("Nhap chuoi vao: ");
        String text = scanner.nextLine();
        //NGUYEN THI HUYEN TRAN
        //goi ham dua ki tu vao stack
        for(int i = 0; i < text.length(); i++){
            stack.push(text.charAt(i) + " ");

        }
        System.out.println("chuoi dao nguoc: ");
        for(int i = 0; i < text.length(); i++){
            System.out.print(stack.pop());
        }
    }
}
