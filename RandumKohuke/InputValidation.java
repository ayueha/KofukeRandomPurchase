package RandumKohuke;

import java.util.ArrayList;

public class InputValidation {

    public static boolean validationExecution(String answer){
        //Initializing bool status
        Boolean result =false;

        //if user push neither y nor n, set result on false.
        //if user push either y or n ,set result on true.
        if (answer.equals("y") | answer.equals("n")){
            result=true;
        }
        return result;
    }

    public static boolean validationBudgetDate(double budgetEuro, Integer budgetPeriod){
        //Initializing bool status
        Boolean result = false;

        //if the budget per day under the 0.4euro, prompt the message and return false
        if (budgetEuro/budgetPeriod<0.4){
            System.out.println("Budget and duration is under the level of purchase");
            result = false;
        }else {
            result=true;
        }
        return result;
    }


}
