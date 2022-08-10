import java.util.zip.CheckedInputStream;

import static org.junit.jupiter.api.Assertions.*;

class SortingCitiesTest {

    SortingCities sortingCities = new  SortingCities();
    void setUp() {

        sortingCities = new SortingCities();
    }

    @org.junit.jupiter.api.Test
    void convertUpperCase() {
        String[] expected = {"BERN", "LUCERNE", "INTERLAKEN", "GRINDELWALD", "ENGELBERG", "GENEVA", "MURREN", "BASEL", "ZERMATT", "JUNGFRAUJOCH"};
        String[] cities = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
        String[] actual = sortingCities.convertUpperCase(cities);
        assertArrayEquals( expected,actual);
    }

    @org.junit.jupiter.api.Test
    void cityFiftyTwoKmFromZurich() {
        String[] cities = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
        int[] distances = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
        String actual = sortingCities.cityFiftyTwoKmFromZurich(cities,distances);
        assertEquals("Lucerne",actual);
    }

    @org.junit.jupiter.api.Test
    void cityGreaterOrequalTwoSeventy() {
        String[] cities = {"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"};
        int[] distances = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
        String actual = sortingCities.cityGreaterOrequalTwoSeventy(cities,distances);
        assertEquals("Geneva",actual);
    }
}