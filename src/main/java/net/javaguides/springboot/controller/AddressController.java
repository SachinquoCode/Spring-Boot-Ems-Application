package net.javaguides.springboot.controller;

import net.javaguides.springboot.model.Address;
import net.javaguides.springboot.service.AddressService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class AddressController {

    private AddressService addressService;

    //    @Autowired
    public AddressController(AddressService addressService) {
        super();
        this.addressService = addressService;
    }

    @GetMapping
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }
    //     build create employee Rest API
    @PostMapping
    public ResponseEntity<Address> createAddress(@RequestBody Address address){
        System.out.println("hello");
        return new ResponseEntity<Address>(addressService.createAddress(address), HttpStatus.CREATED);
    }
}
