package jp.co.alphabiz.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jp.co.alphabiz.entity.Actor;

@Repository
public interface ActorRepository  {


  List<Actor> findActors(@Param("name") String name, @Param("birthplaceId") String birthplaceId);

}
