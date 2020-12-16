## 绿点加速器 android 客户端

### 说明

这个项目是 2017 年写的，当时花了点时间自学了 android 开发，然后因为市面上的各种加速器都不好用，严重阻碍了访问P站进行学习交流，就自己弄了一个。

最初这个项目，单独创建了一个组织叫 greenuuu，是放在：[https://github.com/greenuuu/greendot-android](https://github.com/greenuuu/greendot-android) 这里的。最近突然想把这些年完成的项目都归整起来放到一个地方，于是就有了这次迁移。

### 截图

> 如截图无法加载请开启FQ软件。

登录页：

<img src="https://github.com/GG4mida/greendot-client-android/blob/main/screen/login.png?raw=true" width="360" alt="登录页"/>

首页：

<img src="https://github.com/GG4mida/greendot-client-android/blob/main/screen/home.png?raw=true" width="360" alt="首页"/>

### 介绍

该客户端启动后，会从远程服务器拉取节点列表，而节点本身，其实就是通过 ss 搭建的服务。成功拉取节点后，启动加速服务，其实就是运行 LocalVpnService 这个服务，这里不再详述，感兴趣的可以直接看代码。

### 注意

- 代码仅供参考，本地肯定是跑不起来的（因为没有远程接口服务）。
- 时间来到了2020年，加速器等相关软件属于国家明令禁止的，请勿将代码应用于商业用途。