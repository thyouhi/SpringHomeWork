package pers.vic.spring.homework.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import pers.vic.spring.homework.entity.DimensionsModel;
import pers.vic.spring.homework.entity.WarehouseLocationModel;

/**
 * 工艺品VO
 */
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class HandicraftVO {

    /**
     * id
     */
    private int id;

    /**
     * 名称
     */
    private String name;

    /**
     * 价格
     */
    private float price;

    /**
     * 标签
     */
    private String[] tags;

    /**
     * 尺寸
     */
    private DimensionsModel dimensions;

    /**
     * 仓库坐标
     */
    private WarehouseLocationModel warehouseLocation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public DimensionsModel getDimensions() {
        return dimensions;
    }

    public void setDimensions(DimensionsModel dimensions) {
        this.dimensions = dimensions;
    }

    public WarehouseLocationModel getWarehouseLocation() {
        return warehouseLocation;
    }

    public void setWarehouseLocation(WarehouseLocationModel warehouseLocation) {
        this.warehouseLocation = warehouseLocation;
    }
}
