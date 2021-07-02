public class Clock {
        private int hours = 0;
        private int minutes  = 0;
        private int  seconds = 0;
        public static int count = 1; 
        public Clock() {
                this.hours = 12;
                if (count == 1) {
                    hours  = 0;
                    ++count;
                }
                this.minutes = 0;
                this.seconds = 0;
        }
        public Clock(int h, int m, int s) {
                this.hours = h;
                this.minutes = m;
                this.seconds = s;
        }
        public Clock(int s) {
            setClock(s);
        }
        public void setClock(int s) {
            this.hours = s / 3600;
            s %= 3600;
            this.minutes = s / 60;
            s %= 60;
            this.seconds = s;
        }
        public int getHours() {
                return this.hours;
        }
        public int getMinutes() {
                return this.minutes;
        }
        public int getSeconds() {
                return this.seconds;
        }
        public void setHours(int h) {
                this.hours = h;
        }
        public void setMinutes(int m) {
                this.minutes = m;
        }
        public void setSeconds(int s) {
                this.seconds = s;
        }
        public void tick() {
            int seconds = (this.hours*3600) + (this.minutes*60) + this.seconds;
            setClock(seconds + 1);
        }
        public void addClock(Clock c) {
            int firstSeconds = (c.hours*3600) + (c.minutes*60) + c.seconds;
            int secondSeconds = (this.hours*3600) + (this.minutes*60) + this.seconds;
            int totalSeconds = firstSeconds + secondSeconds;
            setClock(totalSeconds);
        }
        public String toString() {
             return String.format("%02d:%02d:%02d", this.hours, this.minutes, this.seconds);
        }
        public void tickDown() {
            int seconds = (this.hours*3600) + (this.minutes*60) + this.seconds;
            setClock(seconds + 1);
        }
        public Clock subtractClock(Clock c) {
            int firstSeconds = (c.hours*3600) + (c.minutes*60) + c.seconds;
            int secondSeconds = (this.hours*3600) + (this.minutes*60) + this.seconds;
            int dif = Math.abs(firstSeconds - secondSeconds);
            Clock temp = new Clock(dif);
            return temp;
        }
}