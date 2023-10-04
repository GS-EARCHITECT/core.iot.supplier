package resmetricmeasure_mgmt.service;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import resmetricmeasure_mgmt.model.dto.ResMetricMeasure_DTO;
import resmetricmeasure_mgmt.model.master.ResMetricMeasure;
import resmetricmeasure_mgmt.model.repo.ResMetricMeasuresAdmin_Repo;

@Service("resmetricMeasuresAdminServ")
public class ResMetricMeasureAdmin_Service implements I_ResMetricMeasuresAdmin_Service
{
	@Autowired
	public ResMetricMeasuresAdmin_Repo resmetricMeasuresAdminRepo;

	// private static final Logger logger =
	// LoggerFactory.getLogger(CostCalcServ.class);

	public ResMetricMeasure_DTO newResMetricMeasure(ResMetricMeasure_DTO lMasters) {
		ResMetricMeasure ResMetricMeasure = resmetricMeasuresAdminRepo.save(this.setResMetricMeasure(lMasters));
		lMasters = getResMetricMeasure_DTO(ResMetricMeasure);
		return lMasters;
	}

	public ArrayList<ResMetricMeasure_DTO> getAllResMetricMeasures() {
		ArrayList<ResMetricMeasure> resmetricMeasureList = (ArrayList<ResMetricMeasure>) resmetricMeasuresAdminRepo.findAll();
		ArrayList<ResMetricMeasure_DTO> lMasterss = resmetricMeasureList != null ? this.getResMetricMeasure_DTOs(resmetricMeasureList) : null;
		return lMasterss;
	}

	public ArrayList<ResMetricMeasure_DTO> getSelectResMetricMeasures(ArrayList<Long> ids) {
		ArrayList<ResMetricMeasure> lMasters = (ArrayList<ResMetricMeasure>) resmetricMeasuresAdminRepo.findAllById(ids);
		ArrayList<ResMetricMeasure_DTO> resmetricMeasureMaster_DTOs = lMasters != null ? this.getResMetricMeasure_DTOs(lMasters) : null;
		return resmetricMeasureMaster_DTOs;
	}
	
	public ArrayList<ResMetricMeasure_DTO> getSelectMeasuresByResources(ArrayList<Long> resSeqNoList) 
	{
		ArrayList<ResMetricMeasure> lMasters = (ArrayList<ResMetricMeasure>) resmetricMeasuresAdminRepo.getSelectMeasuresByResources(resSeqNoList);
		ArrayList<ResMetricMeasure_DTO> resmetricMeasureMaster_DTOs = lMasters != null ? this.getResMetricMeasure_DTOs(lMasters) : null;
		return resmetricMeasureMaster_DTOs;
	}

	public void updResMetricMeasure(ResMetricMeasure_DTO lMaster) 
	{
		ResMetricMeasure resmetricMeasureMaster = this.setResMetricMeasure(lMaster);
		if (resmetricMeasuresAdminRepo.existsById(lMaster.getUomSeqNo())) 
		{
			resmetricMeasureMaster.setResmeasureSeqNo(lMaster.getResmeasureSeqNo());
			resmetricMeasuresAdminRepo.save(resmetricMeasureMaster);
		}
		return;
	}

	public void delAllResMetricMeasures() {
		resmetricMeasuresAdminRepo.deleteAll();
	}

	public void delSelectResMetricMeasures(ArrayList<Long> resmetricMeasureSeqNos) {
		if (resmetricMeasureSeqNos != null) {
			resmetricMeasuresAdminRepo.deleteAllById(resmetricMeasureSeqNos);
		}
	}

	
	public void delSelectMeasuresByResources(ArrayList<Long> resSeqNos) 
	{
		if (resSeqNos != null) {
			resmetricMeasuresAdminRepo.delSelectMeasuresByResources(resSeqNos);
		}
	}

	
	private ArrayList<ResMetricMeasure_DTO> getResMetricMeasure_DTOs(ArrayList<ResMetricMeasure> lMasters) {
		ResMetricMeasure_DTO lDTO = null;
		ArrayList<ResMetricMeasure_DTO> lMasterDTOs = new ArrayList<ResMetricMeasure_DTO>();
		for (int i = 0; i < lMasters.size(); i++) {
			lDTO = getResMetricMeasure_DTO(lMasters.get(i));
			lMasterDTOs.add(lDTO);
		}
		return lMasterDTOs;
	}

	private ResMetricMeasure_DTO getResMetricMeasure_DTO(ResMetricMeasure lMaster) {
		ResMetricMeasure_DTO lDTO = new ResMetricMeasure_DTO();
		lDTO.setFieldSeqNo(lMaster.getFieldSeqNo());
		lDTO.setResmeasureSeqNo(lMaster.getResmeasureSeqNo());
		lDTO.setResourceSeqNo(lMaster.getResourceSeqNo());
		lDTO.setUomSeqNo(lMaster.getUomSeqNo());
		return lDTO;
	}

	private ResMetricMeasure setResMetricMeasure(ResMetricMeasure_DTO lDTO) {
		ResMetricMeasure lMaster = new ResMetricMeasure();
		lMaster.setFieldSeqNo(lDTO.getFieldSeqNo());		
		lMaster.setResourceSeqNo(lDTO.getResourceSeqNo());
		lMaster.setUomSeqNo(lDTO.getUomSeqNo());
		return lMaster;
	}

}
