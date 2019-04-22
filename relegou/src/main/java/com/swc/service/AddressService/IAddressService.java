package com.swc.service.AddressService;

import com.swc.pojo.Address;

import java.util.List;

public interface IAddressService {
    public List<Address> getAddress();
    public int deleteAddress(int id);
    public Address selectone(int id);
    public int updateAddress(Address address);
}
