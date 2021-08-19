package com.zmops.iot.domain.product;

import com.zmops.iot.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author nantian created at 2021/8/11 17:02
 */

@Getter
@Setter
@Entity
@Table(name = "product_status_function")
public class ProductStatusFunction extends BaseEntity {

    @Id
    private Long triggerId;

    private Integer zbxId;

    private String ruleType;

    private String fuleFunction;

    private String ruleValue;

    private Integer ruleStatus;
}
