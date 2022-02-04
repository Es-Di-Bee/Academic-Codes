import java.util.*;

public class Task1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter no. of process and the arrival time and\nburst time of the processes sequentially:");
        int n = sc.nextInt(); // n means total number of processes

        int[] pid = new int[n]; // pid means process id
        int[] arrival_time = new int[n];
        int[] burst_time = new int[n]; // this array will be updated every time the process runs for 1 unit time
        int[] bt = new int[n];   // this array is for storing the original burst time which we will use to calculate the waiting time
        int[] complete_time = new int[n];
        int[] turnaround_time = new int[n];
        int[] waiting_time = new int[n];
        boolean[] completed_flag = new boolean[n];  // it checks if a process is completed or not

        int sys_time = 0, completed_processes = 0;

        for (int i = 0; i < n; ++i) {
            pid[i] = i+1;
            arrival_time[i] = sc.nextInt();
            burst_time[i] = sc.nextInt();
            bt[i] = burst_time[i];
        }

        while(true) {
            int current_process = n, min_burst = 999;

            if (completed_processes == n) // if executed process = no. of total processes
                break; // our calculation is finished

            for (int i = 0; i < n; i++) {
                if (arrival_time[i] <= sys_time
                        && !completed_flag[i]
                        && burst_time[i] < min_burst) {
                    current_process = i;
                    min_burst = burst_time[i]; // always updating the lowest burst time
                }
            }

            ++sys_time; // in every iteration, system time will increase by 1

            if (current_process != n) {
                --burst_time[current_process]; //  because the current process has run 1 unit time
                if (burst_time[current_process] == 0) { // checking if execution of current process is finished nor not
                    completed_flag[current_process] = true;
                    complete_time[current_process] = sys_time;
                    completed_processes++; // 1 more process completed execution
                }
            }
        }

        double avg_turnaround_time = 0.0, avg_waiting_time = 0.0;

        for (int i = 0; i < n; ++i) {
            turnaround_time[i] = complete_time[i] - arrival_time[i];
            waiting_time[i] = turnaround_time[i] - bt[i];
            avg_turnaround_time += turnaround_time[i];
            avg_waiting_time += waiting_time[i];
        }

        for (int i = 0; i < n; ++i) {
            System.out.println("\nProcess " + (i+1));
            System.out.println("Completion Time: " + complete_time[i]);
            System.out.println("Turnaround Time: " + turnaround_time[i]);
            System.out.println("Waiting Time: " + waiting_time[i]);
        }

        System.out.println("\nAverage Turnaround Time: " + (avg_turnaround_time/n));
        System.out.println("Average Waiting Time: " + (avg_waiting_time/n));
    }
}