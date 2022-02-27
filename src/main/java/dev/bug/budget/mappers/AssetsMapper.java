package dev.bug.budget.mappers;

import dev.bug.budget.builders.AssetDtoBuilder;
import dev.bug.budget.builders.AssetEntityBuilder;
import dev.bug.budget.repositories.entities.AssetEntity;
import dev.bug.budget.services.dtos.AssetDto;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class AssetsMapper {

    public AssetEntity fromDtoToEntity(AssetDto assetDto) {
        if (Objects.isNull(assetDto)) {
            return null;
        }
        AssetEntityBuilder assetEntityBuilder = new AssetEntityBuilder();
        if (Objects.nonNull(assetDto.getId())) {
            assetEntityBuilder.withId(assetDto.getId());
        }
        if (Objects.nonNull(assetDto.getAmount())) {
            assetEntityBuilder.withAmount(assetDto.getAmount());
        }
        return assetEntityBuilder.build();
    }

    public AssetDto fromEntityToDto(AssetEntity assetEntity) {
        if (Objects.isNull(assetEntity)) {
            return null;
        }
        AssetDtoBuilder assetDtoBuilder = new AssetDtoBuilder();
        if (Objects.nonNull(assetEntity.getId())) {
            assetDtoBuilder.withId(assetEntity.getId());
        }
        if (Objects.nonNull(assetEntity.getAmount())) {
            assetDtoBuilder.withAmount(assetEntity.getAmount());
        }
        return assetDtoBuilder.build();
    }
}
