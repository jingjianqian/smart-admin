package net.lab1024.sa.common.common.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 封装查询条件
 */
@Data
public class QueryPageBean implements Serializable{

    @ApiModelProperty(value = "页码(不能为空)", required = true, example = "1")
    @NotNull(message = "分页参数不能为空")
    private Integer currentPage;//页码

    @ApiModelProperty(value = "每页数量(不能为空)", required = true, example = "10")
    @NotNull(message = "每页数量不能为空")
    @Max(value = 200, message = "每页最大为200")
    private Integer pageSize;//每页记录数

    @ApiModelProperty("查询条件(可以为空)")
    protected String[] queryTerms;//查询条件


}