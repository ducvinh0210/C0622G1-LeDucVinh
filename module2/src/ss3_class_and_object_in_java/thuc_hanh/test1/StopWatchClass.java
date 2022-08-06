package ss3_class_and_object_in_java.thuc_hanh.test1;

//Viết thuật toán sắp xếp các phần tử tử bé đến lớn trong 1 mảng


public class StopWatchClass {
    public static void main(String[] args) {
        int[] a = {9, 3, 4};
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length -1; j++) {
                if(a[j]>a[j +1]){
                    int tmp = a[j];
                    a[j]=a[j+1];
                    a[j+1]= tmp;
                }
            }

        }

        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);

        }

    }
}
