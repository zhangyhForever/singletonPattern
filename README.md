# 单例模式：私有化属性、构造方法，提供全局方法来获得对象
## 1）饿汉式单例：
#### 类加载的时候就初始化一个对象，在需要大量单例对象的时候比较占内存。
## 2）懒汉式单例
### 2.1）简单懒汉式单例：在全局方法中初始化对象
#### 缺点：多线程环境下会破坏单例
### 2.2）懒汉式单例（双重检查锁）：在全局方法中加锁（synchronized），加锁前后做非空判断。
### 2.3）静态内部类单例：由静态内部类创建对象，由全局方法返回该内部类中的实例。（利用内部类的特性以及jvm底层的执行逻辑避免线程安全问题）
## 3）注册式单例：适用于单例集合，将创建的对象（工厂模式）放入集合中（注册，key为类名.class,value为对象实例），使用时从集合中取，有则直接返回具体对象，没有则新建对象并注册到集合中。
## 4）序列化攻击：将单例对象序列化至磁盘，然后在从磁盘反序列化成对象，会破坏单例。
#### 解决办法：单例对象中重写readResolve()方法将已有单例对象返回。
#### 原理：对象依然时被创建了两次，但在jvm底层会运行重写后的readResolve（）方法，第二次创建的对象会被GC回收。
## 单例模式需要考虑到反射攻击、线程安全问题，建议使用枚举类型（enum）来实现单例，枚举类型在jvm底层避免了以上问题。
