public class FizzBuzzConverter {

    public String convert(int numberToConvert) {
        String fizzBuzz = "";
        if(numberToConvert % 3 == 0 || String.valueOf(numberToConvert).contains("3")) fizzBuzz += "Fizz";
        if(numberToConvert % 5 == 0 || String.valueOf(numberToConvert).contains("5")) fizzBuzz += "Buzz";
        if(fizzBuzz.equals("")) fizzBuzz = String.valueOf(numberToConvert);
        return fizzBuzz;
    }
}
