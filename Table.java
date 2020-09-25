public class Table {
    public synchronized void displayTable(int x) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(x + "*" + i + "=" + (x * i));
        }
    }

    class Acon extends Thread {
        Table t;

        public Acon(Table t) {
            this.t = t;
        }

        public void run() {
            t.displayTable(5);
        }
    }

    class Bcon extends Thread {
        Table t;

        public Bcon(Table t) {
            this.t = t;

        }

        public void run() {
            t.displayTable(4);
        }
    }

    class Ccon extends Thread {
        Table t;

        public Ccon(Table t) {
            this.t = t;

        }

        public void run() {
            t.displayTable(2);
        }
    }

    public static void main(String[] args) {
        Table t = new Table();
        Acon t1 = t.new Acon(t);
        Bcon t2 = t.new Bcon(t);
        Ccon t3 = t.new Ccon(t);
        t1.start();
        t2.start();
        t3.start();
    }
    
}