import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/ExpectedBorder1Border2.csv")
    public void shouldCalculateNumberOfRoots(int expected, int border1, int border2) {
        SQRService service = new SQRService();

        int actual = service.calcSQR(border1, border2);

        Assertions.assertEquals(expected, actual);
    }
}
