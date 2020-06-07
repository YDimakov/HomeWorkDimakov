package HomeWork6_2.Converter;

import HomeWork6_2.ConversionDegree;

public class Celsius implements ConversionDegree {

    @Override
    public void transfer(double a) {
        a += 273.15;
        System.out.println(a + "K");
    }
}
