package RandumKohuke;

public class RandumKohuke {
    public static double budgetEuro = 0.0;
    public static int budgetPeriod = 0;
    public static String answer;

    public static void main(String[] args) {
        //initialize imformation variable
        InputValidation flg = new InputValidation();
        boolean validationFlg = false;


        //Initial Entry of budget and days
        System.out.println("Welcome to Random Kohuke Purchase System \n\nPlease enter your Budget in Euro");
        budgetEuro = TextIO.getlnDouble();
        System.out.println("Please enter days of the budget");
        budgetPeriod = TextIO.getlnInt();


        //validationFlg=false;
        while (validationFlg == false) {
            validationFlg = flg.checkValidBudget();
        }

        //confirm information
        System.out.println("Your information are ...\n" + "Budget:" + budgetEuro + " EURO \nPeriod:" + budgetPeriod + " days");
        System.out.println("Create your plan [y or n] ?");
        answer = TextIO.getlnString();
        validationFlg = false;
        //confirm user entry
        while (validationFlg == false) {
            validationFlg = flg.validationExecution();
        }

        if (answer.equals("y")) {
            //Start Calculation
            System.out.println("=====Following list is for your purchasing schedule=====");
            System.out.println(" Budget    :  " + budgetEuro + " EURO   Duration    :  " + budgetPeriod + " days");
            System.out.println("========================================================");
            for (KofukeProducts kohuke : ListKohuke.chooseRandomKohuke()) {
                System.out.println(kohuke);
            }

        } else {
            //End Calculation
            System.out.println("User ended program as option with No");
        }

    }

}
