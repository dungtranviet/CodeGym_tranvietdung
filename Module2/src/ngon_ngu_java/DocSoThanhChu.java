package ngon_ngu_java;
import java.util.Scanner;
public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scanner.nextInt();
        int num1 = number / 100;
        int num2 = number % 100;
        int num3 = num2 % 10;
        num2 = num2 / 10;
        String str = "";
        int index = 1;
        while (index < 4) {
            int numberInProcess;
            String stringEnd;
            if (index == 3) {
                numberInProcess = num3;
                stringEnd="";
            } else {
                if (index == 2) {
                    numberInProcess = num2;
                    stringEnd="";
                } else {
                    numberInProcess = num1;
                    stringEnd=" hundred and ";
                }
            }

            switch (numberInProcess) {
                case 0:
                    if((index==3)&&(num1==0)&&(num2==0)){
                        str += "zero";
                    }
                    break;
                case 1:
                    if (index == 2) {
                        index=4;
                        break;
                    } else {
                        str += "one";
                    }
                    str+=stringEnd;
                    break;
                case 2:
                        if (index == 2) {
                            str += "twenty ";
                        } else {
                            str += "two";
                        }
                        str+=stringEnd;
                    break;
                case 3:
                        if (index == 2) {
                            str += "thirty ";
                        } else {
                            str += "three";
                        }
                        str+=stringEnd;
                    break;
                case 4:
                        if (index == 2) {
                            str += "forty ";
                        } else {
                            str += "four";
                        }
                    str+=stringEnd;
                    break;
                case 5:
                        if (index == 2) {
                            str += "fifty ";
                        } else {
                            str += "five";
                        }
                    str+=stringEnd;
                    break;
                case 6:
                        if (index == 2) {
                            str += "sixty ";
                        } else {
                            str += "six";
                        }
                    str+=stringEnd;
                    break;
                case 7:
                        if (index == 2) {
                            str += "seventy ";
                        } else {
                            str += "seven";
                        }
                    str+=stringEnd;
                    break;
                case 8:
                        if (index == 2) {
                            str += "eighty ";
                        } else {
                            str += "eight";
                        }
                    str+=stringEnd;
                    break;
                case 9:
                        if (index == 2) {
                            str += "ninety ";
                        } else {
                            str += "nine";
                        }
                    str+=stringEnd;
                    break;
            }
            index++;
        }
        if(num2==1){
            switch (num3){
                case 0:str+="Ten";
                break;
                case 1:str+="eleven";
                    break;
                case 2:str+="twelve";
                    break;
                case 3:str+="thirteen";
                    break;
                case 4:str+="fourteen";
                    break;
                case 5:str+="fifteen";
                    break;
                case 6:str+="sixteen";
                    break;
                case 7:str+="seventeen";
                    break;
                case 8:str+="eighteen";
                    break;
                case 9:str+="nineteen";
                    break;

            }
        }
        System.out.println(str);
    }
}
