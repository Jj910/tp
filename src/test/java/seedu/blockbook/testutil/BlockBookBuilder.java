package seedu.blockbook.testutil;

import seedu.blockbook.model.BlockBook;
import seedu.blockbook.model.gamer.Gamer;

/**
 * A utility class to help with building Addressbook objects.
 * Example usage: <br>
 *     {@code AddressBook ab = new AddressBookBuilder().withPerson("John", "Doe").build();}
 */
public class BlockBookBuilder {

    private BlockBook blockBook;

    public BlockBookBuilder() {
        blockBook = new BlockBook();
    }

    public BlockBookBuilder(BlockBook blockBook) {
        this.blockBook = blockBook;
    }

    /**
     * Adds a new {@code Person} to the {@code AddressBook} that we are building.
     */
    public BlockBookBuilder withPerson(Gamer person) {
        blockBook.addGamer(person);
        return this;
    }

    public BlockBook build() {
        return blockBook;
    }
}

