import org.testng.annotations.Test;

public class SearchHotels {

    @Test
    public void testSearchHotel() {
        String cityName = "Lviv";



        BaseClass baseClass = new BaseClass();

        baseClass
                .openHomePage()
                .selectValueFromList(cityName)
                .clickSearchHotel();
    }
}
