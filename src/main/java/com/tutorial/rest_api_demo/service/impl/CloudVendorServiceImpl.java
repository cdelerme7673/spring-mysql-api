package com.tutorial.rest_api_demo.service.impl;

import com.tutorial.rest_api_demo.model.CloudVendor;
import com.tutorial.rest_api_demo.repository.CloudVendorRepository;
import com.tutorial.rest_api_demo.service.CloudVendorService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }
    // All returned data values are passed to the Controller layer...

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        // < Additional business logic goes here >
        cloudVendorRepository.save(cloudVendor);
        return "Cloud Vendor created successfully.";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        // < Additional business logic goes here >
        cloudVendorRepository.save(cloudVendor);
        return "Cloud Vendor updated successfully.";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        // < Additional business logic goes here >
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Cloud Vendor deleted successfully.";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        // < Additional business logic goes here >
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        // < Additional business logic goes here >
        return  cloudVendorRepository.findAll();
    }
}
