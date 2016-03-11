class RaiseNum {
    int raise() {
      int total=0;
      for(int i=0; i<=100; i++){
        total += i*i;
      }
      return total;
  }
}

class Addsquare {
  int square() {
    int total=0;
    for(int i=0; i<=100; i++){
      total += i;
    }
    return total*total;
  }
}

class euler06 {
    public static void main(String[] args) {
      RaiseNum sumSquare = new RaiseNum();
      Addsquare addSquare = new Addsquare();
      int result = addSquare.square() - sumSquare.raise();
      System.out.println(result);
  }
}
