package dev.bug.budget.services;

import dev.bug.budget.repositories.AssetsRepository;
import dev.bug.budget.repositories.entities.AssetEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class FaceAssetRepository implements AssetsRepository {
    @Override
    public List<AssetEntity> findAll() {
        return null;
    }

    @Override
    public List<AssetEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<AssetEntity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<AssetEntity> findAllById(Iterable<UUID> uuids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public void delete(AssetEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends UUID> uuids) {

    }

    @Override
    public void deleteAll(Iterable<? extends AssetEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends AssetEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends AssetEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<AssetEntity> findById(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(UUID uuid) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends AssetEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends AssetEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<AssetEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<UUID> uuids) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public AssetEntity getOne(UUID uuid) {
        return null;
    }

    @Override
    public AssetEntity getById(UUID uuid) {
        return null;
    }

    @Override
    public <S extends AssetEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends AssetEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends AssetEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends AssetEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends AssetEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends AssetEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends AssetEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
