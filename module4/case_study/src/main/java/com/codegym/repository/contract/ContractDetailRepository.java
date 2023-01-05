package com.codegym.repository.contract;

import com.codegym.dto.IContractDetailDto;
import com.codegym.model.contract.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ContractDetailRepository extends JpaRepository<ContractDetail, Integer> {
    @Query(value = "SELECT attach_facility.`name` as nameDto," +
            " attach_facility.unit as unitDto, sum(ifnull(contract_detail.quantity,0)) as quantityDto," +
            " attach_facility.service_status as statusDto, attach_facility.cost as costDto" +
            " from attach_facility join contract_detail" +
            " on attach_facility.id= contract_detail.attach_facility_id" +
            " WHERE contract_detail.contract_id=:idFind GROUP BY attach_facility.id", nativeQuery = true)
    List<IContractDetailDto> showAll(@Param("idFind") Integer id);


    @Query(value = "select attach_facility.name as nameDto,attach_facility.unit as unitDto ,attach_facility.cost as costDto," +
            " sum(ifnull(contract_detail.quantity,0)) as quantityDto from attach_facility join contract_detail on attach_facility.id =contract_detail.attach_facility_id" +
            " join contract on contract_detail.contract_id = contract.id where contract.customer_id=:id and contract_detail.status=1 group by contract_detail.attach_facility_id", nativeQuery = true)
    List<IContractDetailDto> findByCustomer(@Param("id") int id);


}
