public class FizzBuzz{
   static String fizzbuzz(int number){
    if(number%3 == 0 && number%5 ==0){
      return "FizzBuzz";
    } else if(number%5 ==0){
      return "Buzz";
    }else if(number%3 ==0){
      return "Fizz";
    }else {
      return Integer.toString(number);
    }
  }

  public static void main(String[] args){
    for(int i = 1; i <=100; i++){
      System.out.println(fizzbuzz(i));
    }
  }

}
