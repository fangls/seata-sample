package com.example.cloud;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Description：
 *
 * @author fangliangsheng
 * @date 2019/3/28
 */
public interface AccountDAO extends JpaRepository<Account,Long> {

    Account findByUserId(String userId);

}
