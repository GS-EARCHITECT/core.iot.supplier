package resmetricrulemaster_mgmt.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import resmetricrulemaster_mgmt.model.dto.ResMetricRuleMaster_DTO;
import resmetricrulemaster_mgmt.service.I_ResMetricRulesMasterAdmin_Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/resMetricRuleMastersManagement")
public class ResMetricRuleMastersAdmin_Controller {

	// private static final Logger logger =
	// LoggerFactory.getLogger(ResMetricRuleMaster_Controller.class);

	@Autowired
	private I_ResMetricRulesMasterAdmin_Service resMetricRulesMasterAdminService;

	@PostMapping("/new")
	public ResponseEntity<ResMetricRuleMaster_DTO> newResMetricRuleMaster(@RequestBody ResMetricRuleMaster_DTO ResMetricRuleMasterDTO) {
		ResMetricRuleMaster_DTO ResMetricRuleMasterDTO2 = resMetricRulesMasterAdminService.newResMetricRule(ResMetricRuleMasterDTO);
		HttpHeaders httpHeaders = new HttpHeaders();
		return new ResponseEntity<>(ResMetricRuleMasterDTO2, httpHeaders, HttpStatus.CREATED);
	}

	@GetMapping(value = "/getAllResMetricRuleMasters", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ArrayList<ResMetricRuleMaster_DTO>> getAllResMetricRuleMasters() {
		ArrayList<ResMetricRuleMaster_DTO> ResMetricRuleMasterDTOs = resMetricRulesMasterAdminService.getAllResMetricRules();
		return new ResponseEntity<>(ResMetricRuleMasterDTOs, HttpStatus.OK);
	}

	@GetMapping(value = "/getSelectResMetricRuleMasters", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ArrayList<ResMetricRuleMaster_DTO>> getSelectResMetricRuleMasters(@RequestBody ArrayList<Long> ResMetricRuleMasterSeqNos) {
		ArrayList<ResMetricRuleMaster_DTO> ResMetricRuleMasterDTOs = resMetricRulesMasterAdminService.getSelectResMetricRules(ResMetricRuleMasterSeqNos);
		return new ResponseEntity<>(ResMetricRuleMasterDTOs, HttpStatus.OK);
	}

	@PutMapping("/updResMetricRuleMaster")
	public void updateResMetricRuleMaster(@RequestBody ResMetricRuleMaster_DTO ResMetricRuleMasterDTO) {
		resMetricRulesMasterAdminService.updResMetricRule(ResMetricRuleMasterDTO);
		return;
	}

	@DeleteMapping("/delSelectResMetricRuleMasters")
	public void deleteSelectResMetricRuleMasters(@RequestBody ArrayList<Long> ResMetricRuleMasterSeqNoList) {
		resMetricRulesMasterAdminService.delSelectResMetricRules(ResMetricRuleMasterSeqNoList);
		return;
	}

	@DeleteMapping("/delAllResMetricRuleMasters")
	public void deleteAllResMetricRuleMasters() {
		resMetricRulesMasterAdminService.delAllResMetricRules();
		return;
	}
}