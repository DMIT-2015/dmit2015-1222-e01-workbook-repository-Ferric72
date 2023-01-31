package dmit2015.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CircleTest {
    @Test
    void area_SmallValue_ReturnsCorrectResult() {
// Arrange and Act
        Circle circle1 = new Circle(5);
// Assert
        assertEquals(78.54, circle1.area(), 0.005);
    }

    @Test
    void diameter_SmallValue_ReturnsCorrectResult() {
// Arrange and Act
        Circle circle1 = new Circle(5);
// Assert
        assertEquals(10, circle1.diameter());
    }

    @Test
    void circumference_SmallValue_ReturnsCorrectResult() {
// Arrange and Act
        Circle circle1 = new Circle(5);
// Assert
        assertEquals(31.42, circle1.circumference(), 0.005);
    }

    @Test
    void allMethods_SmallValue_ReturnsCorrectResult() {
// Arrange and Act
        Circle circle1 = new Circle(5);
// Assert
        assertAll("all methods",
                () -> assertEquals(78.54, circle1.area(), 0.01),
                () -> assertEquals(10, circle1.diameter()),
                () -> assertEquals(31.42, circle1.circumference(), 0.005)
        );
    }
}