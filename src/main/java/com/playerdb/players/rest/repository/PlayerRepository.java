package com.playerdb.players.rest.repository;

import com.playerdb.players.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, String> {

    /**
     * Finds the list of players by using the birthCountry as a query criteria.
     * @param birthCountry
     * @return  A list of players whose birth country is an exact match with the given last name.
     *          If no persons is found, this method returns an empty list.
     */
    @Query(name = "SELECT p FROM PLAYERS p WHERE LOWER(p.birthCountry) = LOWER(:birthCountry)")
    public List<Player> findByBirthCountry(@Param("birthCountry") String birthCountry);


    @Query(name = "SELECT p FROM PLAYERS p WHERE p.birthYear = LOWER(:birthYear)")
    public List<Player> findByBirthYear(@Param("birthYear") String birthYear);
}