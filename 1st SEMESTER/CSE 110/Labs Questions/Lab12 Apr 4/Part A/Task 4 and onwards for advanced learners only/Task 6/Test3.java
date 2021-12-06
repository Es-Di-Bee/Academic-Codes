//****************************************************************************
//Run the methodA() on an Instance of Test3 five times and explain the answer.
//****************************************************************************
public class Test3{
  public int sum;
  public int y;

  public void methodA(){
    int x=2, y =3;
    int [] msg = new int[1];
    msg[0] = 3;
    y = this.y + msg[0]; // "this." is used for referring to the instance variable y of this class 
    methodB(msg, msg[0]);
    x = this.y + msg[0];
    sum = x + y + msg[0];
    System.out.println(x + " " + y+ " " + sum);
  }
  private void methodB(int [] mg2, int mg1){
    int x = 0;
    y = y + mg2[0];
    x = x + 33 + mg1;
    sum = sum + x + y;
    mg2[0] = y + mg1;  /* changing the value of an index of an array in one method also changes the value of the index of the array
      which it is equals to in another method. so here changing mg2[0] changes msg[0] , and it's because of line 13 */
    mg1 = mg1 + x + 2;
    System.out.println(x + " " + y+ " " + sum);
  }
}

//*******************************************************

