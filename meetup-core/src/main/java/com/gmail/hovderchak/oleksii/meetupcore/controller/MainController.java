package com.gmail.hovderchak.oleksii.meetupcore.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.hovderchak.oleksii.meetupcore.dto.ApiResponseDataDto;

@RestController
@RequestMapping("/")
public class MainController {

    @Value("${main.page.logo}")
    private String logo;

    @Value("${main.page.header}")
    private String header;

    @GetMapping("/")
    public ApiResponseDataDto meetUp() {
        return new ApiResponseDataDto(logo, header);
    }
}
