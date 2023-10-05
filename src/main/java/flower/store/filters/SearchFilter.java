package flower.store.filters;

import flower.store.Item;

interface SearchFilter {
    public boolean match(Item item);
}
