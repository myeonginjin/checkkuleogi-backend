package com.Familyship.checkkuleogi.domains.recommend.jpa.repository;

import com.Familyship.checkkuleogi.domains.recommend.jpa.Recommend;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecommendRepository extends JpaRepository<Recommend, Long> {
    List<Recommend> findByChildIdx(Long childIdx);
}