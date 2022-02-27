package dev.bug.budget.services.dtos;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

public class AssetDto {

    private UUID id;
    private BigDecimal amount;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssetDto assetDto = (AssetDto) o;

        if (!Objects.equals(id, assetDto.id)) return false;
        return Objects.equals(amount, assetDto.amount);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }
}
