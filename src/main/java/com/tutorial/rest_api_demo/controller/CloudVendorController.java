package com.tutorial.rest_api_demo.controller;

import com.tutorial.rest_api_demo.model.CloudVendorModel;
import com.tutorial.rest_api_demo.response.ResponseHandler;
import com.tutorial.rest_api_demo.service.CloudVendorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Object> getCloudVendor(@PathVariable("vendorId") String vendorId){
        // return cloudVendorService.getCloudVendor(vendorId);
        return ResponseHandler.responseBuilder(
            "Requested cloud vendor data retrieved succesfully",
            HttpStatus.OK,
            cloudVendorService.getCloudVendor(vendorId)
        );
    }

    @GetMapping()
    public List<CloudVendorModel> getAllCloudVendors(){
        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping
    public ResponseEntity<Object> createCloudVendor(@RequestBody CloudVendorModel cloudVendorModel){
        cloudVendorService.createCloudVendor(cloudVendorModel);
        // return "cloudVendorModel created successfully";
        return ResponseHandler.responseBuilder(
                "Cloud Vendor created successfully.",
                HttpStatus.OK,
                cloudVendorModel
        );
    }

    @PutMapping()
    public ResponseEntity<Object> updateCloudVendor(@RequestBody CloudVendorModel cloudVendorModel){
        cloudVendorService.updateCloudVendor(cloudVendorModel);
        // return "cloudVendorModel updated successfully.";
        return ResponseHandler.responseBuilder(
                "Cloud Vendor updated successfully.",
                HttpStatus.OK,
                cloudVendorModel
        );
    }

    @DeleteMapping("{vendorId}")
    public ResponseEntity<Object> deleteCloudVendor(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
//        return "cloudVendor deleted successfully.";
        return ResponseHandler.responseBuilder(
                "Cloud Vendor deleted successfully.",
                HttpStatus.OK,
                null
        );
    }

}
