package nl.kinokiru.java.models;

public class Arrow {
    private Color color;
    private Place place;

    public Arrow(Color color, Place place) {
        this.color = color;
        this.place = place;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

}
