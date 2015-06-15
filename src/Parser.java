import org.mockito.asm.tree.analysis.Value;

public class Parser {

    public Item parse(String input){
        String[] temp = input.split(" ");
        String name = temp[temp.length - 3];
        double cost = Double.parseDouble(temp[temp.length - 1]);

        if(input.contains("imported")){

            return new Item(name, cost, isTaxable(name), Values.IMPORTED);}

        else {

            return new Item(name, cost, isTaxable(name), Values.NON_IMPORTED);}
    }

    private boolean isTaxable(String name) {

        if(name.equals("CD") || name.equals("perfume"))
            return false;
        return true;
    }
}
