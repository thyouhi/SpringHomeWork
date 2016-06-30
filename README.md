version 1.0

数据类型：
    数据类型分析：
    1.题目中给出的json字符串模板可能是由一个“工艺品”集合转换而成。
    2.“工艺品”中的属性“尺寸”和“仓库坐标”不是简单类型，可以分别封装成2个对象。
    3.本题目虽然没有和数据库的交互，但真是的程序应该是和数据库有交互的，所以大部分数据类型都需要对应一张表。
    4.为了方便将来扩展为可跟数据库交互的程序，分别定义了pers.vic.spring.homework.entity包和pers.vic.spring.homework.vo包,
      这两个包分别存放了数据库持久层对象和供前后端交互的vo对象

    数据类型定义：
    1.定义一个VO：HandicraftVO
    2.定义两个Model:DimensionsModel，WarehouseLocationModel,它们HandicraftVO是聚合关系

系统结构
    1.控制层使用springmvc实现。
    2.逻辑层使用service实现。
    3.文件读取代替了数据库访问层。

构建工具：Gradle

版本管理工具：版本管理工具git

开发工具：IntelliJ IDEA 2016

PS：此版本只是针对题目的一个纯净版本，今后有需求会持续优化和更新。

