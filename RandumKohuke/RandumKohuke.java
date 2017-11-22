package RandumKohuke;
import java.util.ArrayList;

public class RandumKohuke {

    public static void main (String[] args){
        //initialize imformation variable
        double budgetEuro = 0.0;
        int budgetPeriod =0;
        boolean validationFlg= false;

        //Initial Entry of budget and days
        System.out.println("Welcome to Random Kohuke Purchase System \n\nPlease enter your Budget in Euro");
        budgetEuro = TextIO.getlnDouble();

        System.out.println("Please enter days of the budget");
        budgetPeriod = TextIO.getlnInt();

        while(!validationFlg){
        //days and budget validation
            validationFlg=InputValidation.validationBudgetDate(budgetEuro, budgetPeriod);

            if (validationFlg==true){
                break;
            }else {
                System.out.println("Please reenter your Budget in Euro");
                budgetEuro = TextIO.getDouble();

                System.out.println("Please reenter period of the budget");
                budgetPeriod = TextIO.getInt();
            }

        }
        //confirm information
        System.out.println( "Your information are ...\n"+"Budget:"+ budgetEuro +" EURO \nPeriod:"+budgetPeriod+" days");
        System.out.println("Create your plan [y or n] ?");
        String answer = TextIO.getlnString();


        //Initializing validation flg again and validation the answer
        validationFlg=false;
        while(!validationFlg){
            validationFlg=InputValidation.validationExecution(answer);
            if (validationFlg==true){
                break;
            }else{
                System.out.println("Please enter y[Yes] or n[No]");
                answer=TextIO.getlnString();
            }
        }

        if (answer.equals("y")) {
            //Start Calculation
            System.out.println("=====Following list is for your purchasing schedule=====");
            System.out.println(" Budget    :  " + budgetEuro + " EURO   Duration    :  " +budgetPeriod +" days");
            System.out.println("========================================================");
            for(KofukeProducts kohuke:ListKohuke.chooseRandomKohuke(budgetEuro,budgetPeriod)){
                System.out.println("Brand:"+kohuke.brand +"   Flavor: "+ kohuke.flavor +"   Price: "+ kohuke.price);
            }


        }else{
            //End Calculation
            System.out.println("User ended program as option with No");
        }

    }






}
