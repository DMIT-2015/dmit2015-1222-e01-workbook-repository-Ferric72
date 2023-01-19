package dmit2015.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RectangleParemeterizedTest {
    @ParameterizedTest(name = "length = {0}, width = {1}, expected area = {2} ")
    @CsvSource({
            "1.0,1.0,1.0",
            "2.0,3.0,6.0",
            "100.0,20.0,2000.0",
    })
    void area_DifferentLengthWidth_ReturnsCorrectResults(double length, double width, double expectedArea) throws Exception {
// Arrange
        Rectangle rectangle1 = new Rectangle();
// Act
        rectangle1.setLength(length);
        rectangle1.setWidth(width);
// Assert
        assertEquals(expectedArea, rectangle1.area(), 0.005);
    }

    @ParameterizedTest(name = "length = {0}, width = {1}, expected perimeter = {2} ")
    @CsvSource({
            "1.0,1.0,4.0",
            "2.0,3.0,10.0",
            "100.0,20.0,240.0",
    })
    void perimeter_DifferentLengthWidth_ReturnsCorrectResults(double length, double width, double expectedPerimeter) throws Exception {
// Arrange
        Rectangle rectangle1 = new Rectangle();
// Act
        rectangle1.setLength(length);
        rectangle1.setWidth(width);
// Assert
        assertEquals(expectedPerimeter, rectangle1.perimeter(), 0.005);
    }

    @ParameterizedTest(name = "length = {0}, width = {1}, expected diagonal = {2} ")
    @CsvSource({
            "1.0,1.0,1.41421",
            "2.0,3.0,3.60555",
            "100.0,20.0,101.98039",
    })
    void diameter_DifferentLengthWidth_ReturnsCorrectResults(double length, double width, double expectedDiameter) throws Exception {
// Arrange
        Rectangle rectangle1 = new Rectangle();
// Act
        rectangle1.setLength(length);
        rectangle1.setWidth(width);
// Assert
        assertEquals(expectedDiameter, rectangle1.diagonal(), 0.005);
    }
}