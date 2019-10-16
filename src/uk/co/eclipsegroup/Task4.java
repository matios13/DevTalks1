package uk.co.eclipsegroup;

import java.util.OptionalDouble;


public class Task4 {
    public static void main(String[] args) {
        Double sum = 0d;
        for (Beer beer : Bar.beers) {
            sum += beer.getPrice();
        }
        Double avg = sum / Bar.beers.size();
        System.out.println(avg);
        OptionalDouble avg2 = Bar.beers.stream().mapToDouble(Beer::getPrice).average();
        System.out.println(avg2);
    }
}
