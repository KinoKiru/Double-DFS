package nl.kinokiru.java.models;

import java.util.ArrayList;

public class Place {
    private int number;
    private Color color;
    private Arrow[] arrows;

    // #region get/set

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Arrow[] getArrows() {
        return arrows;
    }

    public void setArrows(Arrow[] arrows) {
        this.arrows = arrows;
    }

    // #endregion
    public Place(int number, Color color, Arrow... neighbors) {
        this.number = number;
        this.color = color;
        this.arrows = neighbors;
    }

    @Override
    public String toString() {
        return this.number + "";
    }

    /**
     *
     * @param otherPawn -> can check if the arrows of the current pawn is same as
     *                  other pawn color
     * @return the possible places the pawn can go to
     */
    public ArrayList<Place> getPlaces(Place otherPawn) {
        ArrayList<Place> places = new ArrayList<>();
        for (Arrow arrow : this.arrows) {
            if (arrow.getColor().equals(otherPawn.color)) {
                places.add(arrow.getPlace());
            }
        }
        return places;
    }

    /**
     *
     * @param otherPawn -> can check if the arrows of the current pawn is same as
     *                  other pawn color
     * @return the possible arrows the pawn can go to
     */
    public ArrayList<Arrow> getPossibleArrows(Place otherPawn) {
        ArrayList<Arrow> arrows = new ArrayList<>();
        for (Arrow arrow : this.arrows) {
            if (arrow.getColor().equals(otherPawn.color)) {
                arrows.add(arrow);
            }
        }
        return arrows;
    }

}