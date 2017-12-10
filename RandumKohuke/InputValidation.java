package RandumKohuke;

public class InputValidation extends RandumKohuke{
    /*
    Check budget and duration.
    if the result of budgetEuro/budgetperiod is under the most expensive kohuke,
    return the false to input new value.
    */

    private static int j;


    public boolean checkValidBudget() {

        while(showResult()==false){
            System.out.println("Budget and duration is under the level of purchase");
            System.out.println("Please reenter your Budget in Euro");
            budgetEuro = TextIO.getDouble();

            System.out.println("Please reenter period of the budget");
            budgetPeriod = TextIO.getInt();
        }

        return true;

    }


    private boolean showResult(){
        if(budgetEuro/budgetPeriod<0.42){
            return false;
        }else{
           return true;
        }
    }

    /*     Check the execution letter */
    public static boolean validationExecution(){
        while(showLetter()==false){
            System.out.println("Please enter y[Yes] or n[No]");
            answer=TextIO.getlnString();
        }
        return true;
    }


    private static boolean showLetter(){
        if (answer.equals("y") | answer.equals("n")){
            return true;
        }else{
            return false;
        }
    }


}
