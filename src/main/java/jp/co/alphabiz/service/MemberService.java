package jp.co.alphabiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.alphabiz.entity.Actor;
import jp.co.alphabiz.repository.ActorRepository;
import jp.co.alphabiz.repository.PrefectureRepository;

@Service
public class MemberService {

	@Autowired
	ActorRepository actorRepository;

	@Autowired
	PrefectureRepository prefectureRepository;

	public List<Actor> getMemberList(String keyword) {

		List<Actor> actorList = actorRepository.findActors(keyword);
		return actorList;
	}

}
