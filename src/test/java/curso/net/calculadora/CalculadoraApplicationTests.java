package curso.net.calculadora;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraApplicationTests {
private Calculadora calculator = new Calculadora();

 @Test
public void testSum() {
assertEquals(5, calculator.sum(2, 3));
}
}
