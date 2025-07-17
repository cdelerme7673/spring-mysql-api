package com.tutorial.rest_api_demo.controller;

import com.tutorial.rest_api_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    CloudVendor  cloudVendor;

    @GetMapping("{vendorID}")
    public CloudVendor getCloudVendor(String vendorId){
        return cloudVendor;
    }

    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "cloudVendor created successfully";
    }

    @PutMapping("{vendorId}")
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "cloudVendor updated successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendor(String vendorId){
        this.cloudVendor = null;
        return "cloudVendor deleted successfully";
    }

}
