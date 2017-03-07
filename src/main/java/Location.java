package main.java;

import javafx.scene.shape.Circle;

import java.util.ArrayList;

/**
 * Creates a stop for the track.
 */
public class Location extends Circle {

    /** The name identifying the location */
    private String name;


    /** Stores the cars present at a location. Thought to be needed for future improvements */
    private ArrayList<Car> cars;


    /**
     * Keeps track within the running loop of each turn whether
     * a location has been clicked
     * a location can be clicked (active)
     */
    private boolean clicked, active;

    /**
      * @param x The x coordinate of the location
     * @param y The y coordinate of the location
     * @param offset The width and height of the location
     * @param name THe name identifier of the location
     */
    public Location(double x, double y, double offset, String name) { //, Map<Location, Integer> neighbors) {
    }


    /**
     * @return the name of the location
     */
    public String getName() { return name; }


    /**
     * @param car The car to be added as present. Useful for future growth and debugging
     */
    public void addCar(Car car) {
    }


    /**
     * @return True if the location can be selected, otherwise false
     */
    public boolean isActive() {
    }


    /**
     * @return True if the location has been clicked, otherwise false
     */
    public boolean getClicked() {
    }


    /**
     * @param in The value for "clicked" to be changed to.
     */
    public void setClicked(boolean in) {
    }


    /**
     * @param in The value for "active" to be changed to.
     * @param orange True if the location to be set is the end location for a car.
     */
    public void setActive(boolean in, boolean orange) {
    }

    /**
     * Computes the distance on demand from "this" location to,
     * @param location The location to compute distance to
     * @return the hypotenuse of the difference of x and y values.
     */
    public double getDistanceToLocation(Location location) {
    }

    @Override
    public String toString() {
    }

}
