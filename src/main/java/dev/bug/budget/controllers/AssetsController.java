package dev.bug.budget.controllers;

import dev.bug.budget.services.AssetsService;
import dev.bug.budget.services.dtos.AssetsDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/assets")
public record AssetsController(AssetsService assetsService) {

    @GetMapping
    public AssetsDto getAssets() {
        return assetsService.getAssets();
    }

    @PostMapping("/{asset}")
    public void setAsset(@PathVariable("asset") int asset) {
        assetsService.setAsset(asset);
    }

}
