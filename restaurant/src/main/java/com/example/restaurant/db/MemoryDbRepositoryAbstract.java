package com.example.restaurant.db;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

abstract public class MemoryDbRepositoryAbstract <T extends MemoryDbEntity> implements MemoryDbRepositoryIfs{

    private final List<T> db = new ArrayList<>();
    private int index = 0;

    @Override
    public Optional findById(int index) {
        db.stream().filter(it -> it.getIndex() == index).findFirst();
        return Optional.empty();
    }

    @Override
    public Object save(Object entity) {

        return null;
    }

    @Override
    public void deleteById(int index) {

    }

    @Override
    public List listAll() {
        return null;
    }
}
