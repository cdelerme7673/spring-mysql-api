package com.tutorial.rest_api_demo.controller;

import com.tutorial.rest_api_demo.model.CloudVendor;
import com.tutorial.rest_api_demo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorServiceController {
    CloudVendorService cloudVendorService;

    public CloudVendorServiceController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendor(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.getCloudVendor(vendorId);
    }

    @GetMapping()
    public List<CloudVendor> getAllCloudVendors(){
        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "cloudVendor created successfully";
    }

    @PutMapping()
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "cloudVendor updated successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendor(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
        return "cloudVendor deleted successfully";
    }

}
