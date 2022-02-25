package dev.bug.budget.services;

import dev.bug.budget.services.dtos.AssetsDto;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AssetsServiceTest {

    @Test
    void shouldSaveAssetAndReturnListWithOneElementIfWhereWasNoSavedAssetsBefore() {
        // given
        int asset = 1;
        AssetsService assetsService = new AssetsService();
        assetsService.setAsset(asset);

        // when
        AssetsDto assets = assetsService.getAssets();

        // then
        List<Integer> allAssets = assets.getAssets();
        assertThat(allAssets)
                .hasSize(1)
                .containsExactly(asset);
    }

    @Test
    void shouldSaveAssetAndReturnListWithTwoElementsIfWhereWasNoSavedAssetsBefore() {
        // given
        int assetOne = 1;
        int assetTwo = 2;

        AssetsService assetsService = new AssetsService();
        assetsService.setAsset(assetOne);
        assetsService.setAsset(assetTwo);

        // when
        AssetsDto result = assetsService.getAssets();

        // then
        List<Integer> assets = result.getAssets();
        assertThat(assets)
                .hasSize(2)
                .containsExactly(assetOne, assetTwo);
    }
}