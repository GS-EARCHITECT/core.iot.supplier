package resmetricfield_mgmt.service;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import resmetricfield_mgmt.model.dto.ResMetricField_DTO;
import resmetricfield_mgmt.model.master.ResMetricField;
import resmetricfield_mgmt.model.repo.ResMetricFieldsAdmin_Repo;

@Service("resmetricFieldAdminServ")
public class ResMetricFieldsAdmin_Service implements I_ResMetricFieldsAdmin_Service
{
	@Autowired
	public ResMetricFieldsAdmin_Repo resmetricFieldsAdminRepo;

	// private static final Logger logger =
	// LoggerFactory.getLogger(CostCalcServ.class);

	public ResMetricField_DTO newResMetricField(ResMetricField_DTO lMasters) 
	{
		ResMetricField ResMetricField = resmetricFieldsAdminRepo.save(this.setResMetricField(lMasters));
		lMasters = getResMetricField_DTO(ResMetricField);
		return lMasters;
	}

	public ArrayList<ResMetricField_DTO> getAllResMetricFields() {
		ArrayList<ResMetricField> resmetricFieldList = (ArrayList<ResMetricField>) resmetricFieldsAdminRepo.findAll();
		ArrayList<ResMetricField_DTO> lMasterss = resmetricFieldList != null ? this.getResMetricField_DTOs(resmetricFieldList) : null;
		return lMasterss;
	}

	public ArrayList<ResMetricField_DTO> getSelectResMetricFields(ArrayList<Long> ids) {
		ArrayList<ResMetricField> lMasters = (ArrayList<ResMetricField>) resmetricFieldsAdminRepo.findAllById(ids);
		ArrayList<ResMetricField_DTO> resmetricField_DTOs = lMasters != null ? this.getResMetricField_DTOs(lMasters) : null;
		return resmetricField_DTOs;
	}
	
	public void updResMetricField(ResMetricField_DTO lMaster) 
	{
		ResMetricField resmetricField = this.setResMetricField(lMaster);
		if (resmetricFieldsAdminRepo.existsById(lMaster.getFieldSeqNo())) 
		{
			resmetricField.setFieldSeqNo(lMaster.getFieldSeqNo());
			resmetricFieldsAdminRepo.save(resmetricField);
		}
		return;
	}

	public void delAllResMetricFields() {
		resmetricFieldsAdminRepo.deleteAll();
	}

	public void delSelectResMetricFields(ArrayList<Long> resmetricFieldSeqNos) {
		if (resmetricFieldSeqNos != null) {
			resmetricFieldsAdminRepo.deleteAllById(resmetricFieldSeqNos);
		}
	}

	private ArrayList<ResMetricField_DTO> getResMetricField_DTOs(ArrayList<ResMetricField> lMasters) {
		ResMetricField_DTO lDTO = null;
		ArrayList<ResMetricField_DTO> lMasterDTOs = new ArrayList<ResMetricField_DTO>();
		for (int i = 0; i < lMasters.size(); i++) {
			lDTO = getResMetricField_DTO(lMasters.get(i));
			lMasterDTOs.add(lDTO);
		}
		return lMasterDTOs;
	}

	private ResMetricField_DTO getResMetricField_DTO(ResMetricField lMaster) {
		ResMetricField_DTO lDTO = new ResMetricField_DTO();
		lDTO.setFieldSeqNo(lMaster.getFieldSeqNo());
		lDTO.setFieldname(lMaster.getFieldname());		
		return lDTO;
	}

	private ResMetricField setResMetricField(ResMetricField_DTO lDTO) {
		ResMetricField lMaster = new ResMetricField();
		lMaster.setFieldname(lDTO.getFieldname());
		return lMaster;
	}

}
