package com.playerdb.players.rest.services.exception.player;

public class PlayerServiceException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs exception without message or cause.
     */
    public PlayerServiceException() {
        super();
    }

    /**
     * Construct with a message {@code String} that is returned by the inherited
     * {@code Throwable.getMessage}.
     *
     * @param message
     *            the message that is returned by the inherited
     *            {@code Throwable.getMessage}
     */
    public PlayerServiceException(String message) {
        super(message);
    }

    /**
     * Construct with a {@code Throwable} cause that is returned by the
     * inherited {@code Throwable.getCause}. The {@code Throwable.getMessage}
     * will display the output from {@code toString} called on the {@code cause}
     * .
     *
     * @param cause
     *            the cause that is returned by the inherited
     *            {@code Throwable.getCause}
     */
    public PlayerServiceException(Throwable cause) {
        super(cause);
    }

    /**
     * Construct with both a {@code String} message and a {@code Throwable}
     * cause. The {@code message} is returned by the inherited
     * {@code Throwable.getMessage}. The cause that is returned by the inherited
     * {@code Throwable.getCause}.
     *
     * @param message
     *            the message that is returned by the inherited
     *            {@code Throwable.getMessage}
     * @param cause
     *            the cause that is returned by the inherited
     *            {@code Throwable.getCause}
     */
    public PlayerServiceException(String message, Throwable cause) {
        super(message, cause);
    }

}
