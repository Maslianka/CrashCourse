import org.testng.annotations.Test;


public class FirstTest {

    @Test
    public void test1() {
        BaseClass baseClass = new BaseClass();
        baseClass
                .openHomePage()
                .goToLoginPage()
                .setFirstName("Bob")
                .setLastName("Marley")
        .setEmail("bobMarley@gmail.com")
        .setPassword("password")
        .setConfirmPassword("password");


    }

}
