package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed {

    private double price;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.40;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.checkAgeIfTwelve(visitor) && visitor.checkHeightOfVisitor(visitor);
    }


    public double price(Visitor visitor) {
        if(visitor.checkVisitorHeightAboveTwohundred()){
            return this.price * 2;
        }
        return this.price;
    }


}
