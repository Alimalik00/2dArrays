public class ArrayPractice {
    public static void main(String[] args) {

       int [][] arr1 = {{1,2,3},
                       {4,5,6}};

       int [][] arr2 = {{1,2,3},
                        {4,5,6}};

       int [][] res = new int[2][3];


       for (int i =0; i< arr1.length; i++)
       {
           for(int j =0; j<arr1[i].length; j++)
           {
               res[i][j] = arr1[i][j] + arr2[i][j];

           }
       }

       for(int i=0; i<arr1.length; i++)
       {
           for(int j=0; j<arr1[i].length; j++)
           {
               System.out.print(res[i][j] + " ");
           }
           System.out.println("");
       }


    }
}
