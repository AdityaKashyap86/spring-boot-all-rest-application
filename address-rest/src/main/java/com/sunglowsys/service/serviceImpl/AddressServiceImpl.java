package com.sunglowsys.service.serviceImpl;

import com.sunglowsys.domain.Address;
import com.sunglowsys.repository.AddressRepository;
import com.sunglowsys.service.AddressService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }


    @Override
    public Address save(Address address) {
        return addressRepository.save (address) ;
    }

    @Override
    public Address update(Address address) {
        return addressRepository.save (address);
    }

    @Override
    public Page<Address> findAll(Pageable pageable) {
        return addressRepository.findAll (pageable);
    }

    @Override
    public Optional<Address> findOne(Long id) {
        return addressRepository.findById (id);
    }

    @Override
    public void delete(Long id) {
        addressRepository.deleteById (id);

    }
}
