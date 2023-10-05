package flower.store.filters;

import flower.store.Item;

public interface SearchFilter {
    public boolean match(Item item);
}
