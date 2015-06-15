public class Item {
    private String name;
    private double cost;
    private boolean taxable;
    private boolean imported;

    public Item(String name, double cost, boolean taxable, boolean imported) {
        this.name = name;
        this.cost = cost;
        this.imported = imported;
        this.taxable = taxable;
    }

    public boolean isTaxable() {
        return taxable;
    }

    public boolean isImported() {
        return imported;
    }

    @Override
    public String toString() {
        return "" + name + " " + cost;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Item) {
            Item temp = (Item) o;
            return this.name.equals(temp.name);
        }
        return false;
    }
}
