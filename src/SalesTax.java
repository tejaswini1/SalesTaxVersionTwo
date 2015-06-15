import java.util.HashMap;

public class SalesTax {

    private HashMap<Item, Double> itemsWithImportedCostAdded;
    private double salesTax = 0.1;
    public SalesTax (HashMap<Item, Double> itemsWithImportedCostAdded){

        this.itemsWithImportedCostAdded = itemsWithImportedCostAdded;
    }

    public void calculate(){
        for(Item item : itemsWithImportedCostAdded.keySet()){
            double cost = 0.0;
            if(item.isTaxable())
            {
                cost = salesTax * itemsWithImportedCostAdded.get(item) + itemsWithImportedCostAdded.get(item);
                itemsWithImportedCostAdded.put(item,cost);
            }

        }
    }

    public String toString(){
        String temp = "";
        for(Item item : itemsWithImportedCostAdded.keySet() )
            temp +=  item.toString() + " " + itemsWithImportedCostAdded.get(item) + "\n";
        return temp;
    }
}
