public class arrays {
    public static void main(String[] args) {

//        Array declaration
//        float[] marks;
//        Memory allocation
//        System.out.println(" marks = new float[5];");
//        marks = new float[5];
//        Initialization
//        marks[0] = 80.f;
//        marks[1] = 90.5f;
//        marks[2] = 99.5f;
//        marks[3] = 80.5f;
//        marks[4] = 77.5f;
//        System.out.println(marks[2]);
//
//
//        Declaration + memory allocation
//        int[] numbers = new int[5];
//        numbers[0] = 10;
//        numbers[1] = 20;
//        numbers[2] = 30;
//        numbers[3] = 40;
//        numbers[4] = 50;
//        System.out.println(numbers[3]);



//        String[] names = {"laraib","akash","gull","arooj","muntaha"};
//        System.out.println(names.length);


//        Displaying 1-D array using naive method
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//        System.out.println(names[3]);
//        System.out.println(names[4]);


//        Displaying 1-D array using for loop
//        for (int i = 0 ; i < names.length ; i++){
//            System.out.println(names[i]);
//        }

//    Displaying I-D array elements using for each loop
//        for(String elements: names){
//            System.out.println(elements);
//        }



//        Multidimensional arrays
        int[][] flats = new int[3][4];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[0][3] = 104;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        flats[1][3] = 204;
        flats[2][0] = 301;
        flats[2][1] = 302;
        flats[2][2] = 303;
        flats[2][3] = 304;
//        System.out.println(flats[0][3]);


//        Printing 2-D array using for loop
        for (int i =0; i< flats.length;i++){
            for (int j = 0 ; j< flats[i].length;j++){
                System.out.print(flats[i][j]+" ");
            }
            System.out.println();
        }


    }
}
