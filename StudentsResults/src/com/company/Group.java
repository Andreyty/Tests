package com.company;

public class Group {

    int sum=0;
    double average=0;

    String bestStudent, worstStudent;
    int bestMark, worstMark;
    int indexMax, indexMin;

    String group[] = new String[5];
    int marks[]=new int[5];

        void createGroup(){
            Student st=new Student();


            //
            for(int i=0;i<5;i++){
                group[i]=st.getStudent();
                marks[i]=st.getMark();
            }

            indexMax=0;
            indexMin=0;
            for (int i = 0; i < marks.length; i++) {
                if(marks[i] > marks[indexMax]){
                    indexMax=i;
                }
                else if(marks[i]<marks[indexMin]){
                    indexMin=i;
                }

            }
        }

        double groupAverage(){
            for (int i=0;i<5;i++) {
                sum = sum + marks[i];
            }
            average=(double)sum/5;
            return(average);
        }

        String getBestStudent(){
            bestStudent=group[indexMax];
            return bestStudent;
        }

        String getWorstStudent(){
            worstStudent=group[indexMin];
            return worstStudent;
        }

        int getBestMark(){
            bestMark=marks[indexMax];
            return bestMark;
        }

        int getWorstMark(){
            worstMark=marks[indexMin];
            return worstMark;
        }


    }
