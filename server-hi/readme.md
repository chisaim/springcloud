一个service-hi,对外暴露hi接口；
一个service-miya,对外暴露miya接口；
这两个service可以相互调用,并且只有调用了，server-zipkin才会收集数据的，这就是为什么叫服务追踪了。