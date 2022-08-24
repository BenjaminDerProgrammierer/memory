package net.coderdojo.linz.memory;

import java.util.Arrays;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    @GetMapping("/options")
    public OptionsResponse getOptions() {
        return new OptionsResponse();
    }

    @GetMapping("/status")
    public String getStatus() {
        return "OK";
    }

    @PostMapping("/game")
    public GameResponse startGame(@RequestBody GameRequest gameRequest) {
        GameResponse response = new GameResponse();
        response.setId(UUID.randomUUID().toString());
        response.setCards(Arrays.asList("😀", "😁", "😆", "😅", "🤣", "😂", "🙂", "😉", "😊", "🙄","😎","😀", "😁", "😆", "😅", "🤣", "😂", "🙂", "😉", "😊", "🙄","😎"));
        //TODO Weitermachen
        return response;
    }
}
