package resmetricrulemaster_mgmt.service;

import java.util.ArrayList;
import resmetricrulemaster_mgmt.model.dto.ResMetricRuleMaster_DTO;

public interface I_ResMetricRulesMasterAdmin_Service
{
    public ResMetricRuleMaster_DTO newResMetricRule(ResMetricRuleMaster_DTO ResMetricRuleMaster_DTO);
    public ArrayList<ResMetricRuleMaster_DTO> getAllResMetricRules();
    public ArrayList<ResMetricRuleMaster_DTO> getSelectResMetricRules(ArrayList<Long> resRuleSeqNos);
    public void updResMetricRule(ResMetricRuleMaster_DTO ResMetricRuleMaster_DTO);    
    public void delAllResMetricRules();
    public void delSelectResMetricRules(ArrayList<Long> resRuleSeqNos);
  }