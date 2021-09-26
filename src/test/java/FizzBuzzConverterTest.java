import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzConverterTest {

    private FizzBuzzConverter fizzBuzzConverter;

    @BeforeEach
    void init(){
        fizzBuzzConverter = new FizzBuzzConverter();
    }

    @Test
    public void multipleOfThree(){
        assertEquals("Fizz", fizzBuzzConverter.convert(3));
        assertEquals("Fizz", fizzBuzzConverter.convert(33));
    }

    @Test
    public void multipleOfFive(){
        assertEquals("Buzz", fizzBuzzConverter.convert(5));
        assertEquals("Buzz", fizzBuzzConverter.convert(55));
    }

    @Test
    public void multipleOfThreeAndFive(){
        assertEquals("FizzBuzz", fizzBuzzConverter.convert(15));
        assertEquals("FizzBuzz", fizzBuzzConverter.convert(30));
    }

    @Test
    public void notAMultipleOfThreeOrFive(){
        assertEquals("1", fizzBuzzConverter.convert(1));
        assertEquals("2", fizzBuzzConverter.convert(2));

    }

    @Test
    public void hasThreeInTheNumber(){
        assertEquals("Fizz", fizzBuzzConverter.convert(13));
    }

    @Test
    public void hasFiveInTheNumber(){
        assertEquals("FizzBuzz", fizzBuzzConverter.convert(54));
        assertEquals("Buzz", fizzBuzzConverter.convert(52));
    }
}