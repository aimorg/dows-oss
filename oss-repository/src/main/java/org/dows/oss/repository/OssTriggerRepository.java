package org.dows.oss.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.oss.entity.OssTriggerEntity;
import org.dows.oss.dao.OssTriggerDao;

@Component
public class OssTriggerRepository  extends CrudRepository<OssTriggerDao,OssTriggerEntity> {

}