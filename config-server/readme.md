在Spring Cloud中，有分布式配置中心组件spring cloud config ，它支持配置服务放在配置服务的内存中（即本地），也支持放在远程Git仓库中。在spring cloud config 组件中，分两个角色，一是config server，二是config client

远程仓库https://github.com/chisaim/SpringcloudConfig-/ 中有个文件config-client-dev.properties文件中有一个属性：

foo = foo version 3

启动程序：访问http://localhost:8888/foo/dev

{"name":"foo","profiles":["dev"],"label":"master",
"version":"792ffc77c03f4b138d28e89b576900ac5e01a44b","state":null,"propertySources":[]}
证明配置服务中心可以从远程程序获取配置信息。