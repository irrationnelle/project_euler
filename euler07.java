class Calc {
    int devideTo20(int num) {
      int initNum=num;
      while(true) {
        for(int i=1; i<=20; i++){
          if(initNum % i != 0) {
            break;
          }
          if(i==20){
              return initNum;
          }
        }
        initNum++;
      }
  }
}

class euler07 {
  public static void main(String[] args) {
    Calc c = new Calc();
    int result = c.devideTo20(2520);
    System.out.println(result);
  }
}
