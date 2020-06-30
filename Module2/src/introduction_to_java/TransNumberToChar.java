package introduction_to_java;


import java.util.Scanner;

public class TransNumberToChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int inputNumber = scanner.nextInt();
        String outputString = "";
        String outputTens = "";
        String outputUnits = "";
        String outputStringFinal = "";
        if (inputNumber > 0 || inputNumber <= 1000) {
            if (inputNumber < 10) {
                switch (inputNumber) {
                    case 0:
                        outputString += "zero";
                        break;
                    case 1:
                        outputString += "one";
                        break;
                    case 2:
                        outputString += "two";
                        break;
                    case 3:
                        outputString += "three";
                        break;
                    case 4:
                        outputString += "four";
                        break;
                    case 5:
                        outputString += "five";
                        break;
                    case 6:
                        outputString += "six";
                        break;
                    case 7:
                        outputString += "seven";
                        break;
                    case 8:
                        outputString += "eight";
                        break;
                    case 9:
                        outputString += "nine";
                        break;
                    default:
                        outputString += "Nhập sai";
                        break;
                }
                System.out.println(outputString);
            } else if (inputNumber < 20) {
                switch (inputNumber - 10) {
                    case 1:
                        outputString += "eleven";
                        break;
                    case 2:
                        outputString += "twelve";
                        break;
                    case 3:
                        outputString += "thirteen";
                        break;
                    case 4:
                        outputString += "fourteen";
                        break;
                    case 5:
                        outputString += "fifteen";
                        break;
                    case 6:
                        outputString += "sixteen";
                        break;
                    case 7:
                        outputString += "seventeen";
                        break;
                    case 8:
                        outputString += "eighteen";
                        break;
                    case 9:
                        outputString += "nineteen";
                        break;
                }
                System.out.println(outputString);

            } else if (inputNumber < 100) {
                switch (inputNumber / 10) {
                    case 2:
                        outputString += "twenty ";
                        break;
                    case 3:
                        outputString += "thirty ";
                        break;
                    case 4:
                        outputString += "forty ";
                        break;
                    case 5:
                        outputString += "fifty ";
                        break;
                    case 6:
                        outputString += "sixty ";
                        break;
                    case 7:
                        outputString += "seventy ";
                        break;
                    case 8:
                        outputString += "eighty ";
                        break;
                    case 9:
                        outputString += "ninety ";
                        break;
                }
                if ((inputNumber % 10) > 0) {
                    switch (inputNumber % 10) {
                        case 1:
                            outputString += "one";
                            break;
                        case 2:
                            outputString += "two";
                            break;
                        case 3:
                            outputString += "three";
                            break;
                        case 4:
                            outputString += "four";
                            break;
                        case 5:
                            outputString += "five";
                            break;
                        case 6:
                            outputString += "six";
                            break;
                        case 7:
                            outputString += "seven";
                            break;
                        case 8:
                            outputString += "eight";
                            break;
                        case 9:
                            outputString += "nine";
                            break;
                    }
                }
                System.out.println(outputString);
            } else if (inputNumber < 1000) {
                switch (inputNumber / 100) {
                    case 1:
                        outputString += "one-hundred ";
                        break;
                    case 2:
                        outputString += "two-hundred ";
                        break;
                    case 3:
                        outputString += "three-hundred ";
                        break;
                    case 4:
                        outputString += "four-hundred ";
                        break;
                    case 5:
                        outputString += "five-hundred ";
                        break;
                    case 6:
                        outputString += "six-hundred ";
                        break;
                    case 7:
                        outputString += "seven-hundred ";
                        break;
                    case 8:
                        outputString += "eight-hundred ";
                        break;
                    case 9:
                        outputString += "nine-hundred ";
                        break;
                }
                int inputNumberDivTen = inputNumber % 100;
                if (inputNumberDivTen == 0) {
                    System.out.println(outputString);
                } else {
                    if (inputNumberDivTen >= 20 || inputNumberDivTen <= 10) {
                        switch (inputNumberDivTen / 10) {
                            case 2:
                                outputTens += "twenty";
                                break;
                            case 3:
                                outputTens += "thirty";
                                break;
                            case 4:
                                outputTens += "forty";
                                break;
                            case 5:
                                outputTens += "fifty";
                                break;
                            case 6:
                                outputTens += "sixty";
                                break;
                            case 7:
                                outputTens += "seventy";
                                break;
                            case 8:
                                outputTens += "eighty";
                                break;
                            case 9:
                                outputTens += "ninety";
                                break;
                        }
                        int inputNumberDivOneHundred = inputNumberDivTen % 10;
                        switch (inputNumberDivOneHundred) {
                            case 1:
                                outputUnits += "one";
                                break;
                            case 2:
                                outputUnits += "two";
                                break;
                            case 3:
                                outputUnits += "three";
                                break;
                            case 4:
                                outputUnits += "four";
                                break;
                            case 5:
                                outputUnits += "five";
                                break;
                            case 6:
                                outputUnits += "six";
                                break;
                            case 7:
                                outputUnits += "seven";
                                break;
                            case 8:
                                outputUnits += "eight";
                                break;
                            case 9:
                                outputUnits += "nine";
                                break;
                            default:
                                break;
                        }
                    } else {
                        switch (inputNumberDivTen) {
                            case 11:
                                outputUnits += "eleven";
                                break;
                            case 12:
                                outputUnits += "twelve";
                                break;
                            case 13:
                                outputUnits += "thirteen";
                                break;
                            case 14:
                                outputUnits += "fourteen";
                                break;
                            case 15:
                                outputUnits += "fifteen";
                                break;
                            case 16:
                                outputUnits += "sixteen";
                                break;
                            case 17:
                                outputUnits += "seventeen";
                                break;
                            case 18:
                                outputUnits += "eighteen";
                                break;
                            case 19:
                                outputUnits += "nineteen";
                                break;
                        }
                    }
                    outputStringFinal = outputString + "and " + outputTens + outputUnits;
                    System.out.println(outputStringFinal);
                }
            }
        }
        else {
            System.out.println("Nhập sai");
        }
    }
}