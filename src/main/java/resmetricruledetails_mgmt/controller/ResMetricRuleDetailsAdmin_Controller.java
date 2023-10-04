package resmetricruledetails_mgmt.controller;

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
import resmetricruledetails_mgmt.model.dto.ResMetricRuleDetail_DTO;
import resmetricruledetails_mgmt.service.I_ResMetricRuleDetailsAdmin_Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/resMetricRuleDetailsManagement")
public class ResMetricRuleDetailsAdmin_Controller {

	// private static final Logger logger =
	// LoggerFactory.getLogger(ResMetricRuleDetail_Controller.class);

	@Autowired
	private I_ResMetricRuleDetailsAdmin_Service resMetricRuleDetailsAdminService;

	@PostMapping("/new")
	public ResponseEntity<ResMetricRuleDetail_DTO> newResMetricRuleDetail(@RequestBody ResMetricRuleDetail_DTO ResMetricRuleDetailDTO) {
		ResMetricRuleDetail_DTO ResMetricRuleDetailDTO2 = resMetricRuleDetailsAdminService.newResMetricRuleDetail(ResMetricRuleDetailDTO);
		HttpHeaders httpHeaders = new HttpHeaders();
		return new ResponseEntity<>(ResMetricRuleDetailDTO2, httpHeaders, HttpStatus.CREATED);
	}

	@GetMapping(value = "/getAllResMetricRuleDetails", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ArrayList<ResMetricRuleDetail_DTO>> getAllResMetricRuleDetails() {
		ArrayList<ResMetricRuleDetail_DTO> ResMetricRuleDetailDTOs = resMetricRuleDetailsAdminService.getAllResMetricRuleDetails();
		return new ResponseEntity<>(ResMetricRuleDetailDTOs, HttpStatus.OK);
	}

	@GetMapping(value = "/getSelectResMetricRuleDetails", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ArrayList<ResMetricRuleDetail_DTO>> getSelectResMetricRuleDetails(@RequestBody ArrayList<Long> ResMetricRuleDetailSeqNos) {
		ArrayList<ResMetricRuleDetail_DTO> ResMetricRuleDetailDTOs = resMetricRuleDetailsAdminService.getSelectResMetricRuleDetails(ResMetricRuleDetailSeqNos);
		return new ResponseEntity<>(ResMetricRuleDetailDTOs, HttpStatus.OK);
	}

	@PutMapping("/updResMetricRuleDetail")
	public void updateResMetricRuleDetail(@RequestBody ResMetricRuleDetail_DTO ResMetricRuleDetailDTO) {
		resMetricRuleDetailsAdminService.updResMetricRuleDetail(ResMetricRuleDetailDTO);
		return;
	}

	@DeleteMapping("/delSelectResMetricRuleDetails")
	public void deleteSelectResMetricRuleDetails(@RequestBody ArrayList<Long> ResMetricRuleDetailSeqNoList) {
		resMetricRuleDetailsAdminService.delSelectResMetricRuleDetails(ResMetricRuleDetailSeqNoList);
		return;
	}

	@DeleteMapping("/delAllResMetricRuleDetails")
	public void deleteAllResMetricRuleDetails() {
		resMetricRuleDetailsAdminService.delAllResMetricRuleDetails();
		return;
	}
}