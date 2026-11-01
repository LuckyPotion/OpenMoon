package recovery.source;

/** Exact JVM scalar comparison and array-store helpers; no application startup. */
public final class CarrierOps {
  private CarrierOps() {}
  public static int lcmp(long a,long b){return a>b?1:a==b?0:-1;}
  public static int fcmpl(float a,float b){return a>b?1:a==b?0:-1;}
  public static int fcmpg(float a,float b){return a<b?-1:a==b?0:1;}
  public static int dcmpl(double a,double b){return a>b?1:a==b?0:-1;}
  public static int dcmpg(double a,double b){return a<b?-1:a==b?0:1;}
  public static void discard(boolean a){}
  public static void discard(byte a){}
  public static void discard(char a){}
  public static void discard(short a){}
  public static void discard(int a){}
  public static void discard(long a){}
  public static void discard(float a){}
  public static void discard(double a){}
  public static void discard(Object a){}
  public static <A> A[] store(A[] array,int index,A value){array[index]=value;return array;}
}
