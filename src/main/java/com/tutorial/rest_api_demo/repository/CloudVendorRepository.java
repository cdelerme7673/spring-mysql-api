package com.tutorial.rest_api_demo.repository;

import com.tutorial.rest_api_demo.model.CloudVendorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendorModel, String> {
}
