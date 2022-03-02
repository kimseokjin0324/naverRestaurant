package com.example.naverRestaurant.wishlist.repository;

import com.example.naverRestaurant.db.MemoryDbRepositoryAbstract;
import com.example.naverRestaurant.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {

}
