package in.ashokit.service;

import java.util.List;

import in.ashokit.dto.EnqFilterRequestDto;
import in.ashokit.dto.EnquiryDto;
import in.ashokit.entities.Course;
import in.ashokit.entities.Enquiry;

public interface EnquiryService {
	
	public List<Course> getCourses();

	public boolean insertEnquiry(EnquiryDto enquiryDto, Integer counsellorId);

	public List<Enquiry> getAllEnquiries(Integer counsellorId);

	public List<Enquiry> getEnquiriesWithFilter(EnqFilterRequestDto filterDto, Integer counsellorId);

	public Enquiry getEnquiry(Integer enqId);

	public boolean updateEnquiry(EnquiryDto enquiry);

}
