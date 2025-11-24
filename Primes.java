public class Primes {
    public static void main(String[] args) {
      boolean[] arr = new boolean[Integer.parseInt(args[0])+1];
      for(int i = 2; i < arr.length; i++){
        arr[i] = true;
      }
      //איתחלתי הכל לטרו חוץ מ1 ו2
      int i = 2;
      while(i <= Math.sqrt(arr.length)){
        if(arr[i]== true){
            for(int j = 2; i*j < arr.length; j++){
                arr[i*j] = false;
            }
        }
        i++;
      }
      //פה בעצם סיימתי לשים לכולם ערך בוליאני מתאים

      System.out.println("Prime numbers up to " + args[0] + ":");
      int counter = 0;
      for(i = 2; i<arr.length; i++){
        if(arr[i]==true){
          System.out.println(i);
          counter++;
        }
        
        }
        double x = counter/Double.parseDouble(args[0]) * 100;
        int present = (int) x;
 
      System.out.print("There are " + counter+ " primes between 2 and " + args[0] );
      System.out.println(" ("+ present+ "%" +  " are primes)");
    }
}