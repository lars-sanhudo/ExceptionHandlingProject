/* An exception can be generate by 
one method and caught by another*/



class ExcTest {
    // Generate the Exception
    public static void  genException() {
        int [] nums = new int[4];

        System.out.println("Before the expcetion is generated");

        // Generate an index out-of-the-bounds exception.
        nums[7] = 10;
        System.out.println("This won't be displayed.");
    }
}

class ExcDemo2 {
    public static void main(String[] args){
        try {
            ExcTest.genException();
        } catch(ArrayIndexOutOfBoundsException exc) {
            //catch the exception
            System.out.println("Index out-of-the-bounds");

        }
        System.out.println("After catch statement");
    }
}
