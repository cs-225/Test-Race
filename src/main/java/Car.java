package main.java;

import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

/**
 * Creates a model for the representation of a car.
 */
public class Car extends Rectangle {


    /** Components of a car. Contribute to time */
    private int engine, suspension, boost, weight;

    /* Speed boost */
    private boolean isBoosted;


    /** The total time the car has driven for. Proportional to the distance traveled and components. */
    private double time;


    /** Reference to the locations a particular car has visited. */
    private ArrayList<Location> stops;


    /** Reference to locations. */
    private Location start, end, currentLocation;


    /** Reference to the turn order and identification. */
    private int id;

    /** Represents the cars activity. */
    private boolean isFinished;

    /**
     * Creates a car with,
     * @param x The location in the x direction
     * @param y The location in the y direction
     * @param offset The sizing offset of the car
     * @param start The start location
     * @param end The end location
     * @param id The identification of the car/user order/identification.
     */
    public Car(double x, double y, double offset, Location start, Location end, int id) {
    }

    /**
     * @return The end locatino
     */
    public Location getEnd() {
    }

    /**
     * @return The start location
     */
    public Location getStart() {
    }

    /**
     * @return The total time the car has traveled over.
     */
    public double getTime() {
    }

    /**
     * @return The current location
     */
    public Location getCurrentLocation() {
    }

    /**
     * @return The car's identification.
     */
    public int getIdentifier() {
        return id;
    }

    /**
     * Checks to see if the car has visited a specific location.
     * @param location The specified location.
     * @return True if visited, false otherwise.
     */
    public boolean getVisited(Location location) {
    }

    /**
     * Checks to see if the car has visited every stop except the "end" stop.
     * @param stop The number of locations.
     * @return True if the car has only the end location to visit before completion otherwise, false.
     */
    public boolean checkLast(int stop) {
        return stops.size() + 1 >= stop;
    }

    /* Reports if the car has finished the race. */
    public boolean isFinished() { return isFinished; }

    /**
     * Moves a car from one location to another.
     * Updates the time.
     * @param location The location to move to.
     */
    public void newLocation(Location location) {
    }

    /**
     * @return The textual representation of a car.
     */
    @Override
    public String toString() {
    }

}