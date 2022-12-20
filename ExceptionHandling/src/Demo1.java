public class Demo1 {
    public static void main(String[] args){
        int [] nums = new int[4];

        try{
            System.out.println("Before the exception is generated.");

            // Generate an index out-of-bound exception.
            nums[7] =10;
        }
        catch(ArrayIndexOutOfBoundsException exc) {
            //catch the exception.
            System.out.println("Index out-of the bonds");
        }
        System.out.println("After catch statement.");

    }
}
