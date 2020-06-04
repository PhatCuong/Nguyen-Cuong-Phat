package builder;

import feature.Buyer;
import feature.Owner;
import feature.Station;
import type.Booking;
import type.BykeBooking;

public class BykeBuilder implements Builder {
    private Owner owner;
    private Buyer buyer;
    private Station station;

    @Override
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    @Override
    public Booking getProduct() {
        return new BykeBooking(owner, buyer, station);
    }
}
