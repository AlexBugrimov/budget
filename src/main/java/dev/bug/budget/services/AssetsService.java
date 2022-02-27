package dev.bug.budget.services;

import dev.bug.budget.mappers.AssetsMapper;
import dev.bug.budget.repositories.AssetsRepository;
import dev.bug.budget.repositories.entities.AssetEntity;
import dev.bug.budget.services.dtos.AssetDto;
import dev.bug.budget.services.dtos.AssetsDto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public record AssetsService(AssetsRepository assetsRepository,
                            AssetsMapper assetsMapper) {

    public AssetsDto getAssets() {
        List<AssetEntity> assetEntities = assetsRepository.findAll();
        List<Integer> assetsAmount = assetEntities.stream()
                .map(entity -> entity.getAmount().intValue())
                .collect(Collectors.toList());
        AssetsDto assetsDto = new AssetsDto();
        assetsDto.setAssets(assetsAmount);
        return assetsDto;
    }

    public void setAsset(int asset) {
        AssetDto assetDto = new AssetDto();
        assetDto.setAmount(new BigDecimal(asset));
        AssetEntity assetEntity = assetsMapper.fromDtoToEntity(assetDto);
        assetsRepository.save(assetEntity);
    }
}
