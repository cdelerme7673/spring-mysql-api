package com.tutorial.rest_api_demo.controller;

import com.tutorial.rest_api_demo.model.CloudVendorModel;
import com.tutorial.rest_api_demo.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendorId}")
    public CloudVendorModel getCloudVendor(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.getCloudVendor(vendorId);
    }

    @GetMapping()
    public List<CloudVendorModel> getAllCloudVendors(){
        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendorModel cloudVendorModel){
        cloudVendorService.createCloudVendor(cloudVendorModel);
        return "cloudVendorModel created successfully";
    }

    @PutMapping()
    public String updateCloudVendor(@RequestBody CloudVendorModel cloudVendorModel){
        cloudVendorService.updateCloudVendor(cloudVendorModel);
        return "cloudVendorModel updated successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendor(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
        return "cloudVendor deleted successfully";
    }

}
