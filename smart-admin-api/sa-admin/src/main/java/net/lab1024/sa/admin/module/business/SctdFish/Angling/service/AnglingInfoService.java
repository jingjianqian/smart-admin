package net.lab1024.sa.admin.module.business.SctdFish.Angling.service;


import com.baomidou.mybatisplus.extension.service.IService;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AnglingDetail;
import net.lab1024.sa.admin.module.business.SctdFish.Angling.domain.AnglingInfo;
import net.lab1024.sa.common.common.domain.QueryPageBean;
import net.lab1024.sa.common.common.domain.Result;

/**
 * <p>
 * 钓场通知公告表 服务类
 * </p>
 *
 * @author xiaoxin
 * @since 2023年04月09日
 */
public interface AnglingInfoService extends IService<AnglingInfo> {
    /**
     * 查询所有数据,结果集以List集合返回
     * @return Result
     */
    Result queryList();

    /**
     * 根据ID查询数据,结果集以实体类对象返回
     * @return Result
     */
    Result queryById(Long Id);
    /**
     * 根据分页参数实体类进行查询,结果集以List集合返回
     * @param queryPageBean
     * @return Result
     */
    Result queryByPage(QueryPageBean queryPageBean);

    /**
     * 传入钓场通知实体类,返回响应结果
     * @param info
     * @return Result
     */
    Result add(AnglingInfo info);

    /**
     * 传入助农推广表实体类,根据实体类中的ID进行修改
     * @param info
     * @return Result
     */
    Result edit(AnglingInfo info);

    /**
     * 传入数据行id,根据id进行删除
     * @param Id
     * @return Result
     */
    Result delete(Long Id);
}
