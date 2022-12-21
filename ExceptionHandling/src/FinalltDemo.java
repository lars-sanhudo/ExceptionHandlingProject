// Use finally.

class UseFinally {
    public static void genException(int what){
        int t;
        int [] nums = new int[2];

        System.out.println("Receiving " + what);
        try{
            switch(what) {
                case 0:
                    t = 10 /what; // Generate div-by-zero error.
                    break;
                case 1:
                    nums[4] = 4; // generate array index error.
                    break;
                case 2:
                    return; //return from try block.
            }
        }
        catch(ArithmeticException exc){
            System.out.println("Can't divide by Zero.");
            return; //return from catch.
        }
        catch(ArrayIndexOutOfBoundsException exc) {
            System.out.println("No matching element found.");
        }
        finally {
            System.out.println("Leaving try.");
        }
        
    }
}

public class FinalltDemo {
    public static void main(String[] args){
        for(int i = 0; i < 3; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
}
