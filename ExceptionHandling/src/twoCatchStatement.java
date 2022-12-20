// Two different catchs.

public class twoCatchStatement {
    public static void main(String[] args){
        int [] nums = new int[4];

        try{
            System.out.println("Before the exception is generated");

            // Generate an index out-of-bounds exception.
            nums[7] = 10;
            System.out.println("This won't be displayed");
        }
    
        catch(ArithmeticException aritExc) {
            System.out.println("ArithmeticExpection");
        }
        catch(ArrayIndexOutOfBoundsException arrExc) {
            System.out.println("Index out-of-bounds!");
        }

        System.out.println("After catch statement.");
    }
}
