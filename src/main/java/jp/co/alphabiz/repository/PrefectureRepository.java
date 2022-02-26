package jp.co.alphabiz.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import jp.co.alphabiz.entity.Prefecture;

@Repository
public interface PrefectureRepository {

	List<Prefecture> findAll();
}
