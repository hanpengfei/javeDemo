package com.hpf.demo.sort;

/**
 * Created by hanpengfei on 2016/3/3.
 */
public class Sort {
    public static void main(String[] args) {
        int[] a = {8,3, 1, 2, 5, 4};
        Sort sort = new Sort();
//        sort.bubbleSort(a);
//        sort.quickSort(a,0,a.length-1);
        sort.chooseSort(a);
        sort.print(a);
    }

    /**
     * 冒泡排序
     * @param a
     */
    private void bubbleSort(int[] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            print(a);
        }
    }

    /**
     * 快速排序
     * @param a
     */
    public  void quickSort(int[] a,int left,int right){
        int key =a[left];
        int l=left;
        int r=right;
        while(l<r){
            while(r>l&&a[r]>=key){
                r--;
            }
            if(l<r){
                int temp=a[r];
                a[r]=a[l];
                a[l]=temp;
            }
            while(l<r&&a[l]<=key){
                l++;
            }
            if(l<r){
                int temp=a[r];
                a[r]=a[l];
                a[l]=temp;
            }
        }
        print(a);
        if(l>left) quickSort(a,left,l-1);
        if(r<right)quickSort(a,r+1,right);
    }

    /**
     * 选择排序
     * @param a
     */
    public void chooseSort(int[] a){

        for(int i=0;i<a.length;i++){
            int index=i;
            for(int j=i;j<a.length;j++){
                if(a[index]>a[j]){
                    index=j;
                }
            }
            if(i!=index){
                int temp=a[i];
                a[i]=a[index];
                a[index]=temp;
            }
            print(a);
        }
    }
    public void insertSort(int[] a){

    }
    private void print(int[] a){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+",");
        }
        System.out.print("\n");
    }
}
