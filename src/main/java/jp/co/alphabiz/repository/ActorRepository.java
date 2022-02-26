package jp.co.alphabiz.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jp.co.alphabiz.dto.member.ActorDto;

@Repository
public interface ActorRepository {

	List<ActorDto> findActors(@Param("name") String name, @Param("birthplaceId") String birthplaceId);
	ActorDto findActorById(@Param("actorId") String actorId);
}
