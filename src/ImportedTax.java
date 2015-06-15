import java.util.ArrayList;
import java.util.HashMap;

public class ImportedTax {

    HashMap<Item, Double> items = new HashMap<Item, Double>();
    ArrayList<Item> rawItems = new ArrayList<Item>();
    private double importTax = 0.05;


    public ImportedTax(ArrayList<Item> itemsList){
        rawItems = itemsList;
    }
    public void calculate(){
        for(Item item : rawItems){
            if(item.isImported())
            {
                double cost = calculateForOneItem(item);
                items.put(item, cost);
            }
            else {

                items.put(item, item.getCost());}
        }
    }

    private double calculateForOneItem(Item item) {
        double cost = item.getCost();

        cost += cost * importTax;

        return cost;
    }

    public String toString(){
        String temp = "";
        for(Item item : items.keySet())
        {
            temp += item.toString() + " " + items.get(item) + "\n";
        }

        return temp;
    }
}
