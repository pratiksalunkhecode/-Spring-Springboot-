package com.gfg_l16_MSOA.MSOA_Iteam_service;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itemRepository extends JpaRepository<item,Integer> {


}
