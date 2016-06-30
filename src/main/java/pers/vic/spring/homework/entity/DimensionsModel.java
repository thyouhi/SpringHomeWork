package pers.vic.spring.homework.entity;

/**
 * 尺寸详细Model
 * @author vic.zhao
 * @since 2016年6月29日
 */
public class DimensionsModel{

    /**
     * 长度
     */
    private float length;

    /**
     * 宽度
     */
    private float width;

    /**
     * 高度
     */
    private float height;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "{" +
                "\"length\":" + length +
                ",\"width\":" + width +
                ",\"height\":" + height +
                '}';
    }
}
