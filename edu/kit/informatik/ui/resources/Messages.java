package edu.kit.informatik.ui.resources;

public enum Messages {

    OK("OK");

    //TODO:
    // - Implement the new Messages
    // - Use Regex

    private final String message;

    private Message(String message) {
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
        return String.format(this.message, args);
    }

    @Override
    public String toString() {
        return this.message;
    }

}
