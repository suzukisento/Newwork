package com.as.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "goods")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ToString
public class Goods {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer goodsId;

    private String goodsName;

    private String goodsImg;

    private Double goodsPrice;

    private Integer goodsNum;

    private Integer goodsType;

}