package test.java;

import junit.framework.TestCase;
import main.com.VersionComparator;
import org.junit.Test;

/**
 * This class contains unit tests for the VersionComparator utility class.
 * 
 * Author: Aman Shukla
 * Date: 05/01/2024
 * 
 * The testCompareVersions method validates the functionality of the 
 * compareVersions method in the VersionComparator class. It uses various 
 * test cases to ensure correct behavior under different scenarios.
 */
public class VersionComparatorTest {

    /**
     * Tests the compareVersions method with different version strings.
     */
    @Test
    public void testCompareVersions() {
        // Test case: "0.1" < "1.1"
        TestCase.assertEquals(-1, VersionComparator.compareVersions("0.1", "1.1"));

        // Test case: "1.1" < "1.2"
        TestCase.assertEquals(-1, VersionComparator.compareVersions("1.1", "1.2"));

        // Test case: "1.2" < "1.2.9.9.9.9"
        TestCase.assertEquals(-1, VersionComparator.compareVersions("1.2", "1.2.9.9.9.9"));

        // Test case: "1.3" < "1.3.4"
        TestCase.assertEquals(-1, VersionComparator.compareVersions("1.3", "1.3.4"));

        // Test case: "1.10" > "1.3.4"
        TestCase.assertEquals(1, VersionComparator.compareVersions("1.10", "1.3.4"));

        // Test case: "1.0.0" == "1"
        TestCase.assertEquals(0, VersionComparator.compareVersions("1.0.0", "1"));

        // Test case: "2.0" > "1.9.9"
        TestCase.assertEquals(1, VersionComparator.compareVersions("2.0", "1.9.9"));

        // Test case: "1.2.3" == "1.2.3"
        TestCase.assertEquals(0, VersionComparator.compareVersions("1.2.3", "1.2.3"));
    }
}
