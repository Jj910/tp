package seedu.blockbook.model;

import javafx.collections.ObservableList;
import seedu.blockbook.model.gamer.Gamer;

/**
 * Unmodifiable view of an address book
 */
public interface ReadOnlyBlockBook {

    /**
     * Returns an unmodifiable view of the persons list.
     * This list will not contain any duplicate persons.
     */
    ObservableList<Gamer> getGamerList();

}

