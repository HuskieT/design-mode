package json;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author linfei
 * @Date 2019/3/28 16:45
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        List<User> list = new ArrayList<User>();
        for (int i = 0; i <10 ; i++) {
            User user = new User();
            user.setId(i);
            if(i>=5){
                user.setName("chris");
            }else {
                user.setName("chris"+i);
            }
            user.setAge(Math.random()*10);
            list.add(user);
        }

        Map<String ,List<User>> map = list.stream().collect(Collectors.groupingBy(User::getName));
        map.keySet().stream().forEach(System.out::println);
    }
}
