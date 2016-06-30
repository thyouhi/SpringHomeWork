package pers.vic.spring.homework.entity;

/**
 *仓库坐标Model
 * @author vic.zhao
 * @since 2016年6月29日
 */
public class WarehouseLocationModel {
    /**
     * 维度
     */
    private float latitude;

    /**
     * 经度
     */
    private float longitude;

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "{" +
                "\"latitude\":" + latitude +
                ",\"longitude\":" + longitude +
                '}';
    }
}
