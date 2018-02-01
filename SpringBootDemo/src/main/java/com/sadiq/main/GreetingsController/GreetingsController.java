package com.sadiq.main.GreetingsController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sadiq.main.GreetingsController.model.RenewBuildingDetails;

@RestController
public class GreetingsController {
	// Read Value from properties file	
	@Value("${empolyee.name}")
	String empName;
	@RequestMapping("/")
	public String gretting(){
		return empName;
		
	}
	
	@RequestMapping("/renewBuildingDetails")
	@ResponseBody
	public RenewBuildingDetails renewBuildingDetails(){
		
		RenewBuildingDetails renewBuildingDetails = new RenewBuildingDetails();
		
		renewBuildingDetails.setApp_date_DM("Y");
		renewBuildingDetails.setApp_type_DM("Y");
		renewBuildingDetails.setApplct_id_no_DM("Y");
		renewBuildingDetails.setApplct_name_DM("Y");
		renewBuildingDetails.setTn_status_DM("N");
		
		return renewBuildingDetails;
		
	}
	
	

}
