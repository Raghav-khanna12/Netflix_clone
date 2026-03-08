package com.netflixclone.backend.controller;

import com.netflixclone.backend.dto.TitleDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/titles")
public class CatalogController {

    @GetMapping("/trending")
    public List<TitleDto> trendingTitles() {
        return List.of(
                new TitleDto("Red Skyline", "https://images.unsplash.com/photo-1440404653325-ab127d49abc1?auto=format&fit=crop&w=700&q=80"),
                new TitleDto("The Last Mission", "https://images.unsplash.com/photo-1517604931442-7e0c8ed2963c?auto=format&fit=crop&w=700&q=80"),
                new TitleDto("Midnight Hunt", "https://images.unsplash.com/photo-1595769816263-9b910be24d5f?auto=format&fit=crop&w=700&q=80"),
                new TitleDto("Broken Silence", "https://images.unsplash.com/photo-1585951237318-9ea5e175b891?auto=format&fit=crop&w=700&q=80")
        );
    }

    @GetMapping("/popular")
    public List<TitleDto> popularTitles() {
        return List.of(
                new TitleDto("City of Ash", "https://images.unsplash.com/photo-1485846234645-a62644f84728?auto=format&fit=crop&w=700&q=80"),
                new TitleDto("Parallel Line", "https://images.unsplash.com/photo-1518929458119-e5bf444c30f4?auto=format&fit=crop&w=700&q=80"),
                new TitleDto("Neon Files", "https://images.unsplash.com/photo-1460881680858-30d872d5b530?auto=format&fit=crop&w=700&q=80"),
                new TitleDto("Future Code", "https://images.unsplash.com/photo-1497032628192-86f99bcd76bc?auto=format&fit=crop&w=700&q=80")
        );
    }
}
