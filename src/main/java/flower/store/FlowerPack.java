package flower.store;

import lombok.Getter;

@Getter 
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    double getPrice() {
        return this.flower.getPrice() * this.quantity;
    }

    private void setQuantity(int value) {
        this.quantity = value<1 ? 1: value; 
    }
}
