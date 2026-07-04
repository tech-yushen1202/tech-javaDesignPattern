package org.tech.creation.Singleton.example2;

/**
 * 懒汉式单例模式
 * 备注：懒汉式的实现是线程安全的，这样会降低整个访问的速度，而且每次都要判断。
 */
public class LazySingleton {

	private static LazySingleton instance = null;

	/**
	 * 私有化构造函数
	 */
	private LazySingleton() {
	}

	/**
	 * 静态工厂方法
	 */
	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}