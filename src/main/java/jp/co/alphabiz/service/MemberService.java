package jp.co.alphabiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.alphabiz.dto.member.ActorDto;
import jp.co.alphabiz.dto.member.ActorInputDto;
import jp.co.alphabiz.entity.Prefecture;
import jp.co.alphabiz.repository.ActorRepository;
import jp.co.alphabiz.repository.PrefectureRepository;

@Service
public class MemberService {

	@Autowired
	ActorRepository actorRepository;

	@Autowired
	PrefectureRepository prefectureRepository;

	/**
	 * @param inputDto
	 * @return
	 */
	public List<ActorDto> getMemberList(ActorInputDto inputDto) {

		List<ActorDto> actorList = actorRepository.findActors(inputDto.getName(), inputDto.getBirthplaceId());
		return actorList;
	}

	public ActorDto getMember(String actorId) {

		ActorDto actor = actorRepository.findActorById(actorId);
		return actor;
	}
	/**
	 * @return
	 */
	public List<Prefecture> getPrefectureList() {

		List<Prefecture> prefectureList = prefectureRepository.findAll();
		return prefectureList;
	}
}
