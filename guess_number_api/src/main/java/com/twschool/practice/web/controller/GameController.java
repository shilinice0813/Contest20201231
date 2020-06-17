package com.twschool.practice.web.controller;

import com.twschool.practice.web.entity.ResultDTO;
import com.twschool.practice.web.entity.ResultPlayingDTO;
import com.twschool.practice.web.service.GameService;
import com.twschool.practice.web.service.GuessGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GameController {

    @Autowired
    GuessGameService guessGameService;

    @GetMapping("/game")
    public Map<String, String> guess(@RequestParam String guess) {
        GameService gameService = new GameService();
        String result = gameService.guess(guess);
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("input", guess);
        resultMap.put("result", result);
        return resultMap;
    }


    @PutMapping("/game/guess/{id}")
    public ResultPlayingDTO guessById(@RequestBody String guess, @PathVariable String id) {
        return guessGameService.guessById(guess, id);
    }

    @GetMapping("/users/{id}")
    public ResultDTO userInfoById(@PathVariable String id) {
        return guessGameService.getUserInfo(id);
    }
}
