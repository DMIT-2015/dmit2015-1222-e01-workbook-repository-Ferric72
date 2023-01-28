package dmit2015.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CanadianPersonalIncomeTaxManagerTest {

    @Test
    void readAllLinesFromCSVFile() {
        // Arrange an object to test
        var incomeTaxManager = new CanadianPersonalIncomeTaxManager();

        // Act on the object
        final String csvRelativePath = "data/CanadianPersonalIncomeTaxRates.csv";
        List<String> allLines = incomeTaxManager.readAllLinesFromCSVFile(csvRelativePath);

        // Assert -  Compare expected with actual results
        // There should be 440 elements in the list
        assertEquals(440,allLines.size());
        // Check the first and last element of the file
        //final String firstElement =
    }
}