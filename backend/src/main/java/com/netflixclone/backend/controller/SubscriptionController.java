package com.netflixclone.backend.controller;

import com.netflixclone.backend.dto.MessageResponse;
import com.netflixclone.backend.dto.SubscriptionRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/subscriptions")
public class SubscriptionController {

    @PostMapping
    public MessageResponse subscribe(@Valid @RequestBody SubscriptionRequest request) {
        return new MessageResponse("Thanks! We'll reach out to " + request.email() + " soon.");
    }
}
