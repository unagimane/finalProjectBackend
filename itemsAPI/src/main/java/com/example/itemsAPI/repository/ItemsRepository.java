package com.example.itemsAPI.repository;
import com.example.itemsAPI.repository.entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepository extends JpaRepository<Items, Integer>
{
}