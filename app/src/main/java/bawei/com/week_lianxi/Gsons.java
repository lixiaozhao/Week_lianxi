package bawei.com.week_lianxi;

import com.google.gson.Gson;

/**
 * 类的用途：
 * 时间:  2017/4/10  19:18
 * 姓名:  李照照
 */
public class Gsons {
    public  static Bean addBean(String str,Class<Bean>beanClass){
        Gson gson=new Gson();
        Bean bean = gson.fromJson(str, Bean.class);
        return bean;
    }
}
