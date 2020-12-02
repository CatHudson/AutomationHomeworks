package homework04_Test;

import org.junit.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.geekbrains.lesson04.TriangleArea;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositiveTest {

    private static Logger logger = LoggerFactory.getLogger(PositiveTest.class);

    @ParameterizedTest
    public void positive_test (int a, int b, int c) {

        double result = TriangleArea.calculate(3,4,5);
        assertEquals(6.0, result);
        logger.info("Площадь треугольника равна " + result);
    }
}
