package be.vdab.theorie;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class ConverterTest {
    @Test
    void eenInchIs2Komma54Centimeters() {
        assertThat(new Converter().inchesNaarCentimeters(BigDecimal.ONE))
                .isEqualByComparingTo("2.54");
    }

    @Test
    void tweehonderdInchesIs508Centimeters() {
        assertThat(new Converter().inchesNaarCentimeters(BigDecimal.valueOf(200)))
                .isEqualByComparingTo("508");
    }
}