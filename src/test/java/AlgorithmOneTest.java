import java_project.task_one.Utils;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlgorithmOneTest {

  @Test
  public void checkTheTestWorkCorrectly() {
    Utils utils = new Utils();
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertTrue(utils.isVisibleNamePerson(8), "Method don't work correctly");
    softAssert.assertFalse(utils.isVisibleNamePerson(7), "Method don't work correctly");
    softAssert.assertAll();
  }
}
