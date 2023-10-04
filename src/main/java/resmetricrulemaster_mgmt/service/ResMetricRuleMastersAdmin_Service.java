package resmetricrulemaster_mgmt.service;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import resmetricrulemaster_mgmt.model.dto.ResMetricRuleMaster_DTO;
import resmetricrulemaster_mgmt.model.master.ResMetricRuleMaster;
import resmetricrulemaster_mgmt.model.repo.ResMetricRuleMastersAdmin_Repo;

@Service("resmetricRuleMastersAdminServ")
public class ResMetricRuleMastersAdmin_Service implements I_ResMetricRulesMasterAdmin_Service
{
	@Autowired
	public ResMetricRuleMastersAdmin_Repo resMetricRulesMastersAdminRepo;

	// private static final Logger logger =
	// LoggerFactory.getLogger(CostCalcServ.class);

	public ResMetricRuleMaster_DTO newResMetricRule(ResMetricRuleMaster_DTO lMasters) {
		ResMetricRuleMaster ResMetricRuleMaster = resMetricRulesMastersAdminRepo.save(this.setResMetricRule(lMasters));
		lMasters = getResMetricRuleMaster_DTO(ResMetricRuleMaster);
		return lMasters;
	}

	public ArrayList<ResMetricRuleMaster_DTO> getAllResMetricRules() {
		ArrayList<ResMetricRuleMaster> resmetricRuleList = (ArrayList<ResMetricRuleMaster>) resMetricRulesMastersAdminRepo.findAll();
		ArrayList<ResMetricRuleMaster_DTO> lMasterss = resmetricRuleList != null ? this.getResMetricRuleMaster_DTOs(resmetricRuleList) : null;
		return lMasterss;
	}

	public ArrayList<ResMetricRuleMaster_DTO> getSelectResMetricRules(ArrayList<Long> ids) {
		ArrayList<ResMetricRuleMaster> lMasters = (ArrayList<ResMetricRuleMaster>) resMetricRulesMastersAdminRepo.findAllById(ids);
		ArrayList<ResMetricRuleMaster_DTO> resmetricRuleMaster_DTOs = lMasters != null ? this.getResMetricRuleMaster_DTOs(lMasters) : null;
		return resmetricRuleMaster_DTOs;
	}
	
	public void updResMetricRule(ResMetricRuleMaster_DTO lMaster) 
	{
		ResMetricRuleMaster resmetricRuleMaster = this.setResMetricRule(lMaster);
		if (resMetricRulesMastersAdminRepo.existsById(lMaster.getIotRuleSeqNo())) 
		{
			resmetricRuleMaster.setIotRuleSeqNo(lMaster.getIotRuleSeqNo());
			resMetricRulesMastersAdminRepo.save(resmetricRuleMaster);
		}
		return;
	}

	public void delAllResMetricRules() {
		resMetricRulesMastersAdminRepo.deleteAll();
	}

	public void delSelectResMetricRules(ArrayList<Long> resmetricRuleSeqNos) {
		if (resmetricRuleSeqNos != null) {
			resMetricRulesMastersAdminRepo.deleteAllById(resmetricRuleSeqNos);
		}
	}

	private ArrayList<ResMetricRuleMaster_DTO> getResMetricRuleMaster_DTOs(ArrayList<ResMetricRuleMaster> lMasters) {
		ResMetricRuleMaster_DTO lDTO = null;
		ArrayList<ResMetricRuleMaster_DTO> lMasterDTOs = new ArrayList<ResMetricRuleMaster_DTO>();
		for (int i = 0; i < lMasters.size(); i++) {
			lDTO = getResMetricRuleMaster_DTO(lMasters.get(i));
			lMasterDTOs.add(lDTO);
		}
		return lMasterDTOs;
	}

	private ResMetricRuleMaster_DTO getResMetricRuleMaster_DTO(ResMetricRuleMaster lMaster) {
		ResMetricRuleMaster_DTO lDTO = new ResMetricRuleMaster_DTO();
		lDTO.setBetweenFrom(lMaster.getBetweenFrom());
		lDTO.setBetweenTo(lMaster.getBetweenTo());
		lDTO.setDefaultProgramSeqNo(lMaster.getDefaultProgramSeqNo());
		lDTO.setExact(lMaster.getExact());
		lDTO.setIotRuleSeqNo(lMaster.getIotRuleSeqNo());
		lDTO.setLessthan(lMaster.getLessthan());
		lDTO.setMethodName(lMaster.getMethodName());
		lDTO.setMorethan(lMaster.getMorethan());
		lDTO.setNotbetweenFrom(lMaster.getNotbetweenFrom());
		lDTO.setNotbetweenTo(lMaster.getNotbetweenTo());
		lDTO.setProgramPath(lMaster.getProgramPath());
		lDTO.setRule(lMaster.getRule());
		return lDTO;
	}

	private ResMetricRuleMaster setResMetricRule(ResMetricRuleMaster_DTO lDTO) {
		ResMetricRuleMaster lMaster = new ResMetricRuleMaster();
		lMaster.setBetweenFrom(lDTO.getBetweenFrom());
		lMaster.setBetweenTo(lDTO.getBetweenTo());
		lMaster.setDefaultProgramSeqNo(lDTO.getDefaultProgramSeqNo());
		lMaster.setExact(lDTO.getExact());		
		lMaster.setLessthan(lDTO.getLessthan());
		lMaster.setMethodName(lDTO.getMethodName());
		lMaster.setMorethan(lDTO.getMorethan());
		lMaster.setNotbetweenFrom(lDTO.getNotbetweenFrom());
		lMaster.setNotbetweenTo(lDTO.getNotbetweenTo());
		lMaster.setProgramPath(lDTO.getProgramPath());
		lMaster.setRule(lDTO.getRule());
		return lMaster;
	}

}
