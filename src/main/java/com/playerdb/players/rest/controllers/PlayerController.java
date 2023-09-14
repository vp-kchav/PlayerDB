package com.playerdb.players.rest.controllers;

import com.playerdb.players.models.Player;
import com.playerdb.players.models.Players;
import com.playerdb.players.rest.services.player.PlayerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import static java.util.stream.Collectors.toCollection;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping(value = "v1/players", produces = { MediaType.APPLICATION_JSON_VALUE })
@Tag(name = "players")
public class PlayerController {

    @Resource
    private PlayerService playerService;

    @RequestMapping(method = RequestMethod.GET)
    @Operation(description = "Get all the players", summary = "Get all the players")
    public ResponseEntity<Players> getPlayers() {
        Players players = playerService.getPlayers();
        return ok(players);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Player> getPlayerById(@PathVariable("id") String id) {
        Optional<Player> player = playerService.getPlayerById(id);

        if (player.isPresent()) {
            return new ResponseEntity<>(player.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/country/{birthCountry}")
    public ResponseEntity<Players> getPlayerByBirthCountry(@PathVariable("birthCountry") String birthCountry) {
        Optional<Collection<Player>> players = playerService.getPlayersByBirthCountry(birthCountry);

        if (players.isPresent()) {
            Players playersObj = new Players();
            ArrayList<Player> newList = players.get().stream().collect(toCollection(ArrayList::new));
            playersObj.setPlayers(newList);
            return new ResponseEntity<>(playersObj , HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
