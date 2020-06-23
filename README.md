# CommonUtils

## java相关工具类

### CookieUtils

[Cookie值获取与处理](https://github.com/learn666-gif/CommonUtils/blob/master/java/CookieUtils.java)

#### 类方法

- Cookie的值获取: getCookieValue
- Cookie的值设置: setCookie
- Cookie的值删除: deleteCookie
- 设置Cookie的值，并使其在指定时间内生效：doSetCookie
- 得到cookie的域名：getDomainName


### IdWorker

[RabbitMQ工作队列或者竞争消费者模式--work消息模型使用](https://github.com/learn666-gif/CommonUtils/blob/master/java/IdWorker.java)

#### 描述：分布式自增长ID


 *  Twitter的 Snowflake　JAVA实现方案
 * 核心代码为其IdWorker这个类实现，其原理结构如下，我分别用一个0表示一位，用—分割开部分的作用：
 
 ```
1||0---0000000000 0000000000 0000000000 0000000000 0 --- 00000 ---00000 ---000000000000
```
 
* 在上面的字符串中，第一位为未使用（实际上也可作为long的符号位），接下来的41位为毫秒级时间，
* 然后5位datacenter标识位，5位机器ID（并不算标识符，实际是为线程标识），
* 然后12位该毫秒内的当前毫秒内的计数，加起来刚好64位，为一个Long型。
* 这样的好处是，整体上按照时间自增排序，并且整个分布式系统内不会产生ID碰撞（由datacenter和机器ID作区分），
* 并且效率较高，经测试，snowflake每秒能够产生26万ID左右，完全满足需要。
* 64位ID (42(毫秒)+5(机器ID)+5(业务编码)+12(重复累加))

### JsonUtils

[json数据处理方案](https://github.com/learn666-gif/CommonUtils/blob/master/java/JsonUtils.java)

#### 类方法

- 解析Json数据：parse、parseList、parseMap、nativeRead
- json序列化：serialize

### NumberUtils

[数值处理](https://github.com/learn666-gif/CommonUtils/blob/master/java/NumberUtils.java)


## [webpack相关工具类(各种通用属性定义)](https://github.com/learn666-gif/CommonUtils/blob/master/web/%E8%87%AA%E5%AE%9A%E4%B9%89%E7%BB%84%E4%BB%B6%E7%94%A8%E6%B3%95%E6%8C%87%E5%8D%97.md)