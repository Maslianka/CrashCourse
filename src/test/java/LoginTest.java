import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void testSignUp() {
        BaseClass baseClass = new BaseClass();

        String actualResult = baseClass
                .openHomePage()
                .goToLoginPage()
                .setFirstName("Bob")
                .setLastName("Marley")
                .getNameOfButton();

        Assert.assertEquals(actualResult, "SIjhGN UP");

    }

}
