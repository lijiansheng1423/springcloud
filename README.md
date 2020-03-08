# springcloud
分布式框架

分布式架构调用过程中的发展历程
分布式框架基于http实现远程调用
1、通过RestTemplate工具类实现远程调用

url
服务注册与发现 nacos
基于fegin远程调用

1 导入对应的jar包
2 开始@EnableXXXX注解
3 获取DiscoveryClient对象 得到服务列表
4 发起远程调用

Fegin 伪httpClient
模拟http远程调用的方式来实现分布式调用
1
2
3 创建Service接口 @FeginClient("服务名")
创建对应的远程接口对应的方法，基于Service接口发起远程调用
