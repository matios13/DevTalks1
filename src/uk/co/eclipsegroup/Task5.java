package uk.co.eclipsegroup;

public class Task5 {
    public static void main(String[] args) {
        for (Beer beer : Bar.beers) {
            if (beer.getPrice() < 2) {
                System.out.println(beer);
            }
        }
    }
}
