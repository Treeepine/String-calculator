public class Calculation {
    String answer;
    String operand01;
    String operator = new String();
    String sum1;




    String summarize(String operand02) {
        answer = operand01 + operand02;
        return answer;
    }

    String substract(String operand02) {
        answer = operand01.replaceFirst(operand02, "");
        return answer;
    }

    String multiply(String operand02) {
        int n = Integer.parseInt(operand02);
        answer = operand01;
        for (int i = 1; i < n; i++) {
            answer += operand01;
            int answerCheck = answer.length();
            if (answerCheck > 40){
                answer = answer.substring(0, 40);
                answer = answer + "...";
            }
        }
        return answer;
    }

    String divide(String operand02) {
        int a = operand01.length();
        int b = Integer.parseInt(operand02);

        int c = a / b;
        answer = operand01.substring(0, c);
        return answer;
    }
}
