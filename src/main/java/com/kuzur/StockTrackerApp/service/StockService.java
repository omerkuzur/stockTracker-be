package com.kuzur.StockTrackerApp.service;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StockService {

    @Value("${finnhub.api.key}")
    private String apiKey; // Finnhub API anahtarınız

    private final String BASE_URL = "https://finnhub.io/api/v1/quote?symbol={symbol}&token=";

    public String getStockPrice(String symbol) {
        RestTemplate restTemplate = new RestTemplate();
        String url = BASE_URL + apiKey; // API anahtarınızı ekleyin

        // API çağrısını yapın
        String response = restTemplate.getForObject(url.replace("{symbol}", symbol), String.class);

        // Yanıtı kontrol et
        if (response != null) {
            // JSON yanıtını kontrol et
            JSONObject jsonResponse = new JSONObject(response);
            double currentPrice = jsonResponse.getDouble("c");

            // Eğer hisse fiyatı geçersizse (0 veya negatifse)
            if (currentPrice <= 0) {
                return "{\"error\": \"Hisse şu an işlemde değil\"}"; // Hisse işlemde değilse hata mesajı döndür
            }
            return response; // Geçerli yanıt döndür
        } else {
            return "{\"error\": \"Hisse şu an işlemde değil\"}"; // Geçersiz yanıt için hata mesajı döndür
        }
    }
}