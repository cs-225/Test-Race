package main.java;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
  * Responsible for the main thread within the program.
 * Starts with a prompt screen that prompts the user to select within a combo-box
 *   the number of players who will be playing. From there, a Track is created
 *   with the respective amount of cars.
 */
public class View extends Application {

    /**
     * The parent scene of the pane's
     */
    private Scene scene;

    /**
     * The main screen for the game.
     * Initialized in StartPrompt's event-handler for the start button
     *   so that it can understand the selection for number of users.
     */
    private Track track;

    /**
     * Global reference to the restart button for the restart event-handler
     */
    private Button restartButton;

    /**
     * Global reference to the start-prompt for the restart event-handler
     */
    private StartPrompt prompt;

    /**
     * Starts the program.
     * @param args Arguments
     */
    public static void main(String[] args) { launch(args); }

    /**
     * The main running thread of the graphical interface.
     * Starts with a prompt and then ushers in the track.
     * @param stage The parent stage of the scene.
     * @throws Exception
     */
    @Override
    public void start(final Stage stage) throws Exception {
    }

    /**
     * Creates a prompt to allow users to choose how many players will be playing the game.
     * Separated for clarity.
     */
    public class StartPrompt extends BorderPane {

        /**
         * @comboBox A drop-down menu with a fixed set of selections.
         */
        private ComboBox<Integer> comboBox;

        /**
         * @button The start button. Separated for access by it's event handler
         */
        private Button button;

        /**
         * Initializes the components of the start prompt including,
         *     The title, a start button, and a ComboBox for the players to choose the amount of players.
         */
        public StartPrompt() {
        }

        /**
         * Creates a grid for layout purposes.
         * @return gp a grid-pane with a label and a combo-box
         */
        private GridPane addGridPane() {
        }

        /**
         * Handles the start button
         * When the start button is clicked a new Track is created.
         * The value of the selection of the combo box is passed to the Track's setTrack method.
         * Then sets Scene's root to the track.
         * Creates a restart button, adds it to the track and adds an event handler for it.
         */
        private EventHandler<MouseEvent> event = mouseEvent -> {
        };
    }

    /**
     * Handles restarting the game
     * Re-initiates the start prompt and sets it to the screen's root
     */
    private EventHandler<MouseEvent> restart = mouseEvent -> {

    };


}

