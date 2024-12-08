public class TemperatureConverter {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

System.out.println("Enter the temperature value:");

double temperature scanner.nextDouble();

System.out.println("Enter 'C' for Celsius to Fahrenheit conversion or 'F' for Fahrenheit to Celsius.

conversion:");

char choice = scanner.next().charAt(0);

double convertedTemperature;

switch (choice) (

case 'C'

converted Temperature (temperature 9/5)+32;

System.out.println(temperature+" degrees Celsius is equal to converted Temperature+" degrees Fahrenheit.");

break; case 'F':

convertedTemperature = (temperature 32) 5/9;

System.out.println(temperature+" degrees Fahrenheit is equal to "+

convertedTemperature" degrees Celsius.");

break;

default:

System.out.println("Invalid choice. Please enter 'C' or 'F'.");

scanner.close();

}