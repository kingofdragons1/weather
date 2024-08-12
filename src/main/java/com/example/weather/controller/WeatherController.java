package com.example.weather.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final String apiKey = "9b4711806fa9b643e40da8e88c36f8c7"; // Замените на ваш API ключ
    private final String baseUrl = "http://api.openweathermap.org/data/2.5/weather";

    @GetMapping
    public ResponseEntity<String> getWeather(@RequestParam double lat, @RequestParam double lon) {
        String url = String.format("%s?lat=%f&lon=%f&appid=%s&units=metric", baseUrl, lat, lon, apiKey);

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);

        return ResponseEntity.ok(response);
    }
}
