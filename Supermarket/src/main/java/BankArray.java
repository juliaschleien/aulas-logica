import java.util.ArrayList;
import java.util.List;

/**
 * @author Julia Schleien
 * @version 1.0
 * @since 05/06/2020 - 17:00
 */
public class BankArray implements BankArrayInterface {

    private List<Supermarket> collection;

    public int i = 0;

    public int getI() {
        return i;
    }

    public BankArray() {
        collection = new ArrayList<>();
    }

    @Override
    public void create(Supermarket supermarket) {
        this.collection.add(supermarket);
    }

    @Override
    public List<Supermarket> search() {
        return this.collection;
    }

    @Override
    public List<Supermarket> filter(Supermarket supermarket, int filter) {
        List<Supermarket> superFilter = new ArrayList<>();
        switch (filter) {
            case 1: //product
                for (Supermarket supermarket1 : this.collection) {
                    i++;
                    if (supermarket1.getProducts().contains(supermarket.getProducts())) {
                        superFilter.add(supermarket1);
                    }
                }
                return superFilter;
            case 2: //session
                for (Supermarket supermarket1 : this.collection) {
                    if (supermarket1.getSession().contains(supermarket.getSession())) {
                        superFilter.add(supermarket1);
                    }
                }
                return superFilter;
            case 3: //quantity
                for (Supermarket supermarket1 : this.collection) {
                    if (supermarket1.getQuantity() == supermarket.getQuantity()) {
                        superFilter.add(supermarket1);
                    }
                }
                return superFilter;
            case 4: //value
                for (Supermarket supermarket1 : this.collection) {
                    if (supermarket1.getValue() == supermarket.getValue()) {
                        superFilter.add(supermarket1);
                    }
                }
                return superFilter;
            default:
                return null;
        }
    }

    @Override
    public int checkQuantity() {
        return this.collection.size();
    }

    @Override
    public void deleteCollection() {
        this.collection.clear();
    }

    @Override
    public void delete(int index) {
        this.collection.remove(index);
    }

    @Override
    public void alter(int index, Supermarket supermarket) {
        this.collection.add(index, supermarket);

    }
}