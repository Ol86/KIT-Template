package edu.kit.informatik.ui.resources;

/**
 * Every error message that is returned is listed here.
 */
public enum ErrorMessages {

    /**
     * This error is printed, if the player enters nothing in the command.
     */
    EMPTY_COMMAND("please enter a command."),

    /**
     * This error is printed, if a player mistypes a command or enters an unknown command.
     *
     * Expects one format argument:
     * The entered command name (string).
     */
    COMMAND_NOT_FOUND("there is no command called '%s'.");

    //TODO:
    // - Implement the next error messages
    // - Use Regex

    private static final String PREFIX = "Error, ";

    private final String message;

    private ErrorMessage(String message) {
        this.message = message;
    }

    /**
     * This method formats the whole message with the specified arguments.
     *
     * Calls {@link String#format(String, Object...)} internally.
     *
     * @param args These are the arguments referenced by the format specifiers in the format string.
     * @return This method returns the format string.
     */
    public String format(Object... args) {
        return PREFIX + String.format(this.message, args);
    }

    @Override
    public String toString() {
        return PREFIX + this.message;
    }

}
