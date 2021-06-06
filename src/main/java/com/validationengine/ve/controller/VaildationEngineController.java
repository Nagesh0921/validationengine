package com.validationengine.ve.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.validationengine.ve.bo.Aircraft;
import com.validationengine.ve.bo.Response;
import com.validationengine.ve.bo.ResponseBuilder;
import com.validationengine.ve.bo.WrapperInput;
import com.validationengine.ve.service.ValidationService;

@RestController
public class VaildationEngineController {
	
	@Autowired
	ValidationService vs;
	
	@PostMapping("/validate")
	public List<Response> validate(@RequestBody WrapperInput input, BindingResult result) {
		List<Response> res = new ArrayList<>();
		int counter = 0;
		for(Aircraft ac : input.getAircrafts()) {
			Response response = new Response();
			List<ResponseBuilder> resp = vs.validate(ac);
			if(resp.isEmpty()) {
				response.setRowNo(counter++);
			} else {
				response.setRowNo(counter++);
				response.setBuilder(resp);
			}
			res.add(response);
		}
		return res;
	}
}
