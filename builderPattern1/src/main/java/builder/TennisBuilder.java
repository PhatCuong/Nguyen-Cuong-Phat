package builder;

import feature.Buyer;
import feature.Court;
import feature.Owner;
import type.Booking;
import type.TennisBooking;

public class TennisBuilder implements Builder {
    private Owner owner;
    private Buyer buyer;
    private Court court;

    @Override
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public void setCourt(Court court) {
        this.court = court;
    }

    @Override
    public Booking getProduct() {
        return new TennisBooking(owner, buyer, court);
    }
}
