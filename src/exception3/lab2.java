
package exception3;

public class lab2 {
    public static void main(String[] args) {
       
            int[] list = new int[10];
            try{
            System.out.println("list[10] is"+list[10]);
            }
            catch(ArithmeticException e){
                System.out.println("ArithmeticEdxceptopm");
            }
            catch(RuntimeException e) {
                System.out.println("RuntimeException");
            }
            catch(Exception e) {
                
            }
    }
}
