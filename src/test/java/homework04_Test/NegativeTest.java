package homework04_Test;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.geekbrains.lesson04.TriangleArea;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NegativeTest {

    private static Logger logger = LoggerFactory.getLogger(NegativeTest.class);

    @Test
    public void negative_test () {

        double result = TriangleArea.calculate(0,3,4);
        assertEquals(-1, result);
        logger.debug("Одна из сторон меньше нуля, так что я ломаюсь.");

    }
}
