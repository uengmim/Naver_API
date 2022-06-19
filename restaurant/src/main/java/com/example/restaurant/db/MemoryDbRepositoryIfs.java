package com.example.restaurant.db;

import java.util.List;
import java.util.Optional;

public interface MemoryDbRepositoryIfs<T> {
    Optional<T> findById(int index);
    T save(T entity);
    void deleteById(int index);
    List<T> listAll();
}
    @Override
    public T save(T entity) {
        var optionalEntity = db.stream().filter(it -> it.getIndex() == entity.getIndex()).findFirst();

        if (optionalEntity.isEmpty()) {
            // db에 이미 데이터가 없는 경우
            index++;
            entity.setIndex(index);
            db.add(entity);
            return entity;
        } else {
            // db에 이미 데이터가 없는 경우
            var preIndex = optionalEntity.get().getIndex();
            entity.setIndex(preIndex);
            deleteById(preIndex);
            db.add(entity);
            return entity;
        }
    }
