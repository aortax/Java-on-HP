public class convertTemperature {
    /*
    You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.
    You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].
    Return the array ans. Answers within 10-5 of the actual answer will be accepted.
    
    Note that:
    
    Kelvin = Celsius + 273.15
    Fahrenheit = Celsius * 1.80 + 32.00
    
    Example 1:
    
    Input: celsius = 36.50
    Output: [309.65000,97.70000]
    Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65 and converted in Fahrenheit is 97.70.
    
    Example 2:
    
    Input: celsius = 122.11
    Output: [395.26000,251.79800]
    Explanation: Temperature at 122.11 Celsius converted in Kelvin is 395.26 and converted in Fahrenheit is 251.798.
    
    Constraints:
    
    0 <= celsius <= 1000
     */
    public static void main(String[] args) {

    }
    // Method where we actively round the number
    // public static double[] convertTemperature(double celsius) {
    //     double fahrenheit = celsius * 1.80 + 32;
    //     double kelvin = celsius + 273.15;
    //     fahrenheit = fahrenheit*(Math.pow(10,5) / Math.pow(10,5));
    //     kelvin = kelvin*(Math.pow(10,5)) / Math.pow(10, 5);
    //     double[] arr = {kelvin , fahrenheit};
    //     return arr;
    // }

    public double[] convertTemperature(double celsius) {
        double[] arr = new double[2];
        arr[0] = 273.15 + celsius;
        arr[1] = 1.8 * celsius + 32;
        return arr;
    }

}
