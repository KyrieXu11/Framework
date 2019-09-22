# Framework

## 使用了三层架构的方式
### Model层(Enities层)
实体层和数据库进行映射

### Dao层
最接近数据库的一层，和数据库进行数据传输，定义一个接口，然后在该层实现业务代码

### Service层
在**Controller**层和**Dao**层之间，属于一个转换的功能，没有复杂的业务逻辑代码

### Controller层
控制器层，控制请求的链接，返回对应的处理结果。

### Mapper层
持久层，使用SpringBoot-MyBatis书写SQL语句来操作数据库。





### JSON的一些注解
1. `@Jsonproperties`的作用是给属性起一个别名，如果使用了这个注解那前端传回来的参数必须使用这个别名传回来。
2. `@Jsonignore`在传值的时候自动忽略加上这个注解的属性，传回来为空。
3. `@JsonPropertyOrder`改变传值到前端的值的顺序。





### @Responsebody和@RestController的作用

对`json`格式的数据的响应。

1. `@Responsebody`的作用是用于接收和响应序列化数据（JSON），可以支持嵌套JSON数据结构。
2. `@RestController`它有两层含义：
   * 作为控制器注入到Spring上下文环境。
   * 请求响应为数据序列化（默认序列化方式是JSON），而不是跳转到html或模板页面。