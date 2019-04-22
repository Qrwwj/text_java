package com.swc.service.AddressService;

import com.swc.dao.AddressDao;
import com.swc.pojo.Address;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AddressServiceImpl implements IAddressService{
    @Resource
    private AddressDao addressDao;
    @Override
    public List<Address> getAddress() {
        return addressDao.getAddress();
    }

    @Override
    public int deleteAddress(int id) {
        return addressDao.deleteAddress(id);
    }

    @Override
    public Address selectone(int id) {
        return addressDao.selectone(id);
    }

    @Override
    public int updateAddress(Address address) {
        return addressDao.updateAddress(address);
    }
}
