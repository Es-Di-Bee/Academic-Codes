import java.util.*;

public class Task3 {

    static int getNextProcess(boolean[] a, int x) {
        int iteration = 0;
        for (int i = x+1;; ++i) {
            if (i == a.length) i = 0;
            if (!a[i]) return i;
            ++iteration;
            if (iteration == a.length) return -1;
        }
    }


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Time Quantum:");
        int quantum = sc.nextInt();
        System.out.println ("Enter no. of process and the burst time\nof the processes sequentially:");
        int n = sc.nextInt(); // n means total number of processes

        int[] pid = new int[n]; // pid means process id
        int[] arrival_time = new int[n];
        int[] burst_time = new int[n]; // this array will be updated every time the process runs for 1 unit time
        int[] bt = new int[n];   // this array is for storing the original burst time which we will use to calculate the waiting time
        int[] runtime = new int[n];
        int[] complete_time = new int[n];
        int[] turnaround_time = new int[n];
        int[] waiting_time = new int[n];
        boolean[] completed_flag = new boolean[n];  // it checks if a process is completed or not

        int sys_time = 0, completed_processes = 0;

        for (int i = 0; i < n; ++i) {
            pid[i] = i+1;
            burst_time[i] = sc.nextInt();
            bt[i] = burst_time[i];
        }

        int next_process = 0;
        while(true) {
            int current_process = n;
            if (completed_processes == n) // if executed process = no. of total processes
                break; // our calculation is finished

            for (int i = next_process; i < n; i++) {
                if (!completed_flag[i]) {
                    if (runtime[i] < quantum) {
                        current_process = i;
                        break;
                    } else {
                        runtime[i] = 0;
                        next_process = getNextProcess(completed_flag, i);
                        if (next_process == -1) break;
                        current_process = next_process;
                    }
                }
            }

            ++sys_time; // in every iteration, system time will increase by 1

            if (current_process != n) {
                runtime[current_process]++;
                --burst_time[current_process]; //  because the current process has run 1 unit time
                if (burst_time[current_process] == 0) { // checking if execution of current process is finished nor not
                    completed_flag[current_process] = true;
                    complete_time[current_process] = sys_time;
                    completed_processes++; // 1 more process completed execution
                    next_process = getNextProcess(completed_flag, current_process);
                    if (next_process == -1) break;
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