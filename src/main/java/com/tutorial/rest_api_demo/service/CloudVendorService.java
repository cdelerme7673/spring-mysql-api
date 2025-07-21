package com.tutorial.rest_api_demo.service;

import com.tutorial.rest_api_demo.model.CloudVendorModel;
import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendorModel cloudVendorModel);
    public String updateCloudVendor(CloudVendorModel cloudVendorModel);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendorModel getCloudVendor(String cloudVendorId);
    public List<CloudVendorModel> getAllCloudVendors();
}
