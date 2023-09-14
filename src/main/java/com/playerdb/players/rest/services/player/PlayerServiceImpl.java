package com.playerdb.players.rest.services.player;

import com.playerdb.players.models.Player;
import com.playerdb.players.models.Players;
import com.playerdb.players.rest.repository.PlayerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerServiceImpl.class);

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public Players getPlayers() {
        Players players = new Players();
        playerRepository.findAll()
                .forEach(players.getPlayers()::add);

        return players;
    }

    @Override
    public Optional<Player> getPlayerById(String playerId) {
        Player player = null;

        /* simulated network delay */
        try {
            player = playerRepository.getById(playerId);
            Thread.sleep((long)(Math.random() * 2000));
        } catch (Exception e) {
            LOGGER.error("message=Exception in getPlayerById; exception={}", e.toString());
            return Optional.empty();
        }
        return Optional.of(player);
    }

    @Override
    public Optional<Collection<Player>> getPlayersByBirthCountry(String birthCountry) {
        try {
            Collection<Player> players = playerRepository.findByBirthCountry(birthCountry);
            return Optional.of(players);
        } catch (Exception e) {
            LOGGER.error("message=Exception in getPlayersByBirthCountry; exception={}", e.toString());
            return Optional.empty();
        }
    }
}
