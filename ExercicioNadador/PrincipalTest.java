import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * The test class PrincipalTest.
 *
 * @author  Eduardo Rambo e Julia Schleien 
 * @since 01/06/2020 - 08:19
 * @category Test 
 */
public class PrincipalTest {
  public static void main(String[] args) {
      
    System.out.println("\f");  
    
    Result result = JUnitCore.runClasses(NadadorTest.class);
        for (Failure failure : result.getFailures()) {
        System.out.println(failure.toString());
       } 
  }
}