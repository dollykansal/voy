package com.ep360.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ep360.data.models.VesselMaster;
import com.ep360.data.models.VoyHeader;
import com.ep360.service.api.VoyageService;
import com.google.gson.Gson;

@Controller
@Scope(value="prototype")
public class VoyageMaster {

	@Autowired
	private VoyageService voyageService;
	
	@RequestMapping(value = "/voyHeader", method = RequestMethod.GET)
	@ResponseBody
	public List<VoyHeader> getVoyageHeaderData(){
		return voyageService.getVoyageHeaderData();
	}
	
	@RequestMapping(value = "/vesselMaster", method = RequestMethod.GET)
	@ResponseBody
	public List<VesselMaster> getVoyageMasterData(){
		return voyageService.getVesselMasterData();
	}
	
	@RequestMapping(value = "/")
	public ModelAndView getHomePage(){
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("vesselMaster", new Gson().toJson(voyageService.getVesselMasterData()));
		return modelAndView;
	}
}
