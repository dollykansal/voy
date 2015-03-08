package com.ep360.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.ep360.dao.api.DBDataService;
import com.ep360.data.models.VesselMaster;
import com.ep360.data.models.VoyHeader;
import com.ep360.service.api.VoyageService;

@Service(value="voyageService")
@Scope(value="prototype")
public class VoyageServiceImpl implements VoyageService {

	@Autowired
	private DBDataService dataService;
	
	@Override
	public List<VoyHeader> getVoyageHeaderData() {
		return dataService.getVoyageHeaderData();
	}
	
	@Override
	public List<VesselMaster> getVesselMasterData() {
		return dataService.getVesselMasterData();
	}
}
