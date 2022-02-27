package dev.bug.budget.services;

import dev.bug.budget.builders.AssetEntityBuilder;
import dev.bug.budget.mappers.AssetsMapper;
import dev.bug.budget.repositories.AssetsRepository;
import dev.bug.budget.repositories.entities.AssetEntity;
import dev.bug.budget.services.dtos.AssetsDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class AssetsServiceTest {

    @Mock
    private AssetsRepository assetsRepository;

    private final AssetsMapper assetsMapper = new AssetsMapper();

    private AssetsService service;

    @BeforeEach
    void setUp() {
        service = new AssetsService(assetsRepository, assetsMapper);
    }

    @Test
    void shouldSaveAssetAndReturnListWithOneElementIfWhereWasNoSavedAssetsBefore() {
        // given
        int asset = 1;
        AssetEntity assetEntity = new AssetEntityBuilder()
                .withAmount(new BigDecimal(asset))
                .build();
        Mockito.when(assetsRepository.findAll()).thenReturn(List.of(assetEntity));

        // when
        AssetsDto assets = service.getAssets();

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
        AssetEntity assetEntityOne = new AssetEntityBuilder()
                .withAmount(new BigDecimal(assetOne))
                .build();
        AssetEntity assetEntityTwo = new AssetEntityBuilder()
                .withAmount(new BigDecimal(assetTwo))
                .build();
        Mockito.when(assetsRepository.findAll()).thenReturn(List.of(assetEntityOne, assetEntityTwo));

        // when
        AssetsDto result = service.getAssets();

        // then
        List<Integer> assets = result.getAssets();
        assertThat(assets)
                .hasSize(2)
                .containsExactly(assetOne, assetTwo);
    }

    @Test
    void shouldVerityIdThenRepositorySaveWasCalledOneTime() {
        // given
        int asset = 1;

        // when
        service.setAsset(asset);

        // then
        verify(assetsRepository, times(1)).save(any(AssetEntity.class));
    }
}