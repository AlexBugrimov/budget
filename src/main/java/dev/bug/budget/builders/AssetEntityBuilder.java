package dev.bug.budget.builders;

import dev.bug.budget.repositories.entities.AssetEntity;

import java.math.BigDecimal;
import java.util.UUID;

public class AssetEntityBuilder {

    private UUID id;
    private BigDecimal amount;

    public AssetEntityBuilder withId(UUID id) {
        this.id = id;
        return this;
    }

    public AssetEntityBuilder withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public AssetEntity build() {
        AssetEntity assetEntity = new AssetEntity();
        assetEntity.setId(id);
        assetEntity.setAmount(amount);
        return assetEntity;
    }
}
