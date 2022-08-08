package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Address;
import net.javaguides.springboot.model.Skills;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface AddressService {
    List<Address> getAllAddress();
    Address createAddress(@RequestBody Address address);
}
