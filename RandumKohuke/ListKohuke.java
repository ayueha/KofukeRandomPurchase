package RandumKohuke;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;


public class ListKohuke extends RandumKohuke{

    public static ArrayList<KofukeProducts> chooseRandomKohuke() {

        //Initializing Kohuke List
        ArrayList<KofukeProducts> kohukeList = new ArrayList<>();

        //Initializing purchase list
        ArrayList<KofukeProducts> purchaseList = new ArrayList<>();

        //create random number
        Random randumNumbers = new Random();

        //Initializing budget per day
        double avarageMoney = budgetEuro / (double) budgetPeriod;


        kohukeList.add(0,new KofukeProducts("saaremaa","vanilla",0.39));
        kohukeList.add(1,new KofukeProducts("saaremaa","toffee",0.39));
        kohukeList.add(2,new KofukeProducts("saaremaa","lemon",0.39));
        kohukeList.add(3,new KofukeProducts("tere","blueberry",0.33));
        kohukeList.add(4,new KofukeProducts("tere","vanilla",0.33));
        kohukeList.add(5,new KofukeProducts("tere","mango",0.33));
        kohukeList.add(6,new KofukeProducts("aasa","blueberry",0.36));
        kohukeList.add(7,new KofukeProducts("aasa","vanilla",0.36));
        kohukeList.add(8,new KofukeProducts("aasa","chocolate",0.36));
        kohukeList.add(9,new KofukeProducts("rimi","vanilla",0.29));
        kohukeList.add(10,new KofukeProducts("rimi","chocolate",0.29));
        kohukeList.add(11,new KofukeProducts("rimi","chestnut",0.29));
        kohukeList.add(12,new KofukeProducts("Farmi","vanilla",0.42));
        kohukeList.add(13,new KofukeProducts("Farmi","strawberry",0.42));


        //day loop
        for (int i = 1; i <=budgetPeriod; i++) {
            //budget loop
            for (double k = 0.0; k < avarageMoney; ) {
                int productNo = randumNumbers.nextInt(13);
                purchaseList.add(kohukeList.get(productNo));
                k = k + kohukeList.get(productNo).price;;

            }
        }

        return purchaseList;
    }
}
