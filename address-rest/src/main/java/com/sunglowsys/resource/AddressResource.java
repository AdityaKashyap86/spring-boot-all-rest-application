package com.sunglowsys.resource;

import com.sunglowsys.domain.Address;
import com.sunglowsys.service.AddressService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class AddressResource {

    private final AddressService addressService;

    public AddressResource(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/addresses")
    public ResponseEntity<Address> createEmployee(@RequestBody Address address) {
        Address result = addressService.save (address);
        return ResponseEntity.status (HttpStatus.OK).body (result);
    }

    @PutMapping("/addresses/{id}")
    public ResponseEntity<Address> updateEmployee(@RequestBody Address address) {
        Address result = addressService.update (address);
        return ResponseEntity.status (HttpStatus.OK).body (result);
    }

    @GetMapping("/addresses")
    public ResponseEntity<Page<Address>> getAllAddresses() {
        Page<Address> result = addressService.findAll (PageRequest.of (0,3));
        return ResponseEntity.status (HttpStatus.OK).body (result);
    }

    @GetMapping("/addresses/{id}")
    public ResponseEntity<Address> getById(@PathVariable Long id) {
        Address result = addressService.findOne(id).get ();
        return ResponseEntity.ok ().body (result);
    }

    //public ResponseEntity<Address> deleteAddress
}
