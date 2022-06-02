package com.example.restaurant.wishlist.repository;

import com.example.restaurant.db.MemoryDbEntity;
import com.example.restaurant.db.MemoryDbRepositoryAbstract;
import com.example.restaurant.wishlist.entity.WishlistEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishlistEntity> {
}
