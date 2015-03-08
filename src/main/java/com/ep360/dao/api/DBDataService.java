package com.ep360.dao.api;

import java.util.List;

import com.ep360.data.models.VesselMaster;
import com.ep360.data.models.VoyHeader;

public interface DBDataService {

	public List<VoyHeader> getVoyageHeaderData();
	
	public List<VesselMaster> getVesselMasterData();
}
