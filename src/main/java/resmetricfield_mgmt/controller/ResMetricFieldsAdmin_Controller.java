package resmetricfield_mgmt.controller;

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
import resmetricfield_mgmt.model.dto.ResMetricField_DTO;
import resmetricfield_mgmt.service.I_ResMetricFieldsAdmin_Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/resmetricFieldsAdminManagement")
public class ResMetricFieldsAdmin_Controller {

	// private static final Logger logger =
	// LoggerFactory.getLogger(ResMetricField_Controller.class);

	@Autowired
	private I_ResMetricFieldsAdmin_Service resmetricFieldsAdminServ;

	@PostMapping("/new")
	public ResponseEntity<ResMetricField_DTO> newResMetricField(@RequestBody ResMetricField_DTO ResMetricFieldDTO) {
		ResMetricField_DTO ResMetricFieldDTO2 = resmetricFieldsAdminServ.newResMetricField(ResMetricFieldDTO);
		HttpHeaders httpHeaders = new HttpHeaders();
		return new ResponseEntity<>(ResMetricFieldDTO2, httpHeaders, HttpStatus.CREATED);
	}

	@GetMapping(value = "/getAllResMetricFields", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ArrayList<ResMetricField_DTO>> getAllResMetricFields() {
		ArrayList<ResMetricField_DTO> ResMetricFieldDTOs = resmetricFieldsAdminServ.getAllResMetricFields();
		return new ResponseEntity<>(ResMetricFieldDTOs, HttpStatus.OK);
	}

	@GetMapping(value = "/getSelectResMetricFields", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ArrayList<ResMetricField_DTO>> getSelectResMetricFields(
			@RequestBody ArrayList<Long> ResMetricFieldSeqNos) {
		ArrayList<ResMetricField_DTO> ResMetricFieldDTOs = resmetricFieldsAdminServ
				.getSelectResMetricFields(ResMetricFieldSeqNos);
		return new ResponseEntity<>(ResMetricFieldDTOs, HttpStatus.OK);
	}

	@PutMapping("/updResMetricField")
	public void updateResMetricField(@RequestBody ResMetricField_DTO ResMetricFieldDTO) {
		resmetricFieldsAdminServ.updResMetricField(ResMetricFieldDTO);
		return;
	}

	@DeleteMapping("/delSelectResMetricFields")
	public void deleteSelectResMetricFields(@RequestBody ArrayList<Long> ResMetricFieldSeqNoList) {
		resmetricFieldsAdminServ.delSelectResMetricFields(ResMetricFieldSeqNoList);
		return;
	}

	@DeleteMapping("/delAllResMetricFields")
	public void deleteAllResMetricFields() {
		resmetricFieldsAdminServ.delAllResMetricFields();
		return;
	}
}