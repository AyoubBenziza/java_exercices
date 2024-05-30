package fr.diginamic.Sorting;

import java.util.Comparator;

public class ComparatorPopulation implements Comparator<City> {

    public int compare(City city1, City city2) {
        return city1.getPopulation() - city2.getPopulation();
    }

}