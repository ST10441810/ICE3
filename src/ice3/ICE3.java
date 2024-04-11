//ST10441810

package ice3;

import javax.swing.JOptionPane;

public class ICE3 {
    public static void main(String[] args) {
        
        String parentheses = JOptionPane.showInputDialog("Enter a sequence of parentheses");
        isValid(parentheses);
        odd_squares_sum();
        int inputNumA = Integer.parseInt(JOptionPane.showInputDialog("Enter number: a"));
        int inputNumB = Integer.parseInt(JOptionPane.showInputDialog("Enter number: b"));
        greatest_common_divisor(inputNumA, inputNumB);
        
    }//End of main
    
    public static void isValid (String s){
        StringBuilder stringBuilder = new StringBuilder();
        boolean balanced = true;
        
        if (s == null || s.isEmpty()){
            balanced = false;
        }
        
        for (char ch : s.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '['){
                stringBuilder.append(ch);
            } else if (ch == ')' || ch == '}' || ch == ']'){
                if (stringBuilder.length() == 0){
                    balanced = false;
                    break;
                }
                char top = stringBuilder.charAt(stringBuilder.length() - 1);
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')){
                    balanced = false;
                    break;
                }
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
        }
        if (balanced && stringBuilder.length() == 0){
            System.out.println("The sequence is valid");
        } else {
            System.out.println("The sequence is invalid");
        }
    }
    
    public static void odd_squares_sum (){
        int count = 0;
        int sum = 0;
        int number = 1;
        
        while (count < 8){
            if (number % 2 != 0){
                sum = sum + (number * number);
                count++;
            }
            number++;
        }
        System.out.println("The sum of the square of the odd numbers is: " + sum);
    }
    public static void greatest_common_divisor (int numA, int numB){
        while (numB != 0){
            int temp = numB;
            numB = numA % numB;
            numA = temp;
        }
        System.out.println("The greatest common divisor is: " + numA);
    }
}//End of class