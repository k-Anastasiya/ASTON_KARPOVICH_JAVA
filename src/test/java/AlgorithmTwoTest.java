import java_project.task_two.AlgorithmTwo;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlgorithmTwoTest {

  @Test
  public void checkDisplayName() {
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertEquals(AlgorithmTwo.displayNameOnThe("FFGHFGFFGH"), "Нет такого имени");
    softAssert.assertEquals(AlgorithmTwo.displayNameOnThe("Вячеслав"), "Привет, %s");
    softAssert.assertAll();
  }
}
