package dmit2015.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void area_SmallValue_ReturnsCorrectResult() {
// Arrange and Act
        Rectangle rectangle1 = new Rectangle(3,4);
// Assert
        assertEquals(12, rectangle1.area(), 0.005);
    }

    @Test
    void perimeter_SmallValue_ReturnsCorrectResult() {
        Rectangle rectangle1 = new Rectangle(3,4);
        assertEquals(14, rectangle1.perimeter(), 0.005);
    }

    @Test
    void diagonal_SmallValue_RturnsCorrectResult() {
        Rectangle rectangle1 = new Rectangle(3,4);
        assertEquals(5, rectangle1.diagonal(), 0.005);
    }
}