/**
 * 静态代理的问题：每个方法都要添加重复的处理代码；
 * 并且若想要为多个类实现代理，则需要建立多个代理类（一个类对应一个代理（根据代理模式的定义））
 * @author xiaoqing
 *
 */
public class Client {

	public static void main(String[] args) {

		UserManager userManager = new StaticProxy(new UserManagerImpl());
		// 问题1： 在addUser中和delUser中有重复代码
		userManager.addUser("0001", "张三");
		userManager.delUser("001");

		// 问题2： 需要为每一个类建立一个代理类
		userManager = new StaticProxy2(new UserManagerImpl2());
		userManager.addUser("0001", "张三");
		userManager.delUser("001");

	}

}
