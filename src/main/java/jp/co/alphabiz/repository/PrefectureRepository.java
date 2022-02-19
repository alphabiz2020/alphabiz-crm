package jp.co.alphabiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.alphabiz.entity.Prefecture;

@Repository
public interface PrefectureRepository extends JpaRepository<Prefecture, Integer> {

}
