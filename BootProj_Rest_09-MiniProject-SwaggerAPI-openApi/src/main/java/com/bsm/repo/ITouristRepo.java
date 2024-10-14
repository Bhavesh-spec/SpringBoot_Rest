package com.bsm.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.bsm.entity.Tourist;
public interface ITouristRepo extends JpaRepository<Tourist,Integer>{
}
