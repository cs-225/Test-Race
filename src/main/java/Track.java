package main.java;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.Random;

/**
 * The track is the layer where the turn based sequence is controlled.
 * A group of graphical components, together creates the game aspect of the program
 */
public class Track extends Group {

    /** A reference to all of the locations */
    private ArrayList<Location> locations;

    /** Reference to all of the cars (proportional to the number of players) */
    private ArrayList<Car> cars;

    /** Keeps track of which cars turn it is. */
    private Car activeCar;

    /**
     * gridPane contains a grid-pane of cars, and one of locations
     * Contains the information about the active car's current location,
     * the distances from the active car's current location,
     * as well as the time that each player has driven.
     */
    private GridPane gridPane, gpCars, gpLocations;


    /** Initializes the collections for locations and cars. */
    public Track() {
    }

    /**
     * @param locations The collection of locations.
     * @param cars The collection of cars.
     * Useful for creating the class manually (i.e. debugging)
     * Currently unused.
     */
    public Track(ArrayList<Location> locations, ArrayList<Car> cars) {
    }

    /**
     * The way that the cars and locations are initialized. Takes in a number,
     * @param numPlayers The number of locations corresponds to combo-box selection from StartPrompt in View.
     * @param sceneX The width of the main Screen from View.
     * @param sceneY The height of the main Screen from View.
     */
    public void setTrack(int numPlayers, double sceneX, double sceneY) {
    }

    /**
     * Creates the locations in relation to how many players selected. Called in setTrack, separated for clarity.
     * @param numLocation Number of locations.
     * @param offset Relative sizing.
     * @param sceneX Scene's width.
     * @param sceneY Scene's Height.
     * @param rand Random number generator.
     */
    private void createLocations( int numLocation, double offset, double sceneX, double sceneY, Random rand) {
    }

    /**
     * Creates the cars. Called in setTrack, separated for clarity.
     * @param numPlayers The number of cars to be created in relation to the number of players
     * @param offset The sizing offset.
     * @param rand Random number generator.
     */
    private void createCars(int numPlayers, double offset, Random rand) {
    }

    /**
     * Creates the grid-pane for the game stats.
     * @param sceneX Reference to the scene's width. Needed for alignment.
     * @param sceneY Reference to the scene's height.
     */
    private void setGridPane(double sceneX, double sceneY) {
    }

    /**
     * Responsible for updating the "stats" of the components within the gridPane
     * for example gpLocations -- the location information
     * as well as  gpCars      -- the cars information (time)
     */
    public void updateStats() {
    }

    /**
     * Handles changing the active car's location.
     */
    private EventHandler<MouseEvent> locationEvent = mouseEvent -> {
    };
}