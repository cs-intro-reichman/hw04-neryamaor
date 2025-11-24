public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        char[] arr = new char[str.length()];
        for(int i=0;i<arr.length;i++){
            arr[i] = str.charAt(i);
            if (arr[i] >='A' && arr[i]<='Z'){
                arr[i] += 32;
            }
        }
        return new String(arr);
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
                char[] arr1 = new char[str1.length()];
                char[] arr2 = new char[str2.length()];
                if(arr2.length > arr1.length){
                    return false;
                }
                for(int i = 0;i<arr1.length;i++){
                    arr1[i] = str1.charAt(i);
                }
                for(int i = 0;i<arr2.length;i++){
                    arr2[i] = str2.charAt(i);
                }
                //עכשיו יש לנו 2 מערכים שהראשון גדול שווה מהשני
                int counter = 0;//סופר את האותיות ששוות ומחכה להגיע לגודל מערך2
                int index =0;
                 for(int i=0;i<arr1.length;i++){
                    for(int j = 0;j<arr2.length;j++){
                        if(arr1[i]==arr2[index]){
                           counter++;
                           index++;
                           break;
                           }else{ 
                            counter=0;//מאפס ספירה
                            index=0;//מאפס מחדש את מערך2
                        }
                        }
                        if(counter == arr2.length){
                            return true;
                        }
                    }
        return false;
    }
}
