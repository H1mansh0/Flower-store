package flower.store.filters;

import flower.store.Item;

interface SearchFilter {
    boolean match(Item item);
}
