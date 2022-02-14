package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {
    double price;

    public Dodgems(String name, int rating) {
        super(name, rating);
        this.price = 4.50;
    }


    @Override
    public double defaultPrice() {
        return this.price;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return this.price;
    }

    @Override
    public double price(Visitor visitor) {
        if (visitor.checkAgeIfTwelve(visitor)) {
            return this.price;
        }
        return this.price / 2;
    }
}
