import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        String ex1 = "Т.к. нарушено условие: первым аргументом должна быть строка";
        String ex2 = "Неподдерживаемое значение";
        String ex3 = "Несоотвествующая арифметическая операция";

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] elements = str.split("\"");
        String operand1;
        String operand2;
        String operator;
        Quotes qAnswer = new Quotes();

        if (elements[0].length() != 0){
            throw new ArrayIndexOutOfBoundsException(ex1);
        }
        if (elements[1].length() > 10){
            throw new Exception(ex2);
        }
        if (elements.length == 3) {
            String operand22 = elements[2].substring(3);
            int m = Integer.parseInt(operand22);
            if (m > 10 || m < 1) {
                throw new Exception(ex2);
            }
        }
        if (elements.length == 4 && elements[3].length() > 10){
            throw new Exception(ex2);
        }
        if ((elements[2].equals(" * ") || elements[2].equals(" / ") && elements.length == 4)) {
            throw new Exception(ex3);
        }
        if (elements.length < 4 && (elements[2].substring(0,3).equals(" * ") || elements[2].substring(0,3).equals(" / "))){
            operator = elements[2].substring(0,3);
            operand2 = elements[2].substring(3);
            operand1 = elements[1];
            Calculation answer = new Calculation();
            answer.operand01 = operand1;


            if (operator.equals(" * ")){
                System.out.println(qAnswer.addQ(answer.multiply(operand2)));
            }
            if (operator.equals(" / ")){
                System.out.println(qAnswer.addQ(answer.divide(operand2)));
            }
        }
        if (elements[2].substring(0,3).equals(" + ") || elements[2].substring(0,3).equals(" - ")){
            operator = elements[2];
            operand1 = elements[1];
            operand2 = elements[3];
            Calculation answer = new Calculation();
            answer.operand01 = operand1;
            if (operator.equals(" + ")){
                System.out.println(qAnswer.addQ(answer.summarize(operand2)));
            }
            if (operator.equals(" - ")) {
                System.out.println(qAnswer.addQ(answer.substract(operand2)));
            }
        }

        else {
            throw new Exception(ex3);
        }




    }
}
