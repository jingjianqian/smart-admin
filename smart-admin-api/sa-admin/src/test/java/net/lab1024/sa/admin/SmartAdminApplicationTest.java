package net.lab1024.sa.admin;

import net.lab1024.sa.admin.module.business.SctdFish.Angling.service.AgriculturalPromotionService;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.service.AnglingDetailService;
import net.lab1024.sa.common.common.domain.QueryPageBean;
import net.lab1024.sa.common.common.domain.Result;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SmartAdminApplicationTest {

    @Autowired
    private AnglingDetailService Service;
    @BeforeEach
    public void before() {
        System.out.println("----------------------- 测试开始 -----------------------");

    }
    @Test
    public void Test(){
        QueryPageBean queryPageBean = new QueryPageBean(1, 10, new String[]{"南宁市",""});
        Result result = Service.queryByPage(queryPageBean);
        System.out.println(result);
    }

    @AfterEach
    public void after() {
        System.out.println("----------------------- 测试结束 -----------------------");
    }

}

