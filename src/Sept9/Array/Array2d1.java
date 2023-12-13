package Sept9.Array;

public class Array2d1 {

        public static void main(String[] args) {

            int[] marks = new int[3];
           // int[] marks2 = {1,2,3};

            int [][] matrix = {

                    {1},
                    {4,5},
                    {7,8,9}
            };
            for (int i = 0; i < matrix.length ; i ++){

                for (int j = 0; j < matrix[i].length; j++){

                    System.out.print(matrix[i][j]+" ");
                }

                System.out.println("");
            }

        }
    }

