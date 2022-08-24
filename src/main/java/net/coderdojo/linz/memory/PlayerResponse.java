package net.coderdojo.linz.memory;

import java.util.List;

public class PlayerResponse {
    public String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public boolean currentPlayer;
    public boolean getCurrentPlayer() {
        return currentPlayer;
    }
    public void setCurrentPlayer(boolean currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public List<String> foundCards;
    public List<String> getFoundCards() {
        return foundCards;
    }
    public void setFoundCards(List<String> foundCards) {
        this.foundCards = foundCards;
    }
}
