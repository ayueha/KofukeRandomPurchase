package RandumKohuke;

import java.util.ArrayList;

public class KofukeProducts {
    String brand;
    String flavor;
    Double price;


    public KofukeProducts(String brand, String flavor, Double price) {
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
    }

    @Override
    public String toString(){
        return brand + " : "+ flavor +" : " + price ;
    }

}
