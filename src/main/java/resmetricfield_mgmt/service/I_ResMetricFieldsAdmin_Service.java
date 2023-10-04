package resmetricfield_mgmt.service;

import java.util.ArrayList;
import resmetricfield_mgmt.model.dto.ResMetricField_DTO;

public interface I_ResMetricFieldsAdmin_Service
{
    public ResMetricField_DTO newResMetricField(ResMetricField_DTO ResMetricField_DTO);
    public ArrayList<ResMetricField_DTO> getAllResMetricFields();
    public ArrayList<ResMetricField_DTO> getSelectResMetricFields(ArrayList<Long> uomSeqNos);
    public void updResMetricField(ResMetricField_DTO ResMetricField_DTO);    
    public void delAllResMetricFields();
    public void delSelectResMetricFields(ArrayList<Long> uomSeqNos);	
  }