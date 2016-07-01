version 1.0

数据类型：
    数据类型分析：
    1.经过分析，本题目的API可能是使用get请求在获取一个“工艺品列表”，供前段展示用。
    2.持久层应该有三个对象“工艺品”、“尺寸”、“仓库坐标”。
    3.由于本题目没有和数据库的交互，所以“工艺品”只声明一个VO供前后端交互用
    4.考虑到程序的扩展性，为了方便今后将项目扩展为何数据库有交互的项目，故将“尺寸”、“仓库坐标”定义为持久层Model，供今后扩展。

    数据类型定义：
    1.定义一个VO：HandicraftVO
    2.定义两个Model:DimensionsModel，WarehouseLocationModel,它们HandicraftVO是聚合关系

系统结构:
    1.控制层使用springmvc实现。
    2.逻辑层使用service实现。
    3.文件读取代替了数据库访问层。

构建工具：Gradle
        使用 gradle appStart 启动应用
        使用 gradle appStop 关闭应用
        使用 gradle check 执行单元测试

版本管理工具：git

开发工具：IntelliJ IDEA 2016

PS：此版本只是针对题目的一个纯净版本，今后有需求会持续优化和更新。

