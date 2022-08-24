package net.coderdojo.linz.memory;

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
    public String startGame(@RequestBody GameRequest gameRequest) {
        return "OK";
    }
}
