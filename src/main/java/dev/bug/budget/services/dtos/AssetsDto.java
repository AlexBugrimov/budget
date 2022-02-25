package dev.bug.budget.services.dtos;

import java.util.List;

public class AssetsDto {

    private List<Integer> assets;

    public void setAssets(List<Integer> assets) {
        this.assets = assets;
    }

    public List<Integer> getAssets() {
        return assets;
    }
}
