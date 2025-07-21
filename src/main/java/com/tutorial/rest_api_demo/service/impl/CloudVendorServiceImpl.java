package com.tutorial.rest_api_demo.service.impl;

import com.tutorial.rest_api_demo.model.CloudVendorModel;
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
    public String createCloudVendor(CloudVendorModel cloudVendorModel) {
        // < Additional business logic goes here >
        cloudVendorRepository.save(cloudVendorModel);
        return "Cloud Vendor created successfully.";
    }

    @Override
    public String updateCloudVendor(CloudVendorModel cloudVendorModel) {
        // < Additional business logic goes here >
        cloudVendorRepository.save(cloudVendorModel);
        return "Cloud Vendor updated successfully.";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        // < Additional business logic goes here >
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Cloud Vendor deleted successfully.";
    }

    @Override
    public CloudVendorModel getCloudVendor(String cloudVendorId) {
        // < Additional business logic goes here >
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendorModel> getAllCloudVendors() {
        // < Additional business logic goes here >
        return  cloudVendorRepository.findAll();
    }
}
