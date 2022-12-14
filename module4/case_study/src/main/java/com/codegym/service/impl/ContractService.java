package com.codegym.service.impl;

import com.codegym.dto.IContractDto;
import com.codegym.model.contract.AttachFacility;
import com.codegym.model.contract.Contract;
import com.codegym.repository.contract.AttachFacilityRepository;
import com.codegym.repository.contract.ContractRepository;
import com.codegym.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService implements IContractService {
    @Autowired
    private ContractRepository contractRepository;
    @Autowired
    AttachFacilityRepository attachFacilityRepository;


    @Override
    public Page<IContractDto> showListContract(Pageable pageable) {
        return contractRepository.showListContract(pageable);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }


    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }

    @Override
    public List<AttachFacility> findAllAttachFacility() {
        return attachFacilityRepository.findAll();

    }
}
