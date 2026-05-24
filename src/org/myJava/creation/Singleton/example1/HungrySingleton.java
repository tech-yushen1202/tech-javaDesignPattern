package org.myJava.creation.Singleton.example1;

/**
 * 饿汉式单例模式
 * 备注：不管需不需要，都事先创建实例，有点浪费内存
 * @author yushen1202
 */
public class HungrySingleton {

	private static HungrySingleton instance = new HungrySingleton();

	/**
	 * 私有化构造函数
	 */
	private HungrySingleton() {
	}

	/**
	 * 静态工厂方法
	 */
	public static HungrySingleton getInstance() {
		return instance;
	}

}