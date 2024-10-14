package com.bsm.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bsm.entity.Tourist;
import com.bsm.repo.ITouristRepo;
@Service("touristService")
public class TouristMgmtServiceImpl implements ITouristMgmtService {
	@Autowired
	private ITouristRepo touristRepo;

	@Override
	public String registerTourist(Tourist tourist) {
		Integer tid = touristRepo.save(tourist).getTid();
		return "Tourist is registered having the id value " + tid;
	}

	@Override
	public List<Tourist> fetchAllTourists(){
	      List<Tourist> list = touristRepo.findAll();
	    list.sort((t1,t2)->t1.getTid().compareTo(t2.getTid()));
		return list;
	}


}
