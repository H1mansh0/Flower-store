package flower.store;

import java.util.ArrayList;
import java.util.List;

import flower.store.filters.SearchFilter;

public class Store{
    private List<Item> items;

    public List<Item> search(SearchFilter filter) {
        List<Item> foundedItems = new ArrayList<>();

        for (Item item: items) {
            if (filter.match(item)) {
                foundedItems.add(item);
            } 
        }
        return null;
    }
}
