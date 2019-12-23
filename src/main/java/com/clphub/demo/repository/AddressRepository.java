package com.clphub.demo.repository;

import com.clphub.demo.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {

    List<Address> getByUbani(String ubani);
    List<Address> getByStreetName(String streetName);

}
