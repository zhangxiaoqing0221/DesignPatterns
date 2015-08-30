/**
 * 代理类2--对应UserManagerImpl2类
 * @author xiaoqing
 *
 */
public class StaticProxy2 implements UserManager{  
    private UserManager userManager;  
    public StaticProxy2(UserManagerImpl2 ul)  
    {  
        userManager=ul;  
    }  
    public void addUser(String userId, String userName) {  
        System.out.println("正在进行添加用户前的准备工作,用户id为："+userId+"……");  
        try {  
            userManager.addUser(userId, userName);  
            System.out.println("成功添加用户"+userId+"，正在进行确认处理……");  
        } catch (Exception e) {  
            System.out.println("添加,userId="+userId+"失败！");  
        }  
          
          
    }  
  
    public void delUser(String userId) {  
        // TODO Auto-generated method stub  
    	System.out.println("正在进行添加用户前的准备工作,用户id为："+userId+"……");  
        try {  
            userManager.delUser(userId);
            System.out.println("成功添加用户"+userId+"，正在进行确认处理……");  
        } catch (Exception e) {  
            System.out.println("添加,userId="+userId+"失败！");  
        }  
    }  
  
    public String findUser(String userId) {  
        // TODO Auto-generated method stub  
        return null;  
    }  
  
    public void modifyUser(String userId, String userName) {  
        // TODO Auto-generated method stub  
    }  
}
