// Exam: 2255 GCIS 124, Mid Term Exam #3, Question 1
// Filename: Converter.java (inside tempconvert package)

package mte3.tempconvert;
import java.util.Scanner;

public class Converter {
    
    private static class CelsiusToFahrenheit implements TempConvert {

        @Override
        public double convert(double temp) {    return temp * 9.0 / 5.0 + 32;    }
        
    } // CelciusToFahrenheit closed

    /*
    what I need to do... SO when given a number from scanner
    run that number through all conversions to get a converted number/
    just think of it as running it through equations

    use an anonymous class that converts from F to C and
    prints the temp

    use a lambda to conver from F to K and print temp

    output should look like... Entered temp: 47, C to F: 116.6, 
    F to C: 8.333, F to K: 281.483
    */

    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter temperature (for conversion): ");

            double temp = scanner.nextDouble();
            // (part 1) conversion from C to F
            // equation = C * (9/5) + 32
            // anon

            private static class CelsiusToFahrenheit implements TempConvert {
                private double CelciusToFahrenheit(){
                    @Override
                    public double convert(double temp){return temp * 9/5 + 32;;
                }
            }

            
            
            // (part 2) conversion from F to C
            // equation = (F-32) * (5/9)
           
            
            
            // (part 3) conversion from F to K
            // (F - 32) * (5/9) + 273.15
            //Lambda
            Thread t = new Thread(() -> {

                double k = ((temp - 32) * 5  /9 + 273.15);
                System.out.println("F to K: "+ k);
                } );

            t.run();


        }  // try { } block closed

    } // main () method closed

} // Converter { } class closed