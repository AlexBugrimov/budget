package dev.bug.budget.services;

import dev.bug.budget.services.dtos.AssetsDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class AssetsService {

    private final AssetsDto assetsDto = new AssetsDto();

    public AssetsDto getAssets() {
        return assetsDto;
    }

    public void setAsset(int asset) {
        List<Integer> assets = assetsDto.getAssets();
        if (Objects.isNull(assets)) {
            assets = new ArrayList<>();
        }
        assets.add(asset);
        assetsDto.setAssets(assets);
    }
}
