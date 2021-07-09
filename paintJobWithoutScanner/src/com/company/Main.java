package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    }

        public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

            if ((width<=0) || (height<=0) || (areaPerBucket<=0) || (extraBuckets<0)){
                return -1;
            }else{
                double area = 0;
                area = width *  height;
                double buckets = Math.ceil(area/areaPerBucket);
                return (int) buckets-extraBuckets;
            }
        }
        public static int getBucketCount(double width, double height, double areaPerBucket){

            if ((width<=0) || (height<=0) || (areaPerBucket<=0)){
                return -1;
            }else{
                double area = 0;
                area = width *  height;
                return (int) Math.ceil(area/areaPerBucket);
            }
        }
        public static int getBucketCount(double area, double areaPerBucket){

            if ((area<=0) || (areaPerBucket<=0)){
                return -1;
            }else{
                double buckets = Math.ceil(area/areaPerBucket);
                return (int) buckets;
            }
        }
    }

