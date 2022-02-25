package jp.co.alphabiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.alphabiz.dto.member.ActorInputDto;
import jp.co.alphabiz.entity.Actor;
import jp.co.alphabiz.repository.ActorRepository;

@Service
public class MemberService {

	@Autowired
	ActorRepository actorRepository;
//
//	@Autowired
//	PrefectureRepository prefectureRepository;

	public List<Actor> getMemberList(ActorInputDto inputDto) {

		List<Actor> actorList = actorRepository.findActors(inputDto.getName(), inputDto.getBirthplaceId());
		return actorList;
	}

	public Actor getMember(String actorId) {

		Actor actor = actorRepository.findActorById(actorId);
		return actor;
	}
	
}
