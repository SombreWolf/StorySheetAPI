package com.github.sombrewolf.storysheetapi.ressource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class StorySheetRessource {

    @GetMapping(value = "/test")
    public Mono<String> test() {
        return Mono.just("TEST");
    }

    /*@PostMapping(value="/json", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Mono<DTO> json() {
        return qqch;
     }*/

}
