import java.util.ArrayList;

public class Items {

    ArrayList<Item> items = new ArrayList<Item>();

    public Items(ArrayList<Item> items){
        this.items = items;
    }

    public boolean isAvailable(Item item){
        for(Item temp : items){
            if(item.equals(temp))
                return true;
        }
        return false;
    }
}
