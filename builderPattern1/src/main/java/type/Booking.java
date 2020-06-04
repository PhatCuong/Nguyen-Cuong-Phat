package type;

import feature.Buyer;
import feature.Owner;
import feature.Type;

public abstract class Booking {
    private Type type;
    private Owner owner;
    private Buyer buyer;

    public Booking(Type type, Owner owner, Buyer buyer) {
        this.type = type;
        this.owner = owner;
        this.buyer = buyer;
    }

    public Type getType() {
        return type;
    }

    public Owner getOwner() {
        return owner;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public abstract void displayInfo();
}
