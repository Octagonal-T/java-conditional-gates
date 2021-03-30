public class Main {

  public static boolean and(boolean a, boolean b){
    return a && b;
  }
  public static boolean or(boolean a, boolean b){
    return a || b;
  }
  public static boolean not(boolean a){
    return !a;
  }
  public static boolean nand(boolean a, boolean b){
    return !(a && b);
  }
  public static boolean nor(boolean a, boolean b){
    return !(a||b);
  }
  public static boolean xor(boolean a, boolean b){
    return !a && !b;
  }
  public static boolean xnor(boolean a, boolean b){
    return (a&&b)||(!a&&!b);
  }

  public static void main(String[] args){
    assert and(true, true);
    assert or(true, false);
    assert not(false);
    assert nand(false, true);
    assert nor(false, false);
    assert xor(true, false);
    assert xnor(true, true);
  }
}
