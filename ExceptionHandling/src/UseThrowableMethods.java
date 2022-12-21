// Using the Throwable methods.
class ExcTest {
    static void genException() {
        int [] nums = new int [4];

        System.out.println("Before the exception is generated.");

        // Generate an index out-of-bounds exception.
        nums[7] =10;
        System.out.println("this won't be displayed.");
    }
}

public class UseThrowableMethods {
    public static void main(String[] args){
        try{
            ExcTest.genException();
        }
        catch(ArrayIndexOutOfBoundsException exc) {
            //catch the exception.
            System.out.println("Standart message is: ");
            System.out.println(exc);
            System.out.println("\nStack trace:");
            exc.printStackTrace();
        }
        System.out.println("After catch statement.");
    }
}
