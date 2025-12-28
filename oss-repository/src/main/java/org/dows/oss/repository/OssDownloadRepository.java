package org.dows.oss.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.oss.entity.OssDownloadEntity;
import org.dows.oss.dao.OssDownloadDao;

@Component
public class OssDownloadRepository  extends CrudRepository<OssDownloadDao,OssDownloadEntity> {

}