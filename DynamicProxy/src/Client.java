/**
 * 动态代理，使用反射，只需写一个代理类，
 * 并且通过统一的invoke方法，统一了代理类对原方法的处理过程，减少重复性代码	
 * @author xiaoqing
 *
 */
public class Client {

	public static void main(String[] args) {
		DynamicProxy proxy = new DynamicProxy();
		UserManager userManager= (UserManager)proxy.newProxyInstance(new UserManagerImpl());
		userManager.addUser("0001", "张三");  
        userManager.delUser("001");
       
        userManager=(UserManager)proxy.newProxyInstance(new UserManagerImpl2());
        userManager.addUser("0001", "张三");  
        userManager.delUser("001");
       
       
		           
		
	}

}
