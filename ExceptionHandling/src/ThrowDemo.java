// Manually throw an exception.
import java.io.*;

public class ThrowDemo {
    public static void main(String[] args) throws IOException{
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        try {
            
            System.out.println("Before Throw");
            int i = 0;
            
            do{
                System.out.println("1 - AritmeticException");
                System.out.println("2 - Throwable");
                System.out.println("Choose one of the options:");
                i = Integer.parseInt(in.readLine());
                if(i == 1) {
                    throw new ArithmeticException();
                }
                if(i ==2) {
                    throw new Throwable();
                }
                System.out.println("Invalid Option.");
            } while(i !=1 || i !=2);
            
        }
        catch(ArithmeticException exc) {
            //catch the exception
            System.out.println("Exception caught.");
        }

        catch(IOException exc){
            System.out.println("Erro na leitura.");
           }
        
        catch(Throwable exc) {
            //catch the exception
            System.out.println("Superclass exception catch.");
        }
        System.out.println("After try/catch block.");

       
        
        in.close();
        
    }
}
