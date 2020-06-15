import java.util.List;

/**
 * @author Julia Schleien
 * @version 1.0
 * @category Interface
 * @since 05/06/2020 - 16:20
 */
public interface BankArrayInterface {

    void create(Supermarket supermarket);

    List<Supermarket> search();

    List<Supermarket> filter(Supermarket supermarket, int filter);

    int checkQuantity();

    void deleteCollection();

    void delete(int index);

    void alter(int index, Supermarket supermarket);
}
