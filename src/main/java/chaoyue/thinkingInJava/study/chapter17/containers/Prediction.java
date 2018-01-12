package chaoyue.thinkingInJava.study.chapter17.containers;

import java.util.Random;

public class Prediction {
  private static Random random = new Random(47);
  private boolean shadow = random.nextDouble() > 0.5;
  @Override
  public String toString(){
    if(shadow){
      return "six more weeks of winter";
    }else {
      return "early spring";
    }
  }
}
