package main.com;

/**
 * This class provides a utility method to compare two version strings.
 * 
 * Author: Aman Shukla
 * Date: 05/01/2024
 * 
 * The compareVersions method takes two version strings as input and compares them.
 * A version string is typically composed of numbers separated by dots (e.g., "1.0.0").
 * 
 * Method returns:
 * - A negative integer if version1 < version2
 * - Zero if version1 == version2
 * - A positive integer if version1 > version2
 */
public class VersionComparator {

    /**
     * Compares two version strings and determines their relative order.
     * 
     * @param version1 The first version string (e.g., "1.0.0").
     * @param version2 The second version string (e.g., "1.0.1").
     * @return An integer indicating the comparison result:
     *         - Negative if version1 is less than version2
     *         - Zero if version1 is equal to version2
     *         - Positive if version1 is greater than version2
     */
    public static int compareVersions(String version1, String version2) {
        // Split the version strings into individual components based on the dot separator.
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int i = 0;
        // Iterate through both version arrays until all components are compared.
        while (i < v1.length || i < v2.length) {
            // Parse the current component of each version, defaulting to 0 if out of bounds.
            int v1Part = (i < v1.length) ? Integer.parseInt(v1[i]) : 0;
            int v2Part = (i < v2.length) ? Integer.parseInt(v2[i]) : 0;

            // Compare the current components; return the result if they differ.
            if (v1Part != v2Part) {
                return Integer.compare(v1Part, v2Part);
            }
            i++; // Move to the next component.
        }

        // If all components are equal, return 0.
        return 0;
    }
}

