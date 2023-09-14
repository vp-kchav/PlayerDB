package com.playerdb.players.rest.services.player;

import com.playerdb.players.models.Player;
import com.playerdb.players.models.Players;
import com.playerdb.players.rest.services.exception.player.PlayerNotFoundException;

import java.util.Collection;
import java.util.Optional;


/**
 * Provides service tier CRUD operations for {@code Players}.
 *
 * @author Amit Kulkarni
 *
 */
public interface PlayerService {

    /**
     * Get all the {@code Player} known to this service.
     *
     * @return all {@code Player}s known to this service
     */
    public Players getPlayers();

    /**
     * Get the {@code Player} associated with {@code playerId}
     *
     * @param playerId
     *            identifier for requested {@code Player}
     * @return {@code Player} associated with {@code playerId}
     * @throws InterruptedException
     *             if no {@code Player} found for {@code playerId}
     */
    public Optional<Player> getPlayerById(String playerId);

    /**
     * Get the {@code Player} associated with {@code playerId}
     *
     * @param birthCountry
     *            identifier for requested {@code Player}
     * @return all {@code Player} associated with {@code birthCountry}
     * @throws PlayerNotFoundException
     *             if no {@code Player} found for {@code birthCOuntry}
     */
     public Optional<Collection<Player>>  getPlayersByBirthCountry(String birthCountry);

    /**
     * Create a new {@code Player} with auto-generated ID. The
     *      * date and time modeled as UTC milliseconds.
     *
     * @param player
     *            {@code Player} to create
     * @throws PlayerNotFoundException
     *
     * @return {@code Player} associated with {@code Player}
     */
    // public Player createPlayer(Player player);

    /**
     * Updates {@code Player} to reflect input {@code player}.
     *
     * @param player
     *            specifies required {@code Player} state
     * @param playerId
     *            specifies the updating {@code Player}'s identifier
     * @return updated {@code Player}
     * @throws PlayerConstraintViolationException
     *             if the following preconditions aren't satisfied:
     *             <ul>
     *             <li>{@code playerId} must not be null or empty</li>
     *             <li>if {@code player.id} is not null or empty, it must
     *             equal {@code playerId}</li>
     *             <li>{@code player} must not be null</li>
     *             </ul>
     * @throws PlayerNotFoundException
     *             if no {@code Player} found for {@code playerId}
     */
    // public Player updatePlayer(Player player, String playerId);

    /**
     * Delete {@code Player} associated with {@code playerId}
     *
     * @param playerId
     *            identifier for deleting {@code Player}
     * @throws PlayerNotFoundException
     *             if {@code Player} associated with {@code playerId}
     *             doesn't exist
     */
    // public void deletePlayer(String playerId);
}
