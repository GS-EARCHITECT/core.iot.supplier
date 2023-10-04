package resmetricmeasure_mgmt.controller;

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
import resmetricmeasure_mgmt.model.dto.ResMetricMeasure_DTO;
import resmetricmeasure_mgmt.service.I_ResMetricMeasuresAdmin_Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/resmetricMeasuresAdminManagement")
public class ResMetricMeasuresAdmin_Controller {

	// private static final Logger logger =
	// LoggerFactory.getLogger(ResMetricMeasures_Controller.class);

	@Autowired
	private I_ResMetricMeasuresAdmin_Service resmetricMeasuresAdminServ;

	@PostMapping("/new")
	public ResponseEntity<ResMetricMeasure_DTO> newResMetricMeasures(@RequestBody ResMetricMeasure_DTO ResMetricMeasuresDTO) {
		ResMetricMeasure_DTO ResMetricMeasuresDTO2 = resmetricMeasuresAdminServ.newResMetricMeasure(ResMetricMeasuresDTO);
		HttpHeaders httpHeaders = new HttpHeaders();
		return new ResponseEntity<>(ResMetricMeasuresDTO2, httpHeaders, HttpStatus.CREATED);
	}

	@GetMapping(value = "/getAllResMetricMeasures", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ArrayList<ResMetricMeasure_DTO>> getAllResMetricMeasures() {
		ArrayList<ResMetricMeasure_DTO> ResMetricMeasuresDTOs = resmetricMeasuresAdminServ.getAllResMetricMeasures();
		return new ResponseEntity<>(ResMetricMeasuresDTOs, HttpStatus.OK);
	}

	@GetMapping(value = "/getSelectResMetricMeasures", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ArrayList<ResMetricMeasure_DTO>> getSelectResMetricMeasures(@RequestBody ArrayList<Long> ResMetricMeasuresSeqNos) {
		ArrayList<ResMetricMeasure_DTO> ResMetricMeasuresDTOs = resmetricMeasuresAdminServ.getSelectResMetricMeasures(ResMetricMeasuresSeqNos);
		return new ResponseEntity<>(ResMetricMeasuresDTOs, HttpStatus.OK);
	}

	@GetMapping(value = "/getSelectMeasuresByResources", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ArrayList<ResMetricMeasure_DTO>> getSelectMeasuresByResources(@RequestBody ArrayList<Long> ResMetricMeasuresSeqNos) {
		ArrayList<ResMetricMeasure_DTO> ResMetricMeasuresDTOs = resmetricMeasuresAdminServ.getSelectMeasuresByResources(ResMetricMeasuresSeqNos);
		return new ResponseEntity<>(ResMetricMeasuresDTOs, HttpStatus.OK);
	}

	
	@PutMapping("/updResMetricMeasures")
	public void updateResMetricMeasures(@RequestBody ResMetricMeasure_DTO ResMetricMeasuresDTO) {
		resmetricMeasuresAdminServ.updResMetricMeasure(ResMetricMeasuresDTO);
		return;
	}

	@DeleteMapping("/delSelectResMetricMeasures")
	public void deleteSelectResMetricMeasures(@RequestBody ArrayList<Long> ResMetricMeasuresSeqNoList) {
		resmetricMeasuresAdminServ.delSelectResMetricMeasures(ResMetricMeasuresSeqNoList);
		return;
	}

	@DeleteMapping("/delSelectMeasuresByResources")
	public void delSelectMeasuresByResources(@RequestBody ArrayList<Long> ResMetricMeasuresSeqNoList) {
		resmetricMeasuresAdminServ.delSelectMeasuresByResources(ResMetricMeasuresSeqNoList);
		return;
	}

	
	@DeleteMapping("/delAllResMetricMeasures")
	public void deleteAllResMetricMeasures() {
		resmetricMeasuresAdminServ.delAllResMetricMeasures();
		return;
	}
}