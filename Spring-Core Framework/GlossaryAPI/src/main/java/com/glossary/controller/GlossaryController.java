package com.glossary.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.glossary.services.GlossaryService;

@RestController
public class GlossaryController {
	
	@Autowired
	GlossaryService glossaryService;
	
	@RequestMapping(value="/getGlossary",method = RequestMethod.GET)
	public Map<String, String> getGlossary( ) throws Exception {
		glossaryService.myService();
        return glossaryService.getMap();
    }

}
