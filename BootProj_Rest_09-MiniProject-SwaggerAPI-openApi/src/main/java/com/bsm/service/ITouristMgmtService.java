package com.bsm.service;
import java.util.List;
import com.bsm.entity.Tourist;
public interface ITouristMgmtService {
	public String registerTourist(Tourist tourist);
	public List<Tourist> fetchAllTourists();
}
