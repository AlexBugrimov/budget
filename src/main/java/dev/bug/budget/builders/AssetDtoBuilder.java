package dev.bug.budget.builders;

import dev.bug.budget.services.dtos.AssetDto;

import java.math.BigDecimal;
import java.util.UUID;

public class AssetDtoBuilder {

    private UUID id;
    private BigDecimal amount;

    public AssetDtoBuilder withId(UUID id) {
        this.id = id;
        return this;
    }

    public AssetDtoBuilder withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public AssetDto build() {
        AssetDto assetDto = new AssetDto();
        assetDto.setId(id);
        assetDto.setAmount(amount);
        return assetDto;
    }
}
