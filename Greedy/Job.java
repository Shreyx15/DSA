package com.company.Greedy;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Job implements Comparator<Job> {
    char job_id;
    int deadline, profit;

    public Job(char job_id, int deadline, int profit) {
        this.job_id = job_id;
        this.deadline = deadline;
        this.profit = profit;
    }

    public Job() {

    }

    @Override
    public int compare(Job o1, Job o2) {
        if(o1.profit > o2.profit) {
            return -1;
        } else if(o2.profit > o1.profit) {
            return 1;
        } else return 0;
    }

    private static void printJobScheduling(ArrayList<Job> jobs, int t) {
        boolean[] result = new boolean[t];
        char[] job = new char[t];
        int n = jobs.size();

        for (int i = 0; i < n; i++) {
            System.out.println(jobs.get(i).profit);
        }

        for (int i = 0; i < n; i++) {

            for (int j
                 = Math.min(t - 1, jobs.get(i).deadline - 1);
                 j >= 0; j--) {
                // Free slot found
                if (!result[j]) {
                    result[j] = true;
                    job[j] = jobs.get(i).job_id;
                    break;
                }
            }
        }

        for (char j :
                job) {
            System.out.println(j + " ");
        }

    }
    public static void main(String[] args) {

        ArrayList<Job> jobs = new ArrayList<Job>();

        jobs.add(new Job('a', 2, 100));
        jobs.add(new Job('b', 1, 19));
        jobs.add(new Job('c', 2, 27));
        jobs.add(new Job('d', 1, 25));
        jobs.add(new Job('e', 3, 15));
        Collections.sort(jobs, new Job());

        System.out.println(
                "Following is maximum profit sequence of jobs");



        // Function call
        printJobScheduling(jobs, 3);
    }


}
