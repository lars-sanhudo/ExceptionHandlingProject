import java.io.IOException;

public class ThrowsDemo {
    public static char prompt(String str) throws IOException {
            System.out.println(str + ": ");
            return (char) System.in.read();
    }

    public static void main(String[] args){
        char ch;

        try{
            ch = prompt("Enter a letter");
        }
        catch(IOException exc) {
            System.out.println("I/O exception ocurred.");
            ch = 'X';
        }

        System.out.println("You pressed " + ch);
    }
    
}
