import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.*;

public class PasswordCheckerTest {

  
  @Test
  public void testDefBannedPasswordsReturn() {
    //Arrange 
    PasswordChecker checker = new PasswordChecker(3, 7);

    //Act
    Boolean actual = checker.isBannedPassword("hello");

    //Assert
    assertTrue(actual);
    
  }

}
