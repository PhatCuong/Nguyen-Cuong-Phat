package builder;

import feature.Buyer;
import feature.Owner;
import type.Booking;

public interface Builder {
    void setOwner(Owner owner);
    void setBuyer(Buyer buyer);
    Booking getProduct();
}
