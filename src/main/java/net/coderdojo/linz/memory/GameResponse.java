package net.coderdojo.linz.memory;

import java.util.ArrayList;
import java.util.List;

public class GameResponse {
    public String id;
    public String getId() {
        return id;
    }
    public void setId(String id) {
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
    public List<PlayerResponse> winners = new ArrayList<>();
}
