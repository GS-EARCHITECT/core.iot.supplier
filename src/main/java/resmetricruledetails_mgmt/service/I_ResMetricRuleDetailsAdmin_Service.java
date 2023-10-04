package resmetricruledetails_mgmt.service;

import java.util.ArrayList;
import resmetricruledetails_mgmt.model.dto.ResMetricRuleDetail_DTO;

public interface I_ResMetricRuleDetailsAdmin_Service
{
    public ResMetricRuleDetail_DTO newResMetricRuleDetail(ResMetricRuleDetail_DTO ResMetricRuleDetail_DTO);
    public ArrayList<ResMetricRuleDetail_DTO> getAllResMetricRuleDetails();
    public ArrayList<ResMetricRuleDetail_DTO> getSelectResMetricRuleDetails(ArrayList<Long> resRuleSeqNos);
    public void updResMetricRuleDetail(ResMetricRuleDetail_DTO ResMetricRuleDetail_DTO);    
    public void delAllResMetricRuleDetails();
    public void delSelectResMetricRuleDetails(ArrayList<Long> resRuleSeqNos);
  }