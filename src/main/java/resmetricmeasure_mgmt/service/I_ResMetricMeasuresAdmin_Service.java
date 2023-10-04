package resmetricmeasure_mgmt.service;

import java.util.ArrayList;

import resmetricmeasure_mgmt.model.dto.ResMetricMeasure_DTO;

public interface I_ResMetricMeasuresAdmin_Service
{
    public ResMetricMeasure_DTO newResMetricMeasure(ResMetricMeasure_DTO ResMetricMeasure_DTO);
    public ArrayList<ResMetricMeasure_DTO> getAllResMetricMeasures();
    public ArrayList<ResMetricMeasure_DTO> getSelectResMetricMeasures(ArrayList<Long> uomSeqNos);
	public ArrayList<ResMetricMeasure_DTO> getSelectMeasuresByResources(ArrayList<Long> resSeqNoList);
    public void updResMetricMeasure(ResMetricMeasure_DTO ResMetricMeasure_DTO);    
    public void delAllResMetricMeasures();
    public void delSelectResMetricMeasures(ArrayList<Long> uomSeqNos);
	public void delSelectMeasuresByResources(ArrayList<Long> resSeqNoList);
  }