package com.example.demo;

import com.alibaba.fescar.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Description：
 *
 * @author fangliangsheng
 * @date 2019-04-04
 */
@Service
public class StorageService {

    @Autowired
    private StorageDAO storageDAO;

    @Transactional
    public void deduct(String commodityCode, int count){
        Storage storage = storageDAO.findByCommodityCode(commodityCode);
        storage.setCount(storage.getCount()-count);

        storageDAO.save(storage);

        if (count == 5){
            throw new RuntimeException("storage branch exception");
        }
    }
}
