package com.playerdb.players.rest.services.exception.player;

/**
 * Models a player not found error.
 *
 * @author Amit Kulkarni
 *
 */
public class PlayerNotFoundException extends PlayerServiceException {

    private static final long serialVersionUID = 1L;

    private final String playerId;

    /**
     * Construct with a message {@code String} that is returned by the inherited
     * {@code Throwable.getMessage}.
     e}
     * @param playerId
     *            the id of the missing player
     */
    public PlayerNotFoundException(String playerId) {
        super("Failed to find player for playerId=" + playerId);
        this.playerId = playerId;
    }

    public String getPlayerId() {
        return playerId;
    }
}