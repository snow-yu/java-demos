# java-demos
java学习使用样例



## github提交问题列表

### kex_exchange_identification: Connection closed by remote host

#### 详细描述
kex_exchange_identification: Connection closed by remote host
Connection closed by 20.205.243.166 port 22

#### 解决方案

- 检查公钥是否失效
- 是否使用代理软件（TUN模式代理全局），进而导致本地端口号指向放生改变
 - 方案1:切换为远程URL为HTTPS，不使用SSH
 - 方案2:配置文件~/.ssh/config,把端口指向443
``` 
Host github.com
Hostname ssh.github.com
Port 443
 ```