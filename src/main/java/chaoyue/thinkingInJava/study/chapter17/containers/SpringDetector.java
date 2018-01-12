package chaoyue.thinkingInJava.study.chapter17.containers;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class SpringDetector {
  public static <T extends Groundhog> void detectSpring(Class<T> type) throws Exception {
    Constructor<T> ghog = type.getConstructor(int.class);
    Map<Groundhog, Prediction> map = new HashMap<>();
    for (int i = 0; i < 3; i++) {
      Groundhog key = ghog.newInstance(i);
      map.put(key, new Prediction());
      System.out.println("map = "+ map);
      Groundhog gh = ghog.newInstance(3);
      System.out.println("looking up prediction for "+ gh);
      // Collection.contains 使用equals方法进行比较
      System.out.println("~~~~~~~~~~~~~~~~~~" + key.equals(gh));
      if(map.containsKey(gh)){
        System.out.println("!!!!!!!!!!!!!!!!!!" + map.get(gh));
      }else {
        System.out.println("key not found " + gh);
      }
    }
  }

  public static void main(String[] args) throws Exception {
    System.out.println("-----------------groundhog--------------");
    detectSpring(Groundhog.class);
//    System.out.println("-----------------groundhog2--------------");
//    detectSpring(Groundhog2.class);
  }
}
