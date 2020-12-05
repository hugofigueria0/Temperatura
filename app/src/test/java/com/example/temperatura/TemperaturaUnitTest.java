package com.example.temperatura;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TemperaturaUnitTest {
    @Test
    public void convCelsiusFahrenheit_isCorrect() {
        TemperaturaCelsius t = new TemperaturaCelsius(23.0);
        double f = t.GetFahrenheit();


        assertEquals(73.4, f, 0.001);
        assertEquals(23.0, t.GetCelsius(), 0.001);

        t = new TemperaturaCelsius(5);
        f = t.GetFahrenheit();

        assertEquals(41.0, t.GetFahrenheit(), 0.001);
        assertEquals(5.0, t.GetCelsius(), 0.001);
    }
    @Test
    public void convFahrenheitCeldius_isCorrect(){
        TemperaturaFahrenheit t = new TemperaturaFahrenheit(90.0);
        double f = t.GetFahrenheit();


        assertEquals(90.0, f, 0.001);
        assertEquals(32.222, t.GetCelsius(), 0.001);

        t = new TemperaturaFahrenheit(60.0);


        assertEquals(60.0, t.GetFahrenheit(), 0.001);
        assertEquals(15.5556, t.GetCelsius(), 0.001);
    }
}