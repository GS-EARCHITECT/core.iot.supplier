package resmetricruledetails_mgmt.service;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import resmetricruledetails_mgmt.model.dto.ResMetricRuleDetail_DTO;
import resmetricruledetails_mgmt.model.master.ResMetricRuleDetail;
import resmetricruledetails_mgmt.model.repo.ResMetricRuleDetailsAdmin_Repo;

@Service("resmetricRuleDetailsAdminServ")
public class ResMetricRuleDetailsAdmin_Service implements I_ResMetricRuleDetailsAdmin_Service
{
	@Autowired
	public ResMetricRuleDetailsAdmin_Repo resMetricRuleDetailsAdminRepo;

	// private static final Logger logger =
	// LoggerFactory.getLogger(CostCalcServ.class);

	public ResMetricRuleDetail_DTO newResMetricRuleDetail(ResMetricRuleDetail_DTO lDetails) {
		ResMetricRuleDetail ResMetricRuleDetail = resMetricRuleDetailsAdminRepo.save(this.setResMetricRule(lDetails));
		lDetails = getResMetricRuleDetail_DTO(ResMetricRuleDetail);
		return lDetails;
	}

	public ArrayList<ResMetricRuleDetail_DTO> getAllResMetricRuleDetails() {
		ArrayList<ResMetricRuleDetail> resmetricRuleList = (ArrayList<ResMetricRuleDetail>) resMetricRuleDetailsAdminRepo.findAll();
		ArrayList<ResMetricRuleDetail_DTO> lDetailss = resmetricRuleList != null ? this.getResMetricRuleDetail_DTOs(resmetricRuleList) : null;
		return lDetailss;
	}

	public ArrayList<ResMetricRuleDetail_DTO> getSelectResMetricRuleDetails(ArrayList<Long> ids) {
		ArrayList<ResMetricRuleDetail> lDetails = (ArrayList<ResMetricRuleDetail>) resMetricRuleDetailsAdminRepo.findAllById(ids);
		ArrayList<ResMetricRuleDetail_DTO> resmetricRuleDetail_DTOs = lDetails != null ? this.getResMetricRuleDetail_DTOs(lDetails) : null;
		return resmetricRuleDetail_DTOs;
	}
	
	public void updResMetricRuleDetail(ResMetricRuleDetail_DTO lDetail) 
	{
		ResMetricRuleDetail resmetricRuleDetail = this.setResMetricRule(lDetail);
		if (resMetricRuleDetailsAdminRepo.existsById(lDetail.getResMetricRuleLineSeqNo())) 
		{
			resmetricRuleDetail.setResMetricRuleLineSeqNo(lDetail.getResMetricRuleLineSeqNo());
			resMetricRuleDetailsAdminRepo.save(resmetricRuleDetail);
		}
		return;
	}

	public void delAllResMetricRuleDetails() {
		resMetricRuleDetailsAdminRepo.deleteAll();
	}

	public void delSelectResMetricRuleDetails(ArrayList<Long> resmetricRuleSeqNos) {
		if (resmetricRuleSeqNos != null) {
			resMetricRuleDetailsAdminRepo.deleteAllById(resmetricRuleSeqNos);
		}
	}

	private ArrayList<ResMetricRuleDetail_DTO> getResMetricRuleDetail_DTOs(ArrayList<ResMetricRuleDetail> lDetails) {
		ResMetricRuleDetail_DTO lDTO = null;
		ArrayList<ResMetricRuleDetail_DTO> lDetailDTOs = new ArrayList<ResMetricRuleDetail_DTO>();
		for (int i = 0; i < lDetails.size(); i++) {
			lDTO = getResMetricRuleDetail_DTO(lDetails.get(i));
			lDetailDTOs.add(lDTO);
		}
		return lDetailDTOs;
	}

	private ResMetricRuleDetail_DTO getResMetricRuleDetail_DTO(ResMetricRuleDetail lDetail) {
		ResMetricRuleDetail_DTO lDTO = new ResMetricRuleDetail_DTO();
		lDTO.setCustomMethodName(lDetail.getCustomMethodName());
		lDTO.setCustomProgramName(lDetail.getCustomProgramName());
		lDTO.setFullpath(lDetail.getFullpath());
		lDTO.setResmeasureSeqNo(lDetail.getResmeasureSeqNo());
		lDTO.setResMetricRuleLineSeqNo(lDetail.getResMetricRuleLineSeqNo());
		lDTO.setRuleSeqNo(lDetail.getRuleSeqNo());		
		return lDTO;
	}

	private ResMetricRuleDetail setResMetricRule(ResMetricRuleDetail_DTO lDTO) {
		ResMetricRuleDetail lDetail = new ResMetricRuleDetail();
		lDetail.setCustomMethodName(lDTO.getCustomMethodName());
		lDetail.setCustomProgramName(lDTO.getCustomProgramName());
		lDetail.setFullpath(lDTO.getFullpath());
		lDetail.setResmeasureSeqNo(lDTO.getResmeasureSeqNo());		
		lDetail.setRuleSeqNo(lDTO.getRuleSeqNo());
		return lDetail;
	}

}
