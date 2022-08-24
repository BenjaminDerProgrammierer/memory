package net.coderdojo.linz.memory;

import java.util.List;

public class GameResponse {
    public int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public List<String> cards;
    public List<String> getCards() {
        return cards;
    }
    public void setCards(List<String> cards) {
        this.cards = cards;
    }
    public List<PlayerResponse> players;
    public List<PlayerResponse> getPlayers() {
        return players;
    }
    public void setPlayers(List<PlayerResponse> players) {
        this.players = players;
    }
}
