package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.model.Model.PREDICATE_SHOW_ALL_CLIENTS;

import seedu.address.model.Model;

/**
 * Lists all persons in MyInsuRec to the user.
 */
public class ListClientCommand extends Command {

    public static final String COMMAND_WORD = "listClient";

    public static final String MESSAGE_SUCCESS = "Listed all clients";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        model.updateFilteredClientList(PREDICATE_SHOW_ALL_CLIENTS);
        return new CommandResult(MESSAGE_SUCCESS, CommandSpecific.CLIENT);
    }
}
